import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.Format;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CodeMonk
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
        public long LIS(long n, long[] x, long[] y) {
            int ans = 0;
            long x1 = 0, x2 = 0, y1 = 0, y2 = 0;
            for (int i = 0; i <= n; i++) {
                if (x1 <= x[i] && y1 <= y[i]) {
                    ans++;
                    x1 = x[i];
                    y1 = y[i];
                }
            }
            return ans - 1;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            long x1 = in.nextLong();

            long y1 = in.nextLong();
            long x2 = in.nextLong();
            long y2 = in.nextLong();
            int N = in.nextInt();
            long[] x = new long[(int) 1E6 + 9];
            long[] y = new long[(int) 1E6 + 9];
            x[0] = x1;
            y[0] = y1;
            int i = 1;
            while (i <= N) {
                x[i] = in.nextLong();
                y[i] = in.nextLong();
                i++;
            }
            x[i] = x2;
            y[i] = y2;
            long k = LIS(N, x, y);
            long s = Math.abs(x2 - x1) + Math.abs(y2 - y1);
            long p, q;
            //out.println(k);
            if (k < Math.min(Math.abs(x2 - x1), Math.abs(y2 - y1)) + 1) {
                p = k;
                q = 0;
            } else {
                p = k - 1;
                q = 1;
            }
            Double pi = 3.141592653589793238;

            Double ans = 100 * s - (20 - 5 * pi) * p + (10 * pi - 20) * q;

            final DecimalFormat df = new DecimalFormat("#0.000000000000000");

            String res = df.format(ans).toString();
            out.println(res.substring(0, res.toString().length() - 2) + (q == 1 ? "38" : "00"));
        }

    }
}

