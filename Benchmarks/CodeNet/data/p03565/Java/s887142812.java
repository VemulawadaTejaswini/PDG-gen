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
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            char[] s = in.nextString().toCharArray();
            char[] t = in.nextString().toCharArray();
            int n = s.length;
            int m = t.length;
            int minCT = 100;
            int ind = -1;
            for (int i = 0; i + m <= n; ++i) {
                int ct = 0;
                for (int j = 0; j < m; ++j) {
                    if (s[i + j] != t[j]) ++ct;
                }
                if (ct == m) continue;
                else if (ct < minCT) {
                    minCT = ct;
                    ind = i;
                }
            }
            if (ind == -1) {
                outer:
                for (int i = 0; i + m <= n; ++i) {
                    for (int j = i; j + m <= n; ++j) {
                        if (s[j] != '?') continue outer;
                    }
                    for (int j = i; j + m <= n; ++j) {
                        s[j] = t[j - i];
                    }
                    for (int j = 0; j < n; ++j) {
                        if (s[j] == '?') s[j] = 'a';
                    }
                    out.println(new String(s));
                    return;
                }
                out.println("UNRESTORABLE");
                return;
            } else {
                for (int i = 0; i < m; ++i) {
                    s[i + ind] = t[i];
                }
                for (int i = 0; i < n; ++i) {
                    if (s[i] == '?') s[i] = 'a';
                }
                out.println(new String(s));
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String nextString() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = pread();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        private static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

