import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        DLunlunNumber solver = new DLunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLunlunNumber {
        int k;

        void recur(long a, int idx, int sz, ArrayList<Long> res) {
            if (res.size() == k)
                return;
            if (idx == sz) {
                res.add(a);
                return;
            }
            if (idx == 0) {
                for (int i = 1; i < 10; i++)
                    recur(i, 1, sz, res);
                return;
            }
            long r = a % 10;
            if (r - 1 >= 0)
                recur(10 * a + r - 1, idx + 1, sz, res);
            recur(10 * a + r, idx + 1, sz, res);
            if (r + 1 < 10)
                recur(10 * a + r + 1, idx + 1, sz, res);
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            k = s.nextInt();
        /*
        long[][] dp = new long[10][10];
        Arrays.fill(dp[0], 1);
        dp[0][0] = 0;
        long[] count = new long[11];
        count[1] = 9;
        for(int i = 1; i < 10; i++) {
            for(int j = 0; j < 9; j++) {
                if(j - 1 >= 0)
                    dp[i][j] += dp[i - 1][j - 1];
                dp[i][j] += dp[i - 1][j];
                if(j + 1 < 10)
                    dp[i][j] += dp[i - 1][j + 1];
                count[i + 1] += dp[i][j];
            }
        }
        */
            ArrayList<Long> res = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                recur(0, 0, i, res);
            }

            w.println(res.get(k - 1));
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

