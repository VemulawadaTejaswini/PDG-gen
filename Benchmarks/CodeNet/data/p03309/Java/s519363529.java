import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinearApproximation solver = new CLinearApproximation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinearApproximation {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt();
            int arr[] = in.nextIntArray(n);
            int cum[] = new int[n];
            Integer diff[] = new Integer[n];
            for (int i = 0; i < arr.length; i++) {
                diff[i] = (arr[i] - (i + 1));
            }
            Arrays.sort(diff);
            int min = 0;
            for (int i = 0; i < diff.length; i++) {
                min += Math.abs(diff[i]);
            }
            cum[0] = diff[0];
            for (int i = 1; i < n; i++) {
                cum[i] = cum[i - 1] + diff[i];
            }
            for (int i = n - 1; i >= 0; i--) {
                int ans = 0;
                if (i == 0) {
                    ans += cum[n - 1] - cum[i];
                    ans += (diff[i] * i) - (diff[i] * (n - i - 1));
                } else {
                    ans += -cum[i - 1] + (cum[n - 1] - cum[i]);
                    ans += (diff[i] * i) - (diff[i] * (n - i - 1));
                }
                min = Math.min(ans, min);
            }
            out.println(min);
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

