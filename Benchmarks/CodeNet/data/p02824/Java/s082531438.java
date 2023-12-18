import java.util.Arrays;
import java.util.Scanner;

/**
 * Voting Judges
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long M = sc.nextLong();
            int V = sc.nextInt();
            int P = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            Arrays.sort(A);

            long[] S = new long[N];
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    S[i] = A[i];
                } else {
                    S[i] = S[i - 1] + A[i];
                }
            }

            long ans = -1;

            for (int i = 0; i < N; i++) {
                long K = A[i] + M;

                if (K < A[N - P]) {
                    continue;
                }

                long x = M * V - M * (P + i) - (K * (N - P - i) - (S[N - P] - S[i]));
                if (x <= 0) {
                    ans = N - i;
                    break;
                }
            }

            System.out.println(ans);
        }
    }

}
