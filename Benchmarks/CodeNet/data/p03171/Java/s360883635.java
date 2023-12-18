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
 *
 * @author cplayer
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        LDeque solver = new LDeque();
        solver.solve(1, in, out);
        out.close();
    }

    static class LDeque {
        public void solve (int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.nextLongArr(n + 1, 1, n);
            long[][] dp = new long[n + 1][n + 1];
            dp[0] = Arrays.copyOfRange(a, 0, n + 1);
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j + i <= n; ++j) {
                    if (i > 1) {
                        long valFirstFirst = a[j] - a[j + 1], valFirstLast = a[j] - a[j + i];
                        long valLastFirst = a[j + i] - a[j], valLastLast = a[j + i] - a[j + i - 1];
                        boolean flagFirst = valFirstFirst < valFirstLast, flagSecond = valLastFirst < valLastLast;
                        long valFirst = flagFirst ? valFirstFirst : valFirstLast;
                        long valLast = flagSecond ? valLastFirst : valLastLast;
                        if (valFirst > valLast) {
                            dp[i][j] = flagFirst ? dp[i - 2][j + 2] + a[j] - a[j + 1] : dp[i - 2][j + 1] + a[j] - a[j + i];
                        } else {
                            dp[i][j] = flagSecond ? dp[i - 2][j + 1] + a[j + i] - a[j] : dp[i - 2][j] + a[j + i] - a[j + i - 1];
                        }
                    } else if (i == 1) {
                        dp[i][j] = Math.max(a[j] - a[j + i], a[j + i] - a[j]);
                    }
                }
            }
            out.println(dp[n - 1][1]);
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader (InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next () {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        public long[] nextLongArr (int length, int readOffset, int readLength) {
            long[] res = new long[length];
            for (int i = readOffset; i < readOffset + readLength; ++i) {
                res[i] = nextLong();
            }
            return res;
        }

        public int nextInt () {
            return Integer.parseInt(next());
        }

        public long nextLong () {
            return Long.parseLong(next());
        }

    }
}

