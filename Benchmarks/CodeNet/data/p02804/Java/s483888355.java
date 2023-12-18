import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007;

            int N = sc.nextInt();
            int K = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            Arrays.sort(A);

            if (K == 1) {
                System.out.println(0);
                return;
            }

            long[] S = new long[N];
            for (int i = 0; i < N; i++) {
                S[i] = A[i];
            }
            for (int k = 0; k < K - 1; k++) {
                for (int i = 1; i < N; i++) {
                    S[i] = (S[i] + S[i - 1]) % MOD;
                }
            }

            long c = 0;

            long ans = 0;

            for (int i = K - 1; i < N; i++) {
                c = (c + i - K + 2) % MOD;
                ans = (ans + A[i] * c) % MOD;
                ans = (ans - S[i - K + 1]) % MOD;
            }

            while (ans < 0) {
                ans += MOD;
            }

            System.out.println(ans);
        }
    }

    static long combination(int N, int K, long MOD) {
        long factN = 1, factK = 1, factM = 1;
        for (int i = 1; i <= N; i++) {
            factN = factN * i % MOD;

            if (i == K) {
                factK = factN;
            }
            if (i == N - K) {
                factM = factN;
            }
        }

        long comb = factN;
        long m = MOD - 2;
        while (m > 0) {
            if (m % 2 == 1) {
                comb = comb * factK % MOD;
                comb = comb * factM % MOD;
                m--;
            }

            factK = factK * factK % MOD;
            factM = factM * factM % MOD;
            m = m / 2;
        }

        return comb;
    }

}
