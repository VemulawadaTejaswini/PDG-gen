import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long lcm = lcm(c, d);

        long start = a / lcm * lcm;
        long startc = a / c * c;
        long startd = a / d * d;
        if (start < a) start+=lcm;
        if (startc < a) startc+=c;
        if (startd < a) startd+=d;

        int sum = 0;
        int sumc = 0;
        int sumd = 0;

        for (long i = start; i <= b; i += lcm) {
            sum++;
        }
        for (long i = startc; i <= b; i += c) {
            sumc++;
        }
        for (long i = startd; i <= b; i += d) {
            sumd++;
        }

        System.out.print(b - a + 1 - sumc - sumd + sum);
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