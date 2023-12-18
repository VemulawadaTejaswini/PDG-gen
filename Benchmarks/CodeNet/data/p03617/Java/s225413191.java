import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn Agrawal coderbond007  PLEASE!! PLEASE!! HACK MY SOLUTION!!
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            Bottle[] bottles = new Bottle[4];
            for (int i = 0; i < 4; i++) {
                int price = in.nextInt();
                if (i == 0) {
                    bottles[i] = new Bottle(price * 8, .25);
                } else if (i == 1) {
                    bottles[i] = new Bottle(price * 4, .50);
                } else if (i == 2) {
                    bottles[i] = new Bottle(price * 2, 1.0);
                } else if (i == 3) {
                    bottles[i] = new Bottle(price * 1, 2.0);
                }
            }
            double N = in.nextInt();
            Arrays.sort(bottles, Comparator.comparingLong(L -> L.price));
            long cost = 0;
            for (int i = 0; i < 4; i++) {
                if (bottles[i].capacity > N) {
                    continue;
                } else {
                    int temp = (int) (N / bottles[i].capacity);
                    N -= bottles[i].capacity * temp;
                    cost += (long) temp * bottles[i].price * bottles[i].capacity / 2.0D;
                }
            }
            out.println(cost);
        }

        public class Bottle {
            long price;
            double capacity;

            public Bottle(long price, double capacity) {
                this.price = price;
                this.capacity = capacity;
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        private static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

