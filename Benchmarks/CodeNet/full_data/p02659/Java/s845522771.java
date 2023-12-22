import java.util.*;
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a;
        double b;
        a = sc.nextLong();
        b = sc.nextDouble();
        double ans = a*b;
        long x = (long)ans;
        System.out.println(x);
    }
}