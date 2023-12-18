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

            int m = bt(N, A, M);

            long[] S = new long[N];
            S[N - 1] = A[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                S[i] = S[i + 1] + A[i];
            }

            long H = 0;
            int[] pos = pos(N, A, m);
            int K = 0;

            for (int i = 0; i < N; i++) {
                if (pos[i] == N) {
                    continue;
                }

                H += A[i] * (N - pos[i]) + S[pos[i]];
                K += N - pos[i];
            }
            
            //System.out.println(H);

            if (M - K > 0) {
//                pos = pos(N, A, m - 1);
//
//                int K2 = 0;
//                for (int i = 0; i < N; i++) {
//                    K2 += N - pos[i];
//                }
//                
//                int k = bt(N, A, K2);
//                H += k * (M - K);
                H += (m - 1) * (M - K);
            }

            System.out.println(H);
        }
    }

    static int bt(int N, int[] A, long M) {
        int min = A[0] * 2;
        int max = A[N - 1] * 2;

        while (max - min > 1) {
            int mid = (max + min) / 2;
            int[] pos = pos(N, A, mid);

            long K = 0;
            for (int i = 0; i < N; i++) {
                K += N - pos[i];
            }

            //System.out.println(min + " " + max + " " + mid + " " + K);

            if (K < M) {
                max = mid;
            } else {
                min = mid;
            }
        }

        return max;
    }

    static int[] pos(int N, int[] A, int m) {
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            int pos;
            if (A[i] < m) {
                pos = Arrays.binarySearch(A, m - A[i]);
                if (pos < 0) {
                    pos = -(pos + 1);
                }
            } else {
                pos = 0;
            }

            p[i] = pos;
        }

        return p;
    }

}
