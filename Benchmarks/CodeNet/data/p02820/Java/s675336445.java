import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPredictionAndRestriction solver = new DPredictionAndRestriction();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPredictionAndRestriction {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt(), r = s.nextInt(), sc = s.nextInt(), p = s.nextInt();
            char[] c = s.next().toCharArray();
            int[][] dp = new int[n][3];
            int[] get = new int['z' + 1], ind = new int['z' + 1];
            get['r'] = p;
            get['p'] = sc;
            get['s'] = r;
            ind['r'] = 0;
            ind['p'] = 1;
            ind['s'] = 2;
            int ans = 0;
            for (int i = 0; i < k; i++) {
                dp[i][ind[c[i]]] = get[c[i]];
                int j;
                for (j = i + k; j < n; j += k) {
                    for (int z = 0; z < 3; z++) {
                        if (z == ind[c[j]])
                            dp[j][z] = Math.max(dp[j - k][(z + 1) % 3], dp[j - k][(z + 2) % 3]) + get[c[j]];
                        else dp[j][z] = Math.max(dp[j - k][(z + 1) % 3], dp[j - k][(z + 2) % 3]);
                    }
                }
                j -= k;
                ans += func.max(dp[j][0], dp[j][1], dp[j][2]);
            }
            w.println(ans);
        }

    }

    static class func {
        public static int max(int... v) {
            int max = Integer.MIN_VALUE;
            for (int i : v) max = Math.max(max, i);
            return max;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

