import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());

        long n = b - a + 1;
        long cc = (b / c) - (a / c);
        long dd = (b / d) - (a / d);
        long cd = (b / lcm(c, d)) - (a / lcm(c, d));

        System.out.println(n - cc - dd + cd);

    }

    static long gcd(long a, long b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
