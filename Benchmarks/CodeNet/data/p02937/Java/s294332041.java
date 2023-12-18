import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author caoash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EStringsOfImpurity solver = new EStringsOfImpurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class EStringsOfImpurity {
        public void solve(int testNumber, FastScanner br, PrintWriter pw) {
            char[] s = br.nextString().toCharArray();
            char[] t = br.nextString().toCharArray();
            TreeSet<Integer>[] pos = new TreeSet[26];
            for (int i = 0; i < 26; i++) {
                pos[i] = new TreeSet<>();
            }
            for (int i = 0; i < s.length; i++) {
                pos[s[i] - 'a'].add(i);
            }
            int currPos = -1;
            int it = 0;
            for (int i = 0; i < t.length; i++) {
                char c = t[i];
                Integer newPos = pos[c - 'a'].higher(currPos);
                boolean changed = false;
                if (newPos == null) {
                    newPos = pos[c - 'a'].ceiling(0);
                    changed = true;
                }
                if (changed && (newPos == null || newPos > currPos)) {
                    pw.println(-1);
                    pw.close();
                    return;
                }
                if (newPos <= currPos) {
                    it++;
                    currPos = newPos;
                } else {
                    currPos = newPos;
                }
            }
            pw.println((long) (((long) s.length * (long) it) + ((long) currPos + 1)));
            pw.close();
        }

    }

    static class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastScanner.SpaceCharFilter filter;

        public FastScanner(InputStream stream) {
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

