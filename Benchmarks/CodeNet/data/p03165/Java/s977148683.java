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
        FLCS solver = new FLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLCS {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String S = in.next();
            String T = in.next();
            int[][] dp = new int[S.length() + 1][T.length() + 1];
            int[][][] from = new int[S.length() + 1][T.length() + 1][2];
            for (int i = 1; i <= S.length(); i++) {
                for (int j = 1; j <= T.length(); j++) {
                    if (S.charAt(i - 1) == T.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        from[i][j][0] = i - 1;
                        from[i][j][1] = j - 1;
                    } else {
                        if (dp[i - 1][j] > dp[i][j - 1]) {
                            dp[i][j] = dp[i - 1][j];
                            from[i][j][0] = i - 1;
                            from[i][j][1] = j;
                        } else {
                            dp[i][j] = dp[i][j - 1];
                            from[i][j][0] = i;
                            from[i][j][1] = j - 1;
                        }
                    }
                }
            }
            int ps = S.length();
            int pt = T.length();
            StringBuilder ans = new StringBuilder();
            while (ps != 0 || pt != 0) {
                int backs = from[ps][pt][0];
                int backt = from[ps][pt][1];
                if (backs == ps - 1 && backt == pt - 1) {
                    ans.append(S.charAt(backs));
                }
                ps = backs;
                pt = backt;
            }
            out.print(ans.reverse().toString());
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

