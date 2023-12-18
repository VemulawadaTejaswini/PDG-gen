import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EOddSubrectangles solver = new EOddSubrectangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class EOddSubrectangles {
        int mod = 998244353;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] arr = new int[n][m];
            BigInteger[] bs = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.readIntArray(m);
                bs[i] = BigInteger.ZERO;
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) bs[i] = bs[i].setBit(j);
                }
            }

            EOddSubrectangles.Basis bb = new EOddSubrectangles.Basis();
            for (int i = 0; i < n; i++) {
                bb.add(bs[i]);
            }

            if (bb.size == 0) {
                out.println(0);
                return;
            }

            long ans = 1;
            for (int j = 0; j < bb.size; j++) ans = ans * 2 % mod;
            ans = (ans + mod - 1) % mod;
            for (int j = 0; j < m - 1; j++) ans = ans * 2 % mod;
            for (int j = bb.size; j < n; j++) ans = ans * 2 % mod;
            out.println(ans);
        }

        static class Basis {
            public int size;
            public BigInteger[] basis;

            public Basis() {
                basis = new BigInteger[301];
                size = 0;
            }

            public boolean add(BigInteger x) {
                for (int i = size - 1; i >= 0; i--) {
                    BigInteger t = x.xor(basis[i]);
                    if (t.compareTo(x) < 0) {
                        x = t;
                    }
                }
                if (x.compareTo(BigInteger.ZERO) == 0) return false;
                basis[size++] = x;
                for (int i = size - 2; i >= 0; i--) {
                    if (basis[i].compareTo(basis[i + 1]) > 0) {
                        BigInteger t = basis[i + 1];
                        basis[i + 1] = basis[i];
                        basis[i] = t;
                    }
                }
                return true;
            }

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

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int[] readIntArray(int tokens) {
            int[] ret = new int[tokens];
            for (int i = 0; i < tokens; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

