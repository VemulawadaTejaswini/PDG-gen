import java.util.Scanner;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long lcm = c * d / gcd(c, d);
        System.out.println(lcm);

        System.out
                .println(b - a + 1 - (b / c) - (b / d) + ((a - 1) / c) + ((a - 1) / d) + ((b / lcm) - ((a - 1) / lcm)));
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}