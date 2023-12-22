import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long c = (long)(b * 100);
        long d = a * c;
        d /= 100;
        System.out.println(d);
    }
}
