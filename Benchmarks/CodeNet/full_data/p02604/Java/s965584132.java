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
        EMsSolution solver = new EMsSolution();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMsSolution {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] ax = new long[n + 1];
            long[] ay = new long[n + 1];
            long[] p = new long[n + 1];
            long[] MINC = new long[n + 1];
            for (int i = 0; i < n; i++) {
                ax[i] = in.nextLong();
                ay[i] = in.nextLong();
                p[i] = in.nextLong();
                MINC[i] = Math.min(Math.abs(ax[i]), Math.abs(ay[i]));
            }

            long[] answer = new long[n + 1];
            Arrays.fill(answer, Long.MAX_VALUE);

            int maxConfig = NumberTheory.powInt(3, n);
            boolean[] x = new boolean[n];
            boolean[] y = new boolean[n];
            long[] min = new long[n];
            for (int config = 0; config < maxConfig; config++) {
                int c = config;
                int k = n;
                Arrays.fill(x, false);
                Arrays.fill(y, false);
                for (int i = 0; i < n; i++) {
                    int next = c / 3;
                    int type = c - next * 3;
                    if (type == 0)
                        x[i] = true;
                    else if (type == 1)
                        y[i] = true;
                    else {
                        k--;
                    }
                    c = next;
                }

                for (int i = 0; i < n; i++) {
                    min[i] = MINC[i];
                }

                long lastX = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    if (x[i])
                        lastX = ax[i];
                    min[i] = Math.min(min[i], Math.abs(ax[i] - lastX));
                }
                lastX = Integer.MAX_VALUE;
                for (int i = n - 1; i >= 0; i--) {
                    if (x[i])
                        lastX = ax[i];
                    min[i] = Math.min(min[i], Math.abs(ax[i] - lastX));
                }
                long lastY = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    if (y[i])
                        lastY = ay[i];
                    min[i] = Math.min(min[i], Math.abs(ay[i] - lastY));
                }
                lastY = Integer.MAX_VALUE;
                for (int i = n - 1; i >= 0; i--) {
                    if (y[i])
                        lastY = ay[i];
                    min[i] = Math.min(min[i], Math.abs(ay[i] - lastY));
                }

                long score = 0;
                for (int i = 0; i < n; i++) {
                    score += min[i] * p[i];
                }
                answer[k] = Math.min(answer[k], score);
            }

            for (int k = 0; k <= n; k++) {
                out.println(answer[k]);
            }
        }

    }

    static class NumberTheory {
        public static int powInt(int x, int e) {
            if (e == 0)
                return 1;
            if ((e & 1) > 0)
                return x * powInt(x, e - 1);
            return powInt(x * x, e / 2);
        }

    }

    static class InputReader {
        public final BufferedReader reader;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

