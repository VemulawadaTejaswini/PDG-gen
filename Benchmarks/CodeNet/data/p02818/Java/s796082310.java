import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if (k > a) {
            b = Math.max(0, b - (k - a));
            a = 0;
        } else {
            a -= k;
        }
        System.out.println(a + " " + b);
    }
}
