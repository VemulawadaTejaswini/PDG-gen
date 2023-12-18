import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 710000;
    private static int MOD = 1000000007;
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
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        this.COMinit();
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int Y = scan.nextInt();
        if ((X + Y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        int R = Math.min(X, Y);
        int C = Math.max(X, Y);
        int count = (R + C) / 3;
        long ans = 0;
        for (int i = 0; i < count; i++) {
            if (i * 1 + (count - i) * 2 == R && (i * 2 + (count - i) * 1 == C)) {
                ans += COM(count, i);
            }
        }
        System.out.println(ans);
    }
}
