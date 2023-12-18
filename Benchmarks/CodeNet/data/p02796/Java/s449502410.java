import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        BRobotArms solver = new BRobotArms();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRobotArms {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            Pair[] pair = new Pair[n];
            for (int i = 0; i < n; i++)
                pair[i] = new Pair(s.nextInt(), s.nextInt() - 1);
            Arrays.sort(pair, new Comparator<Pair>() {

                public int compare(Pair p1, Pair p2) {
                    if (p1.x - p1.l < p2.x - p2.l)
                        return -1;
                    if (p1.x - p1.l > p2.x - p2.l)
                        return 1;
                    return 0;
                }
            });
            int count = n;
            int range = pair[0].x + pair[0].l;
            for (int i = 1; i < n; i++) {
                if (pair[i].x - pair[i].l > range) {
                    range = pair[i].x + pair[i].l;
                    continue;
                }
                range = Math.min(pair[i].x + pair[i].l, range);
                count--;
            }
            w.println(count);
        }

        class Pair {
            int x;
            int l;

            Pair(int x, int l) {
                this.x = x;
                this.l = l;
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

