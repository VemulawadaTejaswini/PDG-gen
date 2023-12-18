import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long lcm = lcm(c, d);

        long start = (a - 1) / lcm;
        long startc = (a - 1) / c;
        long startd = (a - 1) / d;

        long end = 0;
        long endc = 0;
        long endd = 0;


        end = b / lcm;
        endc = b / c;
        endd = b / d;

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