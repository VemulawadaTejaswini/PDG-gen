import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long start = f(a-1,c,d);
        long end = f(b,c,d);

        System.out.print(end -start);
    }

    public static long f(long a, long b, long c) {
        long result = a;
        result -= a / b;
        result -= a / c;
        result += a / lcm(b, c);
        return result;
    }

    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}