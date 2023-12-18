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
                long value = in.nextLong();
                if (i == 0) {
                    bottles[i] = new Bottle(value, .25);
                } else if (i == 1) {
                    bottles[i] = new Bottle(value, .50);
                } else if (i == 2) {
                    bottles[i] = new Bottle(value, 1.0);
                } else if (i == 3) {
                    bottles[i] = new Bottle(value, 2.0);
                }
            }
            Arrays.sort(bottles, new Comparator<Bottle>() {

                public int compare(Bottle L, Bottle R) {
                    return Double.compare(L.price * 2.0D / L.capacity, R.price * 2.0D / R.capacity);
                }
            });
//        for (Bottle bottle : bottles) {
//            out.println(bottle.price + " " + bottle.capacity);
//        }
            long n = in.nextLong();
            long cost = 0;
            while (Double.compare(n, 0.0) != 0) {
                for (int i = 0; i < 4; i++) {
                    long temp = (long) (n / bottles[i].capacity);
                    n -= bottles[i].capacity * temp;
                    cost += temp * bottles[i].price;
                    //if (temp != 0) out.println(bottles[i].price + " " + bottles[i].capacity + " " + temp);
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

        public long nextLong() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            long res = 0;
            do {
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

