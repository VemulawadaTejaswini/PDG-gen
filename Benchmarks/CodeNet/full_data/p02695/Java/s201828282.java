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
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CManyRequirements solver = new CManyRequirements();
        solver.solve(1, in, out);
        out.close();
    }

    static class CManyRequirements {
        int n;
        int m;
        int q;
        Query[] b;

        long recur(int[] a, int max, int idx) {
            if (idx == n) {
                long ret = 0;
                for (int i = 0; i < q; i++) {
                    Query x = b[i];
                    if (a[x.b] - a[x.a] == x.c)
                        ret += x.d;
                }
                return ret;
            }
            long ret = 0;
            for (int j = max; j <= m; j++) {
                a[idx] = j;
                ret = Math.max(recur(a, j, idx + 1), ret);
            }
            return ret;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            n = s.nextInt();
            m = s.nextInt();
            q = s.nextInt();
            b = new Query[q];
            for (int i = 0; i < q; i++) {
                b[i] = new Query(s.nextInt() - 1, s.nextInt() - 1, s.nextInt(), s.nextInt());
            }
            w.println(recur(new int[n], 1, 0));
        }

        class Query {
            int a;
            int b;
            int c;
            int d;

            Query(int a, int b, int c, int d) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

