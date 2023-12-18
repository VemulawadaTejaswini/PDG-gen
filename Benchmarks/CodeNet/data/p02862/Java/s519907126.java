
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int X;
        int Y;
        int E = 1000000007;

        try (Scanner sc = new Scanner(System.in)) {
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        int x = 2 * Y - X;
        if (x % 3 != 0) {
            System.out.println(0);
            return;
        }
        x = x / 3;
        Combination com = new Combination();
        com.COMinit();
        System.out.println(com.COM(x + ((X-x)/2),x));

    }

    public static class Combination {


        static int MAX = 1000_000;
        static int MOD = 1000_000_007;
        static long fac[] = new long[MAX];
        static long finv[] = new long[MAX];
        static long inv[] = new long[MAX];

        public static void COMinit() {
            fac[0] = fac[1] = 1;
            finv[0] = finv[1] = 1;
            inv[1] = 1;
            for (int i = 2; i < MAX; i++) {
                fac[i] = fac[i - 1] * i % MOD;
                inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
                finv[i] = finv[i - 1] * inv[i] % MOD;
            }
        }

        // 二項係数計算
        public static int COM(int n, int k) {
            if (n < k)
                return 0;
            if (n < 0 || k < 0)
                return 0;
            return (int) (fac[n] * (finv[k] * finv[n - k] % MOD) % MOD);
        }
    }

}
