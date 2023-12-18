import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private static long d = (long) 1000000007;

        private static long ncr(long n, long r) {
            long ans = 1;
            for (long i = 1; i <= r; i++) {
                ans *= n - i + 1;
                ans /= i;
                ans -= ans >= d ? d : 0;
            }
            return ans;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] count = new int[n + 1];
            int twiceI1 = 0;
            int twiceI2 = 0;
            for (int i = 0; i < n + 1; i++) {
                int cn = in.nextInt();
                if (count[cn] > 0) {
                    twiceI1 = count[cn];
                    twiceI2 = i;
                    break;
                }
                count[cn] = i + 1;
            }

            out.println(n);
            for (int i = 2; i <= n; i++) {
                long ans = ncr(n - 1, i);
                ans += 2 * ncr(n - 1, i - 1);
                ans -= ncr(n - 1 - (twiceI2 - twiceI1), i - 1);
                ans += ncr(n - 1, i - 2);
                ans -= ans >= d ? d : 0;
                out.println(ans);
            }
            out.println(1);

        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }
}

