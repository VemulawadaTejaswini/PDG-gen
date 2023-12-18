import java.util.Scanner;

public class Main {
    static long[] fac = new long[1000003];
    static long[] finv = new long[1000003];
    static long[] inv = new long[1000003];
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a  = sc.nextInt();
        int b = sc.nextInt();

        long aa = 1;
        long bb = 1;
        //前処理
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 1000003; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
        for (int i = 0 ; i < a ; i++) {
            aa *= (long) (n - i) % MOD;
            aa %= MOD;
        }
        for (int i = 0 ; i < b ; i++) {
            bb *= (long) (n - i) % MOD;
            bb %= MOD;
        }

        aa *= finv[a] % MOD;
        bb *= finv[b] % MOD;
        aa %= MOD;
        bb %= MOD;
        long ans = pow (2, n) - 1 - aa - bb;
        System.out.println((ans + MOD) % MOD);
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