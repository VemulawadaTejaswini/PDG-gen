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

            //System.out.println(Arrays.toString(A));

            if (K == 1) {
                System.out.println(0);
                return;
            }

            long[] C = new long[N - K + 1];
            long c = 1;
            C[0] = 1; // (K-1)_C_(K-1)
            for (int i = 1; i < N - K + 1; i++) {
                c = c * (K - 1 + i) / i;
                C[i] = c % MOD;
            }

            long ans = 0;

            for (int i = 0; i < N - K + 1; i++) {
                //System.out.println(i + " " + C[i] + " " + A[K - 1 + i] + " " + A[N - K - i]);
                ans = (ans + A[K - 1 + i] * C[i] - A[N - K - i] * C[i]) % MOD;
                if (ans < 0) {
                    ans = (ans + (ans / MOD + 1) * MOD) % MOD;
                }
            }

            System.out.println(ans);
        }
    }

}
