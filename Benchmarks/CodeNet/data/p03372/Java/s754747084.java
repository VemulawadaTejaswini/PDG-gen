import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long c = in.nextLong();

            long[] x = new long[n];
            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
                v[i] = in.nextLong();
            }

            long ans = 0;
            ans = Math.max(ans, calc(n, c, x, v));

            for (int i = 0; i < n; i++) {
                x[i] = c - x[i];
            }
            for (int i = 0; i < n / 2; i++) {
                long tmp;
                tmp = x[i];
                x[i] = x[n - 1 - i];
                x[n - 1 - i] = tmp;
                tmp = v[i];
                v[i] = v[n - 1 - i];
                v[n - 1 - i] = tmp;
            }
            ans = Math.max(ans, calc(n, c, x, v));

            out.println(ans);
        }

        private long calc(int n, long c, long[] x, long[] v) {
            long[] xx = new long[n + 1];
            long[] vv = new long[n + 1];
            for (int i = 0; i < n; i++) {
                xx[i + 1] = x[i];
                vv[i + 1] = v[i];
            }

            long[] sum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + vv[i + 1] - 2 * (xx[i + 1] - xx[i]);
            }
            for (int i = 0; i < n; i++) {
                sum[i + 1] = Math.max(sum[i + 1], sum[i]);
            }

            long ret = Math.max(sum[n], 0);
            long vSum = 0;
            for (int i = n; i > 0; i--) {
                vSum += vv[i];
                ret = Math.max(ret, vSum - (c - xx[i]) + sum[i - 1]);
            }

            return ret;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

