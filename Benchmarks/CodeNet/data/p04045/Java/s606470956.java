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
 *
 * @author Kishore
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) arr[i] = in.nextInt();
            Arrays.sort(arr);
            int dum = n, numLen = 0;
            while (dum > 0) {
                ++numLen;
                dum /= 10;
            }
            int[] numArr = new int[numLen];
            for (int i = 0; i < numLen; i++) {
                numArr[i] = n % 10;
                n /= 10;
            }
            for (int i = 0; i < numLen; i++) {
                for (int j = 0; j < k; j++) {
                    if (numArr[i] == arr[j]) {
                        numArr[i]++;
                    }
                }
                if (numArr[i] >= 10) {
                    if (i + 1 < numLen)
                        numArr[i + 1]++;
                    else break;
                    numArr[i] /= 10;
                    --i;
                }
            }
            int carry = 0;
            if (numArr[numLen - 1] >= 10) {
                carry = numArr[numLen - 1] / 10;
                numArr[numLen - 1] = numArr[numLen - 1] % 10;
                for (int j = 0; j < k; j++) {
                    if (numArr[numLen - 1] == arr[j]) {
                        numArr[numLen - 1]++;
                    }
                }
                for (int j = 0; j < k; j++) {
                    if (carry == arr[j]) {
                        carry++;
                    }
                }
            }
            if (carry != 0)
                out.print(carry);
            for (int i = numLen - 1; i >= 0; --i) {
                out.print(numArr[i]);
            }
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

