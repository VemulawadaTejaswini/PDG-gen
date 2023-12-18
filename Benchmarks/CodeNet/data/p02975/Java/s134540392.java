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
 * @author Jeel Vaishnav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AXORCircle solver = new AXORCircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class AXORCircle {
        public void solve(int testNumber, InputReader sc, PrintWriter out) {
            int n = sc.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < n; ++i)
                a[i] = sc.nextInt();

            if (n % 3 != 0) {
                int flag = 0;
                for (int i = 0; i < n; ++i) {
                    if (a[i] != 0)
                        flag = 1;
                }

                if (flag == 0)
                    out.print("Yes");
                else
                    out.print("No");
                return;
            }

            Arrays.sort(a);
            int flag = 0;
            int val[] = new int[3];
            for (int i = 0; i < 3; ++i) {
                int start = n / 3 * i;
                for (int delta = 0; delta < n / 3; ++delta) {
                    if (a[start + delta] != a[start])
                        flag = 1;
                }
                val[i] = a[start];
            }
            int xor = val[0] ^ val[1] ^ val[2];
            if (xor != 0)
                flag = 1;
            if (flag == 0)
                out.print("Yes");
            else
                out.print("No");
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
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
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
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

