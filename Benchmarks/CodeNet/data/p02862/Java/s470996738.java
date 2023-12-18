import java.util.Scanner;

public class Main {

    private static final int MOD = 1000000007;
    private static long[] fac = new long[1000000];
    private static long[] finv = new long[1000000];
    private static long[] inv = new long[1000000];

    public static void nCkInit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 1000000; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[(MOD % i)] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    public static long nCk(int n, int k) {
        if (n < k) {
            return 0;
        }
        if (n < 0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        int n = (2 * y - x) / 3;
        int m = (2 * x - y) / 3;
        nCkInit();
        System.out.println(nCk(n + m, n));
    }

}
