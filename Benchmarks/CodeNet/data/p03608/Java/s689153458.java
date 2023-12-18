import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int N = in.nextInt();
            int M = in.nextInt();
            int R = in.nextInt();

            int[] r = new int[R];
            for (int i = 0; i < R; i++) {
                r[i] = in.nextInt() - 1;
            }

            int[][] distances = new int[N][N];
            for (int i = 0; i < distances.length; i++) {
                Arrays.fill(distances[i], (int) 1e9);
            }

            for (int i = 0; i < M; i++) {
                // minus 1 so we use the correct array index
                int A = in.nextInt() - 1;
                int B = in.nextInt() - 1;
                int C = in.nextInt();
                distances[A][B] = C;
                distances[B][A] = C;
            }

            floyd(N, distances);

            int min = dfs(0, new boolean[R], r, distances, -1);

            out.println(min);
        }

        private static int dfs(int index, boolean[] used, int[] r, int[][] distances, int from) {
            if (index >= r.length) {
                return 0;
            }

            int min = (int) 1e9;

            for (int i = 0; i < r.length; i++) {
                if (used[i]) {
                    continue;
                }

                used[i] = true;

                int to = r[i];
                int distance = (from == -1 ? 0 : distances[from][to]) + dfs(index + 1, used, r, distances, to);
                if (distance < min) {
                    min = distance;
                }

                used[i] = false;

            }

            return min;
        }

        private static void floyd(int n, int[][] l) {
            for (int b = 0; b < n; b++) {
                for (int a = 0; a < n; a++) {
                    for (int c = 0; c < n; c++) {
                        l[a][c] = Math.min(l[a][c], l[a][b] + l[b][c]);
                    }
                }
            }
        }

    }
}

