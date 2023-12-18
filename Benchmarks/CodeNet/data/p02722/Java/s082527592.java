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
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FDivisionOrSubstraction solver = new FDivisionOrSubstraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDivisionOrSubstraction {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            long n = s.nextLong();
            long res = 2;
            for (long i = 2; i * i <= n; i++) {
                if (n % i != 0)
                    continue;
                ;
                long temp = n;
                while (temp % i == 0)
                    temp /= i;
                if (temp % i == 1) {
                    //w.println("? " + i);
                    res++;
                }
                if (i == n / i)
                    continue;
                temp = n;
                while (temp % (n / i) == 1)
                    temp /= n / i;
                if (temp % (n / i) == 1) {
                    //w.println("? " + (n / i));
                    res++;
                }
            }
            long m = n - 1;
            for (long i = 2; i * i <= m; i++) {
                if (m % i != 0)
                    continue;
                //w.println("?? " + i);
                res++;
                if (i != m / i) {
                    //w.println("?? " + (m / i));
                    res++;
                }
            }
            w.println(res);

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

        public long nextLong() {
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
}

