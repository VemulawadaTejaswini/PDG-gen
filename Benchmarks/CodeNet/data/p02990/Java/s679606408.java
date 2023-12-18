
import java.util.Scanner;

public class Main {

    static long[] fac = new long[100003];
    static long[] finv = new long[100003];
    static long[] inv = new long[100003];
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        //前処理
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2 ; i < 100003 ; i++ ) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }

        for (int i = 1 ; i <= k ; i++) {
            System.out.println(comb(n - k + 1 , i) * comb(k - 1, i - 1) % MOD);
        }

    }

    static long comb (int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

}