import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long lcm = lcm(c, d);
        long e = b - a;
        long f = e / c;
        long g = e / d;
        long h = e / lcm;
        long ans = e - f - g + h;
        System.out.println(ans);
    }

    public static final long lcm(final long a, final long b) {
        return a * b / gcd(a, b);
    }

    public static final long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}