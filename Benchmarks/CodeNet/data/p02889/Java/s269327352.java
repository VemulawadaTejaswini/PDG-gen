import java.util.Scanner;

/**
 * Travel by Car
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int L = sc.nextInt();

            long[][] D = initWF(N);
            for (int i = 0; i < M; i++) {
                int A = sc.nextInt() - 1;
                int B = sc.nextInt() - 1;
                int C = sc.nextInt();

                D[A][B] = C;
                D[B][A] = C;
            }

            execWF(N, D);

            long[][] E = initWF(N);
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (D[i][j] <= L) {
                        E[i][j] = 1;
                        E[j][i] = 1;
                    }
                }
            }

            execWF(N, E);

            StringBuilder sb = new StringBuilder();

            int Q = sc.nextInt();
            for (int i = 0; i < Q; i++) {
                int s = sc.nextInt() - 1;
                int t = sc.nextInt() - 1;

                long z = (E[s][t] != Long.MAX_VALUE) ? E[s][t] - 1 : -1;

                sb.append(z).append("\n");
            }

            System.out.println(sb.toString());
        }
    }

    public static long[][] initWF(int N) {
        long[][] D = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    D[i][j] = Long.MAX_VALUE;
                }
            }
        }
        return D;
    }

    public static void execWF(int N, long[][] D) {
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (D[i][k] != Long.MAX_VALUE && D[k][j] != Long.MAX_VALUE) {
                        D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
                    }
                }
            }
        }
    }

}
