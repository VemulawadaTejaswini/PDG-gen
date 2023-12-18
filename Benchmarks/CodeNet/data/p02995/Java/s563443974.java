import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long lcm = lcm(c, d);

        long start = 0;
        long startc = 0;
        long startd = 0;

        if (a % lcm == 0) {
            start = a / lcm;
        } else {
            start = a / lcm + 1;
        }
        if (a % c == 0) {
            startc = a / c;
        } else {
            startc = a / c + 1;
        }
        if (a % d == 0) {
            startd = a / d;
        } else {
            startd = a / d + 1;
        }

        long end = 0;
        long endc = 0;
        long endd = 0;


        end = b / lcm + 1;
        endc = b / c + 1;
        endd = b / d + 1;

        int sum = (int) (end - start);
        int sumc = (int) (endc - startc);
        int sumd = (int) (endd - startd);

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