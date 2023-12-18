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
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            char[] x = in.readCharArray(n);
            long[] qty = new long[n + 1];
            char[] current = new char[n];
            long[] pow = IntegerUtils.generatePowers(2, n + 1, MiscUtils.MODF);
/*        long xx = 0;
        for (int i = 0; i < n; i++) {
            xx *= 2;
            xx += x[i] - '0';
        }
        long total = 0;
        for (int i = 0; i <= xx; i++) {
            int k = i;
            int ind = 0;
            do {
                if ((k & 1) == 0) {
                    k >>= 1;
                    k += 1 << (n - 1);
                } else {
                    k >>= 1;
                }
                ind++;
            } while (k != i);
            System.err.println(i + " " + ind);
            total += ind;
        }
        System.err.println(total);*/
            long answer = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i != 0 || n % (2 * i) == 0) {
                    continue;
                }
                for (int j = 0; j < i; j++) {
                    if (x[j] == '1') {
                        qty[i] += pow[i - j - 1];
                        current[j] = '1';
                    } else {
                        current[j] = '0';
                    }
                }
                boolean good = true;
                for (int j = i; j < n; j++) {
                    int at = '1' + '0' - current[j - i];
                    if (at > x[j]) {
                        good = false;
                        break;
                    } else if (at < x[j]) {
                        break;
                    }
                    current[j] = (char) at;
                }
                if (good) {
                    qty[i]++;
                }
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        qty[i] -= qty[j];
                    }
                }
                qty[i] %= MiscUtils.MODF;
                if (qty[i] < 0) {
                    qty[i] += MiscUtils.MODF;
                }
                answer += qty[i] * (2 * i) % MiscUtils.MODF;
            }
            answer %= MiscUtils.MODF;
            out.printLine(answer);
        }

    }

    static class MiscUtils {
        public static final int MODF = 998_244_353;

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

    static class IntegerUtils {
        public static long[] generatePowers(long base, int count, long mod) {
            long[] result = new long[count];
            if (count != 0) {
                result[0] = 1 % mod;
            }
            for (int i = 1; i < count; i++) {
                result[i] = result[i - 1] * base % mod;
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

        public char[] readCharArray(int size) {
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = readCharacter();
            }
            return array;
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

        public int readInt() {
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

        public char readCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

