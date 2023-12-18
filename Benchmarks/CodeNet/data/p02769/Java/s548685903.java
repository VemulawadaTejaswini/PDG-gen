import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    private static long[] fact;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solve(n, k));
    }

    /**
     * https://algo-logic.info/abc156e/
     */
    private static long solve(int n, int k) {
        long count = 0;
        fact = factInit(n, MOD);

        for (int numZeroRoom=0; numZeroRoom<=Math.min(n-1, k); numZeroRoom++) {
            // ゼロ人の部屋の配置パターン数(nCz) * 1人以上の部屋の配置パターン数((n-z)Hz)
            // n-z H z = (n-z + z - 1) H z = (n-1)Hz
            count += combination(n, numZeroRoom, MOD) * combination(n-1, numZeroRoom, MOD) % MOD;
            count %= MOD;
        }

        return count;
    }

    public static long combination(int n, int r, long p) {
        if (n == 0 && r == 0) return 1;
        if (n < r || n < 0)   return 0;

        return (fact[n] * power((fact[r]), p-2, p) % p) * power(fact[n-r], p-2, p) % p;
    }

    public static long[] factInit(int n, long p) {
        long[] fact = new long[n+1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i=2; i<=n; i++) {
            fact[i] = i * fact[i-1] % p;
        }

        return fact;
    }

    public static long power(long base, long t, long p) {
        long ans = 1;

        while (t > 0) {
            if (t%2 == 1) {
                ans = ans * base % p;
            }

            t /= 2;
            base = base * base % p;
        }

        return ans;
    }

}