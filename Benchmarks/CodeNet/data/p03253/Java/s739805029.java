import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 510000;
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.COMinit();
        main.solve();
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
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        Map<Integer, Integer> factorization = new HashMap<>();
        for (int i = 2; i * i <= M; i++) {
            if (M % i != 0) {
                continue;
            }
            int count = 0;
            while (M % i == 0) {
                count += 1;
                M /= i;
            }
            factorization.put(i, count);
        }
        if (1 < M) {
            factorization.put(M, 1);
        }
        long ans = 1;
        for (int prime : factorization.keySet()) {
            ans *= COM(factorization.get(prime)+ N - 1, N - 1);
            ans %= MOD;
        }
        System.out.println(ans);
    }
}
