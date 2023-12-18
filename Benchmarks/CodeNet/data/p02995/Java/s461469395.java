import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long sum = 0;
        sum += b / c + b / d - b / lcm(c, d);
        sum -= (a - 1) / c + (a - 1) / d - (a - 1) / lcm(c, d);
        System.out.println((b - a + 1) - sum);
    }

    static long lcm(long a, long b) {
        long gcd = gcd(a, b);
        return a / gcd * b;
    }

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
