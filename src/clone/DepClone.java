package clone;

/**
 * @author: 丢了风筝的线
 * @Date: 2020/6/20-06-20-14:36
 * @Description:java的克隆默认是浅克隆
 * 浅克隆指的是：复制出来的对象与原来的对象只是具有相同的数据，而地址不同
 */
public class DepClone {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setId(1);
        user1.setName("张三");
        user1.setAge(23);

        try {
            User clone = (User)user1.clone();

            System.out.println(user1 == clone);
            System.out.println(clone.getId());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}


class User implements Cloneable{
    private Integer id;
    private String name;
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
