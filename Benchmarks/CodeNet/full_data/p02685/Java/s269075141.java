import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 510000;
    private static int MOD = 998244353;
    public static void main(String[] args) {
        Main main = new Main();
        main.COMinit();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        long ans = 0;
        for (int i = 0; i <= K; i++) {
            int group = N - i;
            long t = ((long) M) * pow(M - 1, group - 1);
            t %= MOD;
            t *= COM(N - 1, i);
            t %= MOD;
            ans += t;
            ans %= MOD;
        }
        System.out.println(ans);
    }
    private long pow(long base, long count) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            long x = base * pow(base, count - 1);
            x %= MOD;
            return x;
        }
        long x = pow(base, count / 2);
        x *= x;
        x %= MOD;
        return x;
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
