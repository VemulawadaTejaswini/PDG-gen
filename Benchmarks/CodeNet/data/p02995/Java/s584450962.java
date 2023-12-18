import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ans = b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm(c, d) - (a - 1) / lcm(c, d));
        System.out.println(b - a + 1 - ans);
    }

    static long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

    static long gcd(long x, long y) {
        if (x < y)
            return gcd(y, x);
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}
