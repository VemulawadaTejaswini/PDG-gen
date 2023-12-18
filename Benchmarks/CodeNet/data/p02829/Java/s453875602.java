import java.util.*;

public class Template{
    public  static void  main(String... args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println((a^b^(1^2^3)));
    }
}