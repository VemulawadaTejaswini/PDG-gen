import java.util.*;
import java.lang.*;
public class temp{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  =sc.nextInt();
        
        if((Math.abs(b/a-c/a) > 0) || b == c)
            System.out.println("OK");
        else
            System.out.println("NG");
     }
}