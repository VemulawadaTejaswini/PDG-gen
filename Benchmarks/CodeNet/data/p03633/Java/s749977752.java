import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long t[] = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextLong();
        }

        long ans = 1L;
        for (int i = 0; i < n; i++) {
            ans = lcm(ans, t[i]);
        }

        System.out.println(ans);
    }

    static long gcd(long a, long b) {
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}