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
 *
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        RWalk solver = new RWalk();
        solver.solve(1, in, out);
        out.close();
    }

    static class RWalk {
        int mod = 1000000007;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) arr[i] = in.readIntArray(n);
            arr = MatrixOperations.mat_exp(arr, k, mod);
            long ret = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ret = (ret + arr[i][j]) % mod;
                }
            }
            out.println(ret);
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

    }

    static class MatrixOperations {
        public static int[][] matrix_mult(int[][] A, int[][] B, int mod) {
            int[][] C = new int[A.length][A.length];
            for (int i = 0; i < A.length; i++)
                for (int j = 0; j < A.length; j++)
                    if (A[i][j] != 0)
                        for (int k = 0; k < A.length; k++)
                            C[i][k] = (int) ((C[i][k] + 1L * A[i][j] * B[j][k]) % mod);
            return C;
        }

        public static int[][] mat_exp(int[][] A, long e, int mod) {
            if (e == 0) {
                int n = A.length;
                int[][] r = new int[n][n];
                for (int i = 0; i < n; i++) {
                    r[i][i] = 1;
                }
                return r;
            }
            if (e == 1)
                return A;
            else if (e % 2 == 0) {
                int[][] A1 = mat_exp(A, e / 2, mod);
                return matrix_mult(A1, A1, mod);
            } else
                return matrix_mult(A, mat_exp(A, e - 1, mod), mod);
        }

    }
}

