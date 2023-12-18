import java.util.Scanner;

/**
 * Handshake
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int MAX = 100000;

            int N = sc.nextInt();
            long M = sc.nextLong();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long[] C = new long[MAX + 2];
            for (int a : A) {
                C[a]++;
            }
            for (int i = MAX - 1; i >= 0; i--) {
                C[i] += C[i + 1];
            }

            long[] CS = new long[MAX + 2];
            for (int a : A) {
                CS[a] += a;
            }
            for (int i = MAX - 1; i >= 0; i--) {
                CS[i] += CS[i + 1];
            }

            int min = 0;
            int max = MAX * 2 + 1;

            while (Math.abs(min - max) > 1) {
                int mid = (min + max) / 2;

                long K = 0;
                for (int i = 0; i < N; i++) {
                    K += C[Math.min(MAX + 1, Math.max(0, mid - A[i]))];
                }

                if (K < M) {
                    max = mid;
                } else {
                    min = mid;
                }
            }

            long H = 0;
            long K = 0;
            for (int a : A) {
                H += a * C[Math.min(MAX + 1, Math.max(0, min + 1 - a))]
                        + CS[Math.min(MAX + 1, Math.max(0, min + 1 - a))];
                K += C[Math.min(MAX + 1, Math.max(0, min + 1 - a))];
            }

            H += min * (M - K);

            System.out.println(H);
        }
    }

}
