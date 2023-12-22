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
        CWalkingTakahashi solver = new CWalkingTakahashi();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWalkingTakahashi {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long x = in.readLong(), k = in.readLong(), d = in.readLong();
            if (x < 0)
                x *= -1;
            long req = x / d;

            if (k <= req)
                x -= k * d; // this is the closest we can get to zero
            else {
                k -= req; // reach the closest to zero and exhaust the remaining moves by revolving
                if (k % 2 == 0)
                    x -= d * req;
                else
                    x -= d * (req + 1);
            }

            if (x < 0)
                x *= -1;

            System.out.println(x);

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

