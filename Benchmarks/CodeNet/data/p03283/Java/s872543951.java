import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int Q = in.nextInt();
            int[] L = new int[M];
            int[] R = new int[M];
//            int[] cumL = new int[N + 1];
//            int[] cumR = new int[N + 1];
            int[][] count = new int[N][N];
            for (int i = 0; i < M; i++) {
                L[i] = in.nextInt() - 1;
                R[i] = in.nextInt() - 1;
//                cumL[L[i]]++;
//                cumR[R[i]]++;
                count[L[i]][R[i]]++;
            }
//            for (int i = 1; i < N + 1; i++) {
//                cumL[i] += cumL[i - 1];
//                cumR[i] += cumR[i - 1];
//            }
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < N; j++) {
                    count[i][j] += count[i][j - 1];
                }
            }
            int[] p = new int[Q];
            int[] q = new int[Q];
            for (int i = 0; i < Q; i++) {
                p[i] = in.nextInt() - 1;
                q[i] = in.nextInt() - 1;

                int n = 0;
                for (int j = p[i]; j <= q[i]; j++) {
                    n += count[j][p[i]];
                }

                System.out.println(n);
            }

        }
    }

}
