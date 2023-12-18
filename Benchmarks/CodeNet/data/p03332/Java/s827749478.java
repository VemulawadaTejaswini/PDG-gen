import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long[] fac = null;
    static long[] finv = null;
    static long[] inv = null;
    static final long prime = 998244353;

    public static void main(String[] args) {
        int N = ni();
        long A = nl();
        long B = nl();
        long K = nl();


        prepareCombinationMod(N + 1, N + 1, prime);

        int aNum = 0;
        int bNum;
        long comb = 0;
        while (aNum <= N) {
            long tmpK = K - aNum * A;
            if (tmpK % B == 0 && tmpK / B <= N) {
                bNum = (int) (tmpK / B);
                comb += combinationMod(N, aNum, prime) * combinationMod(N, bNum, prime);
                comb %= prime;
            }
            aNum++;
        }

        out.println(comb);
    }

    public static void prepareCombinationMod(int n, int k, long prime) {
        // 事前計算
        fac = new long[n + 1];
        finv = new long[n + 1];
        inv = new long[n + 1];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i <= n; i++) {
            fac[i] = fac[i - 1] * i % prime;
            inv[i] = prime - inv[(int) (prime % Long.valueOf(i))] * (prime / i) % prime;
            finv[i] = finv[i - 1] * inv[i] % prime;
        }
    }

    public static long combinationMod(int n, int k, long prime) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;

        return fac[n] * (finv[k] * finv[n - k] % prime) % prime;
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}