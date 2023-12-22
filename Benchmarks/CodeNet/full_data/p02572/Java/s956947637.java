import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                ans += a[i] * a[j] % MOD;
                ans %= MOD;
            }
        }
//        long ans = (modPow(2, n) - 1) % MOD;
//        ans -= comb(n, a);
//        if (ans < 0) {
//            ans += MOD;
//        }
//        ans -= comb(n, b);
//        if (ans < 0) {
//            ans += MOD;
//        }
        System.out.println(ans);
    }

    private static int modPow(int n, int p) {
        long res = 1;
        long a = n;
        for (a %= MOD; p > 0; a = a * a % MOD, p >>= 1) {
            if ((p & 1) > 0) {
                res = res * a % MOD;
            }
        }
        return (int) res;
    }

    private static long modPow(long n, int p) {
        long res = 1;
        long a = n;
        for (a %= MOD; p > 0; a = a * a % MOD, p >>= 1) {
            if ((p & 1) > 0) {
                res = res * a % MOD;
            }
        }
        return res;
    }

    private static long modInv(long a) {
        return modPow(a, MOD - 2);
    }

    private static long comb(long n, long r) {
        long ret = 1;
        for (long i = 0; i < r; i++) {
            ret *= n - i;
            ret %= MOD;
            ret *= modInv(i + 1);
            ret %= MOD;
        }
        return ret;
    }
}