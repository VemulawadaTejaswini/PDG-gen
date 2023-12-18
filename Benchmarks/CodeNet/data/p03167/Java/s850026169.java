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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HGrid1 solver = new HGrid1();
        solver.solve(1, in, out);
        out.close();
    }

    static class HGrid1 {
        int MOD = (int) 1e9 + 7;
        int[] m1 = new int[]{0, 1};
        int[] m2 = new int[]{1, 0};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            String[] grd = new String[H];
            for (int i = 0; i < H; i++) {
                grd[i] = in.next();
            }
            long[][] dp = new long[H][W];
            dp[0][0] = 1;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    for (int k = 0; k < 2; k++) {
                        int tox = i + m1[k];
                        int toy = j + m2[k];
                        if (tox < H && toy < W && grd[i].charAt(j) == '.') {
                            dp[tox][toy] += dp[i][j];
                            dp[tox][toy] %= MOD;
                        }
                    }
                }
            }
            out.print(dp[H - 1][W - 1]);
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
            } while (!isSpaceChar(c));
            return res * sgn;
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

