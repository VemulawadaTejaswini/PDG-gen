
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 1000001;
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.COMinit();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        if (N == 1) {
            System.out.println(0);
            return;
        }
        // 0-9の全組み合わせ
        long ans = pow(10, N, MOD);
        // 1-8でできる全組み合わせ
        ans -= pow(8, N, MOD);
        if (ans < 0) {
            ans += MOD;
        }
        // 0をi箇所置いて、それ以外を1-8とする組み合わせ
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            long t = pow(8, N-i, MOD);
            long com = COM(N, i);
            t = t * com;
            t %= MOD;
            sum += t;
            sum %= MOD;
        }
        sum *= 2;
        sum %= MOD;
        ans -= sum;
        if (ans < 0) {
            ans += MOD;
        }
        System.out.println(ans);
    }
    private long pow(long base, long count, long mod) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            long t = base * pow(base, count-1, mod);
            t %= mod;
            return t;
        }
        long t = pow(base, count / 2, mod);
        t *= t;
        t %= mod;
        return t;
    }
    void COMinit() {
        this.fac = new long[MAX_LEN];
        this.finv = new long[MAX_LEN];
        this.inv = new long[MAX_LEN];
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        for (int i = 2; i < MAX_LEN; i++) {
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }
    long COM(int n, int k) {
        if (n < k) {
            return 0;
        };
        if (n <0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k]%MOD)%MOD;
    }
}
