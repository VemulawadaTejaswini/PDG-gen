import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPass solver = new FPass();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPass {
        static final int mod = 998244353;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            char[] cs = in.nextChars();
            int[] r = new int[cs.length];
            int[] b = new int[cs.length];
            for (int i = 0; i < r.length; i++) {
                r[i] = cs[i] == '0' ? 2 : cs[i] == '1' ? 1 : 0;
                b[i] = cs[i] == '0' ? 0 : cs[i] == '1' ? 1 : 2;
            }
            int[][] maxR = new int[cs.length * 2][cs.length + 1];
            int[][] maxB = new int[cs.length * 2][cs.length + 1];
            for (int i = 0; i < cs.length; i++) {
                maxR[0][i] = r[i];
                maxB[0][i] = b[i];
            }
            for (int i = 1; i < maxR.length; i++) {
                for (int j = 0; j < cs.length; j++) {
                    maxR[i][j] += r[j] + Math.min(i, maxR[i - 1][j + 1]);
                    maxB[i][j] += b[j] + Math.min(i, maxB[i - 1][j + 1]);
                }
            }
            long[][] dp = new long[cs.length * 2 + 1][cs.length * 2 + 1];
            dp[0][0] = 1;
            for (int i = 1; i < dp.length; i++) {
                for (int j = 0; j < i; j++) {
                    final int blue = i - j - 1;
                    if (maxB[i - 1][0] > blue) {
//                    dump("B", i, j, dp[i - 1][j]);
                        dp[i][j] += dp[i - 1][j];   // b
                        if (dp[i][j] >= mod) dp[i][j] -= mod;
                    }
                    if (maxR[i - 1][0] >= j + 1) {
//                    dump("R", i, j, dp[i - 1][j]);
                        dp[i][j + 1] += dp[i - 1][j]; // r
                        if (dp[i][j] >= mod) dp[i][j] -= mod;
                    }
                }
            }
            out.println(Arrays.stream(dp[dp.length - 1]).sum() % mod);
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

