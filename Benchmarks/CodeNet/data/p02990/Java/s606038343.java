import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] ans = solve(N, K);
        for (int i=0; i<K; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] solve(int N, int K) {
        int[] ans = new int[K];

        for (int i=0; i<K; i++) {
            ans[i] = pattern(N, K, i+1);
        }

        return ans;
    }

    /**
     *
     * 赤のボールに対してのど隙間に配置するのか x 青ボールの分割パターン
     * @param N 全ボール数
     * @param K 青のボール数
     * @param i 操作回数
     * @return
     */
    private static int pattern(int N, int K, int i) {
        long count = 0;

        // (N-K+1)_C_i
        count = combination(N-K+1, i, MOD);


        count *= combination(K-1, i-1, MOD);


        return (int)(count%MOD);
    }


    public static long combination(int n, int r, long p) {
        if (n == 0 && r == 0) return 1;
        if (n < r || n < 0)   return 0;

        long[] fact = factInit(n, p);

        return (fact[n] * power((fact[r]), p-2, p) % p) * power(fact[n-r], p-2, p) % p;
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

    public static long[] factInit(int n, long p) {
        long[] fact = new long[n+1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i=2; i<=n; i++) {
            fact[i] = i * fact[i-1] % p;
        }

        return fact;
    }
}
