import java.util.*;

public class NewClass4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        int mul=a*b;
        int sub=a-b;
        int res=Math.max(Math.max(add, sub), mul);
        System.out.println(res);
    }    
       
}