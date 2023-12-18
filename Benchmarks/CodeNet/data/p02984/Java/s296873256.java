import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DRainFlowsIntoDams solver = new DRainFlowsIntoDams();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRainFlowsIntoDams {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            long m0 = 0;
            int add = 1;
            for (int i = n - 1; i >= 0; i--) {
                m0 += add * a[i];
                add *= -1;
            }
            long[] res = new long[n];
            res[0] = m0;
            out.print(res[0]);
            for (int i = 1; i < n; i++) {
                res[i] = 2 * (a[i - 1] - res[i - 1] / 2);
                out.print(" ");
                out.print(res[i]);
            }
        }

    }
}

