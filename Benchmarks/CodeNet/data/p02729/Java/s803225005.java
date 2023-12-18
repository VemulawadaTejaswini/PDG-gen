import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scaanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println( (n*(n-1))/2+(m*(m-1))/2 );
    }
}