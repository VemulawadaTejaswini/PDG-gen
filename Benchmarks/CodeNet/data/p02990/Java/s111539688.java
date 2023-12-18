import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 510000;
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        if (N == K) {
            System.out.println(1);
            for (int i = 2; i <= K; i++) {
                System.out.println(0);
            }
            return;
        }
        COMinit();
        long b = 1000000007;
        for (int i = 1; i <= K; i++) {
            long blue_count = f(K, i) % b;
            long red_count = f2(N-K-(i-1), i+1) % b;
            long ans = (blue_count * red_count) % b;
            System.out.println(ans);
        }
    }
    long f(int n, int k) {
        if (n < k) {
            return 0;
        }
        if (n == 0 && k == 0) {
            return 1;
        }
        if (k < 1) {
            return 0;
        }
        return f2(n-k,k);
    }
    long f2(int n, int k) {
        return comb(n+k-1,k-1);
    }
    long comb(int n, int k) {
        return COM(n, k);
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
        if (n < 0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k]%MOD)%MOD;
    }
}
