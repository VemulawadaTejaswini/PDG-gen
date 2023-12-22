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
        ELogsEditorial solver = new ELogsEditorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELogsEditorial {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt(), k = in.readInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = in.readInt();

            int lo = 1, hi = Integer.MAX_VALUE;

            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;

                if (isPossible(mid, a, k))
                    hi = mid;
                else
                    lo = mid + 1;
            }

            System.out.println(lo);
        }

        boolean isPossible(int mid, int[] a, int k) {

            for (int x : a) {
                if (x <= mid)
                    continue;

                k -= Math.ceil((double) x / mid) - 1;
            }

            return k >= 0;
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

