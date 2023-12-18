import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static long[] fac;
    static long[] finv;
    static long[] inv;
    static int max = 100001;
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        fac = new long[max];
        finv = new long[max];
        inv = new long[max];

        COMinit();

        //差が２以上だと交互に配置できない
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
        } else {
            System.out.println(fac[n] * fac[m] * 2 % mod);
        }
    }

    //二項定理前処理 O(N)
    //階乗 n! をfac[]に格納　n!**-1 をinv[]に格納 nCrをfinv[]に格納
    static void COMinit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;

        for (int i = 2; i < max; i++) {
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }
    }

    //nCr二項定理を返す O(1)
    // nCk=n!k!(n−k)!=(n!)×(k!)−1×((n−k)!)−1
    static long COM(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }
}
