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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECrestedIbisVsMonster solver = new ECrestedIbisVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECrestedIbisVsMonster {
        long mod = 1000000007;
        int MAXN = 200005;
        PrintWriter out;
        InputReader in;
        int h;
        int n;
        int[][] arr = new int[MAXN][2];
        int[] dp = new int[MAXN];

        int go(int health) {
            if (health <= 0)
                return 0;
            if (dp[health] != -1)
                return dp[health];
            int min = (int) mod;
            for (int i = 0; i < n; i++)
                min = Math.min(min, go(health - arr[i][0]) + arr[i][1]);
            return dp[health] = min;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            h = ni();
            n = ni();
            int i = 0;
            for (i = 0; i < n; i++) {
                arr[i][0] = ni();
                arr[i][1] = ni();
            }
            Arrays.fill(dp, -1);
            pn(go(h));
        }

        int ni() {
            return in.nextInt();
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
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
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

