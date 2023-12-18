import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aman Kumar Singh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EGetEverything solver = new EGetEverything();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGetEverything {
        long INF = (long) 1e14 + 1;
        int MAXN = 1005;
        PrintWriter out;
        InputReader in;
        int n;
        int m;
        int[] masks = new int[MAXN];
        long[] cost = new long[MAXN];
        int MAX_MSK = (1 << 12);
        long[][] dp = new long[MAXN][MAX_MSK];

        long go(int ind, int mask) {
            if (ind == m) {
                if (mask == (1 << n) - 1)
                    return 0;
                else
                    return INF;
            }
            long mn = INF;
            mn = Math.min(go(ind + 1, mask), mn);
            mn = Math.min(go(ind + 1, mask | masks[ind]) + cost[ind], mn);
            dp[ind][mask] = mn;
            return mn;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            n = ni();
            m = ni();
            int i = 0;
            for (i = 0; i < m; i++) {
                cost[i] = nl();
                int x = ni();
                for (int j = 0; j < x; j++)
                    masks[i] |= (1 << (ni() - 1));
            }
            for (i = 0; i < MAXN; i++)
                Arrays.fill(dp[i], -1);
            long ans = go(0, 0);
            if (ans == INF)
                pn(-1);
            else
                pn(ans);
        }

        int ni() {
            return in.nextInt();
        }

        long nl() {
            return in.nextLong();
        }

        void pn(long zx) {
            out.println(zx);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

