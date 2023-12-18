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
        EDividingChocolate solver = new EDividingChocolate();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDividingChocolate {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int r = s.nextInt(), c = s.nextInt(), k = s.nextInt();
            char[][] a = new char[r + 1][];
            for (int i = 1; i <= r; i++)
                a[i] = (" " + s.next()).toCharArray();
            int[][] pre = new int[r + 1][c + 1];
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= c; j++) {
                    pre[i][j] = a[i][j] - '0' + pre[i][j - 1];
                }
            }
            long res = Long.MAX_VALUE;
            for (int mask = 0; mask < (1 << (r - 1)); mask++) {
                int can = 0;
                int[] b = new int[r];
                for (int i = 0; i < r - 1; i++) {
                    b[i + 1] = (mask >> i) & 1;
                    can += (mask >> i) & 1;
                }
                boolean poss = true;
                for (int j = 1; j <= c; j++) {
                    int i = 1;
                    while (i <= r) {
                        int nxt = i;
                        while (nxt < r && b[nxt] == 0)
                            nxt++;
                        int count = 0;
                        for (int iter = i; iter <= nxt; iter++)
                            count += a[iter][j] - '0';
                        if (count > k) {
                            poss = false;
                        }
                        i = nxt + 1;
                    }
                }
                if (!poss)
                    continue;
                int prev = 0;
                for (int j = 1; j <= c; j++) {
                    int i = 1;
                    boolean valid = true;
                    while (i <= r) {
                        int nxt = i;
                        while (nxt < r && b[nxt] == 0)
                            nxt++;
                        int count = 0;
                        for (int iter = i; iter <= nxt; iter++) {
                            count += pre[iter][j] - pre[iter][prev];
                        }
                        if (count > k) {
                            valid = false;
                        }
                        i = nxt + 1;
                    }
                    if (!valid) {
                        can++;
                        prev = j - 1;
                    }
                }
                res = Math.min(can, res);
            }
            w.println(res);
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

