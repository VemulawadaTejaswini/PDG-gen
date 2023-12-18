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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ADarkerAndDarker solver = new ADarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADarkerAndDarker {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int h = s.nextInt(), wi = s.nextInt(), ans = 0, qh = 0, qt = 0;
            char c[][] = new char[h][];
            pair<pair<Integer, Integer>, Integer> l[] = new pair[h * wi];
            for (int i = 0; i < h; i++) {
                c[i] = s.next().toCharArray();
                for (int j = 0; j < wi; j++)
                    if (c[i][j] == '#') {
                        l[qt++] = new pair(new pair(i, j), 0);
                    }
            }
            while (qt > qh) {
                pair<pair<Integer, Integer>, Integer> p = l[qh++];
                if (p.x.x > 0 && c[p.x.x - 1][p.x.y] == '.') {
                    c[p.x.x - 1][p.x.y] = '#';
                    l[qt++] = new pair(new pair(p.x.x - 1, p.x.y), p.y + 1);
                }
                if (p.x.y < wi - 1 && c[p.x.x][p.x.y + 1] == '.') {
                    c[p.x.x][p.x.y + 1] = '#';
                    l[qt++] = new pair(new pair(p.x.x, p.x.y + 1), p.y + 1);
                }
                if (p.x.y > 0 && c[p.x.x][p.x.y - 1] == '.') {
                    c[p.x.x][p.x.y - 1] = '#';
                    l[qt++] = new pair(new pair(p.x.x, p.x.y - 1), p.y + 1);
                }
                if (p.x.x < h - 1 && c[p.x.x + 1][p.x.y] == '.') {
                    c[p.x.x + 1][p.x.y] = '#';
                    l[qt++] = new pair(new pair(p.x.x + 1, p.x.y), p.y + 1);
                }
                ans = p.y;
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

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
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

    static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            if (this.x.compareTo(other.x) != 0) return this.x.compareTo(other.x);
            return this.y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + "," + y.toString();
        }

        public boolean equals(Object obj) {
            pair<U, V> other = (pair<U, V>) obj;
            return this.x.equals(other.x) && this.y.equals(other.y);
        }

        public int hashCode() {
            return toString().hashCode();
        }

    }
}

