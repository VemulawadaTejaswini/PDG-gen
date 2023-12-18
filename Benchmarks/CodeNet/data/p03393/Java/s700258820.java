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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            char[] s = in.nextString().toCharArray();
            int n = s.length;
            if (n < 26) {
                outer:
                for (char ss = 'a'; ss <= 'z'; ++ss) {
                    for (char sss : s) if (sss == ss) continue outer;
                    out.println(new String(s) + "" + ss);
                    return;
                }
            } else {
                for (int i = n - 2; i >= 0; i--) {
                    if (s[i] < s[i + 1]) {
                        char best = s[i + 1];
                        for (int j = i + 1; j < n; j++) {
                            if (s[j] > s[i]) {
                                best = (char) Math.min(best, s[j]);
                            }
                        }
                        s[i] = best;
                        out.println(new String(s).substring(0, i + 1));
                        return;
                    }
                }
                out.println(-1);
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

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
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

