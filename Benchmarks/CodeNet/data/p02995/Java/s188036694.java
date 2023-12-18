import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long a = scanner.nextLong() - 1;
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long e = lcm(c, d);
        System.out.println((b - a) - (b / c - a / c) - (b / d - a / d) + (b / e - a / e));
    }

    static long gcd(long a, long b) {
        return 0 < b ? gcd(b, a % b) : a;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}