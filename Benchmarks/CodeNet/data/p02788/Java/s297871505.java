import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TreeMap;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        FSilverFoxVsMonster solver = new FSilverFoxVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSilverFoxVsMonster {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), d = s.nextInt(), a = s.nextInt();
            int[] x = new int[n];
            int[] h = new int[n];
            Pair[] pair = new Pair[n];
            for (int i = 0; i < n; i++) {
                x[i] = s.nextInt();
                h[i] = s.nextInt();
                pair[i] = new Pair(x[i], h[i]);
            }
            Arrays.sort(pair, new Comparator<Pair>() {

                public int compare(Pair o1, Pair o2) {
                    if (o1.x < o2.x)
                        return -1;
                    if (o1.x > o2.x)
                        return 1;
                    return 0;
                }
            });
            long res = 0;
            long add = 0;
            int curr = 0;
            TreeMap<Integer, Long> tm = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                Pair p = pair[i];
                if (tm.ceilingEntry(curr) != null) {
                    curr = tm.ceilingKey(curr);
                    while (curr <= p.x) {
                        add += tm.get(curr);
                        curr++;
                        if (tm.ceilingEntry(curr) != null)
                            curr = tm.ceilingKey(curr);
                        else
                            break;
                    }
                }
                curr = pair[i].x + 1;
                BigInteger b = BigInteger.valueOf(a).multiply(BigInteger.valueOf(add));
                if (b.compareTo(BigInteger.valueOf(pair[i].h)) >= 0)
                    continue;
                long val = pair[i].h - a * add;
                int left = i, right = n - 1;
                int end = i;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (pair[mid].x <= p.x + 2 * d) {
                        end = mid;
                        left = mid + 1;
                    } else
                        right = mid - 1;
                }
                long c = (val - 1) / a + 1;
                add += c;
                if (tm.get(pair[end].x + 1) == null)
                    tm.put(pair[end].x + 1, -c);
                else
                    tm.put(pair[end].x + 1, tm.get(pair[end].x + 1) - c);
                res += c;
            }
            w.println(res);
        }

        class Pair {
            int x;
            int h;

            Pair(int x, int h) {
                this.x = x;
                this.h = h;
            }

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

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
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

