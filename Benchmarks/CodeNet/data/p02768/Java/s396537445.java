import java.util.Scanner;

public class Main {

    private static final long MOD = 1000000007;

    private static long nume(long n, long a) {
        long x = 1;
        for (long i = n - a + 1; i <= n; i++) {
            x = (x * i) % MOD;
        }
        return x;
    }

    private static long deno(long a) {
        long y = 1;
        for (long i = 1; i <= a; i++) {
            y = (y * i) % MOD;
        }
        return y;
    }

    public static long modpow(long x, long n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % MOD;
            }
            x = (x * x) % MOD;
            n >>= 1;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int b = sc.nextInt();

        long total = modpow(2, n) % MOD;
        long ya = deno(a);
        long yb = deno(b);
        long nca = nume(n, a) * modpow(ya, MOD - 2) % MOD;
        long ncb = nume(n, b) * modpow(yb, MOD - 2) % MOD;

        long ans = (total - 1 - nca - ncb + 2 * MOD) % MOD;
        System.out.println(ans);
    }

}
