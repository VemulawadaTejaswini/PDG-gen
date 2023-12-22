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
        CXYZTriplets solver = new CXYZTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class CXYZTriplets {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt();
            int min = 6, max = 6 * (int) 1e8;
//        int[] a = new int[max + 1];

            StringBuilder sb = new StringBuilder();

            sb.append("0\n0\n0\n0\n0\n");
            for (int t = min; t <= n; t++) {
                boolean f = false;
                int fact = 1;
                for (int x = 1; x <= t; x++) {
                    int ans = 0;
                    for (int y = 1; y <= t; y++) {
                        int A = 1, B = x + y, C = x * x + y * y + x * y - t;
                        double z = (-B + Math.sqrt(B * B - 4 * A * C)) / 2;
                        if (z >= 1 && Math.round(z) == z) {
                            ans++;
                            if (x == y && y == z)
                                fact = 6;
                            else if (x == y || y == z || x == z)
                                fact = 2;
                            f = true;
                            break;
                        }
                    }
                    if (f) {
                        sb.append((6 / fact) + "\n");
                        break;
                    }
                }
                if (!f)
                    sb.append("0\n");
            }

            System.out.print(sb);
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

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
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

