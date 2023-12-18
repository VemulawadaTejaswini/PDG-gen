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
        DRainFlowsIntoDams solver = new DRainFlowsIntoDams();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRainFlowsIntoDams {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            long[] res = new long[n];

            long s = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                if (i % 2 == 0) {
                    s += a[i];
                } else {
                    s -= a[i];
                }
            }

            for (int i = 0; i < n; i++) {
                res[i] = s;
                s = -s + 2 * a[i];
            }


            for (int i = 0; i < n; i++) {
                out.print(res[i] + " ");
            }
            out.println();
        }

    }
}

