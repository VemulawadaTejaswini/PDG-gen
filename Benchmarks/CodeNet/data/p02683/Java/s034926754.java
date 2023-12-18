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
        CSkillUp solver = new CSkillUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSkillUp {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt(), x = s.nextInt();
            int[][] a = new int[n][m];
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = s.nextInt();
                for (int j = 0; j < m; j++) a[i][j] = s.nextInt();
            }
            int MX = 1 << n, ans = Integer.MAX_VALUE;
            for (int i = 1; i < MX; i++) {
                int cur = 0, t = i, req = 0;
                int[] cost = new int[m];
                while (t > 0) {
                    if ((t & 1) == 1) {
                        for (int j = 0; j < m; j++) cost[j] += a[cur][j];
                        req += c[cur];
                    }
                    cur++;
                    t >>= 1;
                }
                boolean ok = true;
                cur = 0;
                for (int j = 0; j < m; j++)
                    if (cost[j] < x) {
                        ok = false;
                        break;
                    }
                if (ok) ans = Math.min(ans, req);
            }
            w.println(ans == Integer.MAX_VALUE ? -1 : ans);
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

