import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        OutputWriter out = new OutputWriter(outputStream);
        FPolynomialConstruction solver = new FPolynomialConstruction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPolynomialConstruction {
        int MOD;

        int get(int i, int n) {
            int v = 1;
            for (int j = 1; j <= n; j++) if (j != i) v = (int) ((v * 1L * (i - j)) % MOD);
            return (v % MOD + MOD) % MOD;
        }

        void add(int k, int[] arr) {
            // x - k
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = (int) ((arr[i - 1] - arr[i] * 1L * k) % MOD);
                if (arr[i] < 0) arr[i] += MOD;
//            if(arr[i] >= MOD) arr[i] -= MOD;
            }
            arr[0] = -k * arr[0] % MOD;
            if (arr[0] < 0) arr[0] += MOD;

        }

        void go(int[] curr, int[] a, int[] poly, int l, int r, int n) {
            if (l == r) {
                int v = (int) ((a[l] * 1L * get(l + 1, n)) % MOD);
                for (int j = 0; j < curr.length; j++) {
                    poly[j] += (v * 1L * curr[j]) % MOD;
                    if (poly[j] >= MOD)
                        poly[j] -= MOD;
                }
                return;
            }
            int mid = (l + r) / 2;
            int[] x = curr.clone();

            for (int i = l; i <= mid; i++) add(i, curr);
            go(curr, a, poly, mid + 1, r, n);
            for (int i = mid + 1; i <= r; i++) add(i, x);
            go(x, a, poly, l, mid, n);
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            MOD = in.nextInt();
            int[] poly = new int[MOD];
            int[] curr = new int[MOD];
            int[] a = new int[MOD];
            curr[0] = 1;

            for (int i = 0; i < MOD; i++) a[i] = in.nextInt();
            go(curr, a, poly, 0, MOD - 1, MOD);
            for (int i = 0; i < MOD; i++) out.print(poly[i] + " ");
            out.println();
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
            writer.print('\n');
        }

        public void close() {
            writer.close();
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
            while (isSpaceChar(c)) c = read();
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

