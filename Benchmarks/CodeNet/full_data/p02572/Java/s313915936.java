import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            sum += temp;
            sum %= MOD;
        }
        long ans = sum * sum % MOD;
        for (int i = 0; i < n; i++) {
            ans = (ans - (a[i] * a[i] % MOD) + MOD) % MOD;
            ans %= MOD;
        }
        System.out.println(divide(ans, 2));
    }

    private static long multiply(long a, long b) {
        return (((long) a * b) % MOD);
    }

    private static long divide(long a, int b) {
        return multiply(a, pow(b, MOD - 2));
    }

    private static long pow(int n, int k) {
        if (k == 0) {
            return 1;
        } else if (k % 2 == 0) {
            long p = pow(n, k / 2);
            return multiply(p, p);
        } else {
            long p = pow(n, (k - 1) / 2);
            return multiply(multiply(p, p), n);
        }
    }
}