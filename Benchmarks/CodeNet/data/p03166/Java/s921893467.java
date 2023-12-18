import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] x = new int[M + 1];
            int[] y = new int[M + 1];
            for (int e = 1; e <= M; e++) {
                x[e] = in.nextInt();
                y[e] = in.nextInt();
            }
            int[][] len = new int[2][N + 1];
            int prev = 0, next = 1;
            for (int rep = 0; rep < M; rep++, prev = 1 - prev, next = 1 - next) {
                for (int e = 1; e <= M; e++) {
                    len[next][y[e]] = 0;
                }
                for (int e = 1; e <= M; e++) {
                    len[next][y[e]] = Math.max(len[next][y[e]], len[prev][x[e]] + 1);
                }
            }
            int res = 0;
            for (int e = 1; e <= M; e++) {
                res = Math.max(res, len[prev][y[e]]);
            }
            out.println(res);
        }

    }
}

