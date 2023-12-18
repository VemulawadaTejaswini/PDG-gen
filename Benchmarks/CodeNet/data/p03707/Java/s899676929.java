import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author bcools
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int q = in.nextInt();
            int[][] mat = new int[n][m];
            for (int i = 0; i < n; ++i) {
                String s = in.next();
                for (int j = 0; j < m; ++j) {
                    mat[i][j] = (s.charAt(j) == '1' ? 1 : 0);
                }
            }

            for (int i = 0; i < q; ++i) {
                long blues = 0;
                long h = 0;
                long v = 0;
                int x1 = in.nextInt();
                int y1 = in.nextInt();
                int x2 = in.nextInt();
                int y2 = in.nextInt();
                for (int ii = x1 - 1; ii < x2; ++ii) {
                    for (int jj = y1 - 1; jj < y2; ++jj) {
                        if (mat[ii][jj] != 0) {
                            blues++;
                            if (ii + 1 < x2) {
                                h += mat[ii + 1][jj];
                            }
                            if (jj + 1 < y2) {
                                v += mat[ii][jj + 1];
                            }
                        }

                    }
                }
                out.println(blues - (h + v));
            }
        }

    }
}

