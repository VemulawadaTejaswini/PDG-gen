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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int maxn = in.nextInt();
            int maxk = in.nextInt();
            long modulo = in.nextLong();
            long[][] c = new long[maxn + 1][maxn + 1];
            c[0][0] = 1 % modulo;
            for (int i = 1; i <= maxn; ++i) {
                c[i][0] = 1 % modulo;
                for (int j = 1; j <= maxn; ++j) {
                    c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % modulo;
                }
            }
            long[][] res = new long[maxn + 1][maxk + 1];
            Arrays.fill(res[0], 1);
            for (int n = 1; n <= maxn; ++n) {
                for (int k = 1; k <= maxk; ++k) {
                    if (k == 1) {
                        res[n][k] = 1 % modulo;
                    } else {
                        res[n][k] = res[n][k - 1];
                        for (int before = 0; before < n; ++before) {
                            res[n][k] = (res[n][k] + res[before][k - 1] * c[n][before] % modulo * res[n - 1 - before][k]) % modulo;
                        }
                    }
                }
            }
            out.println(res[maxn][maxk]);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

