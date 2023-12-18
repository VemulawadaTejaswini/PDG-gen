import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DAxisParallelRectangle solver = new DAxisParallelRectangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAxisParallelRectangle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
                y[i] = in.nextLong();
            }

            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < n; l++) {
                        for (int m = 0; m < n; m++) {
                            // i :左  j :上 m :右 l :下
                            int cnt = 0;
                            for (int o = 0; o < n; o++) {
                                if (x[i] <= x[o] &&
                                        x[o] <= x[m] &&
                                        y[l] <= y[o] &&
                                        y[o] <= y[j]) {
                                    cnt++;
                                }
                            }
                            if (cnt >= k) {
                                long s = (x[m] - x[i]) * (y[j] - y[l]);
                                min = Math.min(min, s);
                            }
                        }
                    }
                }
            }
            out.println(min);

        }

    }
}

