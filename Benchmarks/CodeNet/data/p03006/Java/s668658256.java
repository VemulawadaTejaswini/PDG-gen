import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
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
        BPickingUp solver = new BPickingUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPickingUp {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), max = 1;
            pair<Integer, Integer> p[] = new pair[n];
            HashMap<pair<Integer, Integer>, Integer> h = new HashMap<>();
            for (int i = 0; i < n; i++) {
                p[i] = new pair(s.nextInt(), s.nextInt());
            }
            Arrays.sort(p);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int x = p[j].x - p[i].x, y = p[j].y - p[i].y;
                    pair pp = new pair(x, y);
                    if (!h.containsKey(pp)) {
                        h.put(pp, 1);
                    } else {
                        h.replace(pp, h.get(pp) + 1);
                        max = Math.max(max, h.get(pp));
                    }
                }
            }
            w.println(n == 1 ? 1 : n - max);
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
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (!(this.getClass() == obj.getClass())) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return this.x.equals(other.x) && this.y.equals(other.y);
        }

        public int hashCode() {
            return toString().hashCode();
        }

    }
}

