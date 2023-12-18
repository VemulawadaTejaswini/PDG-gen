import java.util.Scanner;

public class Main {

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long lcm = lcm(c, d);
        long ans = b - a + 1
                - (b / c - (a - 1) / c)
                - (b / d - (a - 1) / d)
                + (b / lcm - (a - 1) / lcm);
        System.out.println(ans);
    }

}
