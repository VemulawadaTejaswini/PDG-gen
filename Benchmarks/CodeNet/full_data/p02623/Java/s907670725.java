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
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTsundoku solver = new CTsundoku();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTsundoku {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int m = s.nextInt();
            long k = s.nextLong();
            long[] arr = s.nextLongArray(n);
            long[] brr = s.nextLongArray(m);

            long[] sumA = new long[n];
            long[] sumB = new long[m];

            sumA[0] = arr[0];
            for (int i = 1; i < n; i++) {
                sumA[i] = sumA[i - 1] + arr[i];
            }

            sumB[0] = brr[0];
            for (int i = 1; i < m; i++) {
                sumB[i] = sumB[i - 1] + brr[i];
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (sumA[i] > k) {
                    break;
                }

                int ans1 = i + 1;
                int pos = Arrays.binarySearch(sumB, k - sumA[i]);
                if (pos < 0) {
                    pos = (pos + 1) * -1;
                } else {
                    pos++;
                }

                ans1 += pos;
                ans = Math.max(ans, ans1);
            }

            for (int i = 0; i < m; i++) {
                if (sumB[i] > k) {
                    break;
                }

                int ans1 = i + 1;
                int pos = Arrays.binarySearch(sumA, k - sumB[i]);
                if (pos < 0) {
                    pos = (pos + 1) * -1;
                } else {
                    pos++;
                }

                ans1 += pos;
                ans = Math.max(ans, ans1);


            }

            out.println(ans);
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; ++i) array[i] = nextLong();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

