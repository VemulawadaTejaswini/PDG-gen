import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
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
            int N = in.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = in.nextInt();
            }

            int ans = 0;

            for (int k = 0; k < 29; k++) {
                int T = 1 << k;
                Integer[] a = new Integer[N];
                Integer[] b = new Integer[N];
                for (int i = 0; i < N; i++) {
                    a[i] = A[i] % (2 * T);
                    b[i] = B[i] % (2 * T);
                }
                Arrays.sort(b);

                int ones = 0;

                for (int i = 0; i < N; i++) {
                    for (int m = 1; m <= 3; m += 2) {
                        int lb = lowerBound(b, a[i], m * T);
                        int ub = upperBound(b, a[i], (m + 1) * T);

                        if (lb <= ub && a[i] + b[lb] >= m * T && a[i] + b[lb] < (m + 1) * T) {
                            ones += ub - lb + 1;
                        }
                    }
                }

                if (ones % 2 != 0) {
                    ans |= T;
                }
            }

            out.println(ans);
        }

        private int upperBound(Integer[] b, int ai, int max) {
            int lo = 0, hi = b.length;

            while (lo + 1 < hi) {
                int m = lo + (hi - lo) / 2;

                if (ai + b[m] >= max) {
                    hi = m;
                } else {
                    lo = m;
                }
            }

            return hi - 1;
        }

        private int lowerBound(Integer[] b, int ai, int min) {
            int lo = -1, hi = b.length - 1;

            while (lo + 1 < hi) {
                int m = lo + (hi - lo) / 2;

                if (ai + b[m] < min) {
                    lo = m;
                } else {
                    hi = m;
                }
            }

            return lo + 1;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

