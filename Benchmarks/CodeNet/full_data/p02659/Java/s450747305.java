import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        double d=sc.nextDouble();
        long an=a/100;
        long aa=(long)(d*100);
        long as=a%100;
        as=aa*as;
        System.out.println(an*aa+as/100);
    }
}
