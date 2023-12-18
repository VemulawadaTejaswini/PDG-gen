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
 * @author aps
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HGrid1 solver = new HGrid1();
        solver.solve(1, in, out);
        out.close();
    }

    static class HGrid1 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int h = in.nextInt();
            int w = in.nextInt();

            int[][] a = new int[h + 1][w + 1];
            long[][] dp = new long[h + 1][w + 1];

            for (int i = 1; i <= h; i++) {
                char[] s = in.next().toCharArray();
                for (int j = 1; j <= w; j++) {
                    if (s[j - 1] == '.') a[i][j] = 1;
                    else a[i][j] = 0;
                }
            }

            dp[1][1] = 1;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (a[i][j] == 1) {
                        dp[i][j] = Numbers.add(dp[i][j], dp[i - 1][j]);
                        dp[i][j] = Numbers.add(dp[i][j], dp[i][j - 1]);
                    }
                }
            }

            out.println(dp[h][w]);
        }

    }

    static class Numbers {
        public static final long mod = (long) 1e9 + 7;

        public static long add(long a, long b) {
            a += b;
            if (a >= mod) a -= mod;
            return a;
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

