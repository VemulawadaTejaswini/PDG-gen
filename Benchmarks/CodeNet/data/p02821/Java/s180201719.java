import java.util.Arrays;
import java.util.Scanner;

/**
 * Handshake
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long M = sc.nextLong();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);

            int min = A[0] * 2;
            int max = A[N - 1] * 2;

            while (max - min > 1) {
                int mid = (max + min) / 2;

                long K = 0;
                for (int i = 0; i < N; i++) {
                    int pos;
                    if (A[i] < mid) {
                        pos = Arrays.binarySearch(A, mid - A[i]);
                        if (pos < 0) {
                            pos = -(pos + 1);
                        }
                    } else {
                        pos = 0;
                    }

                    K += N - pos;
                }

                if (K == M) {
                    max = mid;
                    min = mid;
                } else if (K < M) {
                    max = mid;
                } else {
                    min = mid;
                }
            }

            long[] S = new long[N];
            S[N - 1] = A[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                S[i] = S[i + 1] + A[i];
            }

            long H = 0;
            int K = 0;
            for (int i = 0; i < N; i++) {
                int pos;
                if (A[i] < max) {
                    pos = Arrays.binarySearch(A, max - A[i]);
                    if (pos < 0) {
                        pos = -(pos + 1);
                    }
                } else {
                    pos = 0;
                }

                if (pos == N) {
                    continue;
                }

                H += A[i] * (N - pos) + S[pos];
                K += N - pos;
            }

            if (M - K > 0) {
                H += min * (M - K);
            }

            System.out.println(H);
        }
    }

}
