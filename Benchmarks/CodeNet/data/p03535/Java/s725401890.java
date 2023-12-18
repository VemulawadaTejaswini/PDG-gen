import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TimeGap solver = new TimeGap();
        solver.solve(1, in, out);
        out.close();
    }

    static class TimeGap {
        int[] D;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            D = new int[N + 1];
            for (int i = 1; i <= N; i++) D[i] = in.nextInt();

            if (N > 19) {
                out.println(0);
                return;
            }

            int ans = find(0, N + 1, new int[N + 1]);
            out.println(ans);
        }

        private int find(int idx, int n, int[] times) {
            if (idx == n) {
                return computeMin(times);
            }
            times[idx] = Math.min(D[idx], 24 - D[idx]);
            int ans = find(idx + 1, n, times);
            times[idx] = Math.max(D[idx], 24 - D[idx]);
            ans = Math.max(ans, find(idx + 1, n, times));
            return ans;
        }

        private int computeMin(int[] times) {
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < times.length; i++) {
                for (int j = 0; j < times.length; j++) {
                    if (i != j) {
                        ans = Math.min(ans, timeGap(times[i], times[j]));
                    }
                }
            }
            return ans;
        }

        private int timeGap(int t1, int t2) {
            int d = ((t2 - t1) + 48) % 24;
            return Math.min(d, 24 - d);
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

