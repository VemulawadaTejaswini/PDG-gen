import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Gabriel Carrillo
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            long mod = (long) 1e9 + 7;
            int[][] grid = new int[n + 1][n];
            long[] dp = new long[(1 << n) + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++)
                for (int j = 0; j < n; j++)
                    grid[i][j] = in.nextInt();

            for (int i = 1; i < 1 << n; i++) {
                int j = Integer.bitCount(i);
                for (int k = 0; k < n; k++) {
                    if ((i & (1 << k)) != 0) {
                        dp[i] += dp[i ^ (1 << k)] * grid[j][k];
                        if (dp[i] > mod) dp[i] -= mod;
                    }
                }
            }
            out.println(dp[(1 << n) - 1]);

        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public InputReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }
}

