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
 * @author Pranay2516
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Atcoder_B solver = new Atcoder_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class Atcoder_B {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[][] = new int[n][3], dp[][] = new int[n][3];
            for (int i = 0; i < n; ++i) a[i] = in.readIntArray(3);
            for (int i = 0; i < 3; ++i) dp[0][i] = a[0][i];
            for (int i = 1; i < n; ++i) {
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + a[i][0];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + a[i][1];
                dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + a[i][2];
            }
            out.println(func.max(dp[n - 1][0], dp[n - 1][1], dp[n - 1][2]));
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] readIntArray(int size) {
            int[] array = new int[(int) size];
            for (int i = 0; i < size; i++) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class func {
        public static int max(int... v) {
            int max = Integer.MIN_VALUE;
            for (int i : v) max = Math.max(max, i);
            return max;
        }

    }
}

