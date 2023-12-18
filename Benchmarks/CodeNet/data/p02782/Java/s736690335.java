import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 2000010;
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.COMinit();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        long ans = g(c2, r2);
        ans %= MOD;
        long x = g(r2, c1 - 1);
        ans = (ans + MOD - x) % MOD;
        long y = g(r1 - 1, c2);
        ans = (ans + MOD - y) % MOD;
        ans += g(r1 - 1, c1 - 1);
        ans %= MOD;
        System.out.println(ans);
    }
    long g(int r, int c) {
        long x = COM(r+c+2, c+1);
        return x % MOD;
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
