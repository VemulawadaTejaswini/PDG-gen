import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] t = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = Long.parseLong(sc.next());
        }

        long res = 1;
        for (int i = 0; i < n; i++) {
            res = lcm(res, t[i]);
        }

        System.out.println(res);
    }

    private static long gcd(long a, long b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    private static long lcm(long a, long b) {
        long g = gcd(a, b);
        return a / g * b;
    }
}
