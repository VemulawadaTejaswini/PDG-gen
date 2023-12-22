import java.util.Scanner;

public class Main {

    static long[] fac = new long[1000003];
    static long[] finv = new long[1000003];
    static long[] inv = new long[1000003];
    static final int MOD = 998244353;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 1000003; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
        long ans = 0;
        for (int i = 0 ; i <= k ; i++) {
            long c = comb(n - 1, i) % MOD;
            c %= MOD;
            c *= m;
            c %= MOD;
            c *= pow(m - 1, n - i - 1) % MOD;
            c %= MOD;
            ans += c % MOD;
        }
        System.out.println(ans % MOD);


    }

    static long comb(int n, int k) {
        if (n < k)
            return 0;
        if (n < 0 || k < 0)
            return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    static int pow (long b, int e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1) {
                ans = ans * b % MOD;
            }
            e >>= 1;
            b = b * b % MOD;
        }
        return (int) ans;
    }

}