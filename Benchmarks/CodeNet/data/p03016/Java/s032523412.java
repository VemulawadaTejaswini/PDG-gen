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
        FTakahashisBasicsInEducationAndLearning solver = new FTakahashisBasicsInEducationAndLearning();
        solver.solve(1, in, out);
        out.close();
    }

    static class FTakahashisBasicsInEducationAndLearning {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long l = in.readLong();
            long a = in.readLong();
            long b = in.readLong();
            long m = in.readLong();

            Matrix.mod = m;

            long d = 1;
            long ans = 0;
            for (int i = 0; i < 18; i++) {
                long from = Math.max(0, (d - a + b - 1) / b);
                long to = Math.min(l, (10 * d - a + b - 1) / b);

                d *= 10;
                if (from >= to) continue;

                Matrix m1 = new Matrix(new long[][]{
                        {d % m, 0, 0},
                        {1, 1, 0},
                        {0, b % m, 1}
                });
                m1 = m1.fastPower(to - from);

                Matrix m2 = new Matrix(new long[][]{{ans, (a + b % m * from) % m, 1}});
                Matrix mul = Matrix.fastMultiply(m2, m1);
                ans = mul.data[0][0];
            }

            out.printLine(ans);
        }

    }

    static class Matrix {
        public static long mod = Long.MAX_VALUE;
        public final long[][] data;
        public final int rowCount;
        public final int columnCount;

        public Matrix(int rowCount, int columnCount) {
            this.rowCount = rowCount;
            this.columnCount = columnCount;
            this.data = new long[rowCount][columnCount];
        }

        public Matrix(long[][] data) {
            this.rowCount = data.length;
            this.columnCount = data[0].length;
            this.data = data;
        }

        public static Matrix multiply(Matrix first, Matrix second) {
            Matrix result = new Matrix(first.rowCount, second.columnCount);
            for (int i = 0; i < first.rowCount; i++) {
                for (int j = 0; j < second.rowCount; j++) {
                    for (int k = 0; k < second.columnCount; k++) {
                        result.data[i][k] = (result.data[i][k] + first.data[i][j] * second.data[j][k]) % mod;
                    }
                }
            }
            return result;
        }

        public static Matrix fastMultiply(Matrix first, Matrix second) {
            Matrix result = new Matrix(first.rowCount, second.columnCount);
            for (int i = 0; i < first.rowCount; i++) {
                for (int j = 0; j < second.rowCount; j++) {
                    for (int k = 0; k < second.columnCount; k++) {
                        result.data[i][k] += first.data[i][j] * second.data[j][k];
                    }
                }
            }
            for (int i = 0; i < first.rowCount; i++) {
                for (int j = 0; j < second.columnCount; j++) {
                    result.data[i][j] %= mod;
                }
            }
            return result;
        }

        public static Matrix identityMatrix(int size) {
            Matrix result = new Matrix(size, size);
            for (int i = 0; i < size; i++) {
                result.data[i][i] = 1;
            }
            return result;
        }

        public Matrix power(long exponent) {
            if (exponent == 0) {
                return identityMatrix(rowCount);
            }
            if (exponent == 1) {
                return this;
            }
            Matrix result = power(exponent >> 1);
            result = multiply(result, result);
            if ((exponent & 1) == 1) {
                result = multiply(result, this);
            }
            return result;
        }

        public Matrix fastPower(long exponent) {
            if (exponent == 0) {
                return identityMatrix(rowCount);
            }
            if (exponent == 1) {
                return this;
            }
            Matrix result = power(exponent >> 1);
            result = fastMultiply(result, result);
            if ((exponent & 1) == 1) {
                result = fastMultiply(result, this);
            }
            return result;
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

        public long readLong() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

        public void printLine(long i) {
            writer.println(i);
        }

    }
}

