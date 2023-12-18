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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqueue solver = new DEqueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqueue {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt(), a[] = new int[n];
            long ans = 0;
            for (int i = 0; i < n; i++) a[i] = s.nextInt();
            for (int i = 0; i < Math.min(n, k); i++) {
                for (int j = 0; i + j < Math.min(n, k); j++) {
                    long curans = 0, remove = 0;
                    int num[] = new int[i + j], cur = 0;
                    for (int m = 0; m < i; m++) {
                        curans += a[m];
                        num[cur++] = a[m];
                    }
                    for (int m = n - 1; m > n - j - 1; m--) {
                        curans += a[m];
                        num[cur++] = a[m];
                    }
                    Arrays.sort(num);
                    for (int m = 0; m < cur && m < k - cur && num[m] < 0; m++) remove += num[m];
                    ans = Math.max(ans, curans - remove);
                }
            }
            w.println(ans);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

