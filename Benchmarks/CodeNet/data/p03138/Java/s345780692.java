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
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXXOR solver = new DXXOR();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXXOR {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();

            if (k == 0) {
                long ans = 0;
                for (int i = 0; i < n; ++i) ans += in.nextLong();
                out.println(ans);
                return;
            }
            int cnt[] = new int[50];
            for (int i = 0; i < n; ++i) {
                long tmp = in.nextLong();
                for (int j = 0; tmp > 0; ++j) {
                    if ((tmp & (1 << j)) > 0) {
                        ++cnt[j];
                        tmp ^= 1 << j;
                    }
                }
            }

            int msb = 0;
            while (((long) 1 << msb) <= k) ++msb;
            --msb;

            long[][] dp = new long[msb + 10][2];
            dp[msb][0] = cnt[msb] * ((long) 1 << msb);
            dp[msb][1] = (n - cnt[msb]) * ((long) 1 << msb);

            for (int i = msb - 1; i >= 0; --i) {
                dp[i][0] = dp[i + 1][0] + Math.max(cnt[i], n - cnt[i]) * ((long) 1 << i);
                if ((k & (1 << i)) > 0) {
                    dp[i][0] = Math.max(dp[i][0], dp[i + 1][1] + cnt[i] * ((long) 1 << i));
                    dp[i][1] = dp[i + 1][1] + (n - cnt[i]) * ((long) 1 << i);
                } else dp[i][1] = dp[i + 1][1] + cnt[i] * ((long) 1 << i);
            }

            out.println(Math.max(dp[0][0], dp[0][1]));
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

