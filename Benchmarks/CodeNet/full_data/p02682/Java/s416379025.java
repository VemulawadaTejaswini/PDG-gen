import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BEasyLinearProgramming solver = new BEasyLinearProgramming();
        solver.solve(1, in, out);
        out.close();
    }

    static class BEasyLinearProgramming {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a = in.readLong(), b = in.readLong(), c = in.readLong(), k = in.readLong();
            long sum = 0;
            if (k <= a) {
                sum += k;
                k = 0;
            }
            if (k > a) {
                sum += a;
                k -= a;
            }
            if (k <= b) {
                k = 0;
            }

            if (k > b) {
                k -= b;
            }

            if (k <= c) {
                sum -= k;
                k = 0;
            }

            if (k > c) {
                sum -= k;

            }


            System.out.println(sum);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

