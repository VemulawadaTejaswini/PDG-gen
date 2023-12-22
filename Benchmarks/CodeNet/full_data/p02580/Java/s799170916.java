import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pranay2516
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt(), m = in.nextInt(), rows[] = new int[h], cols[] = new int[w];
            Arrays.fill(rows, 0);
            Arrays.fill(cols, 0);
            ArrayList<GPair<Integer, Integer>> ar = new ArrayList<>();
            for (int i = 0; i < m; ++i) {
                int x = in.nextInt() - 1, y = in.nextInt() - 1;
                ar.add(new GPair(x, y));
                rows[x]++;
                cols[y]++;
            }
            int maxr = func.max(rows), maxc = func.max(cols), indr = 0, indc = 0;
            for (int i = 0; i < h; ++i) if (i == maxr) indr = i;
            for (int i = 0; i < w; ++i) if (i == maxc) indc = i;
            out.println(ar.contains(new GPair(indr, indc)) ? (maxr + maxc - 1) : (maxr + maxc));
        }

    }

    static class func {
        public static int max(int... v) {
            int max = Integer.MIN_VALUE;
            for (int i : v) max = Math.max(max, i);
            return max;
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
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class GPair<U, V> implements Comparable<GPair<U, V>> {
        public final U first;
        public final V second;

        public GPair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            GPair<?, ?> pair = (GPair<?, ?>) o;
            return first.equals(pair.first) &&
                    second.equals(pair.second);
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(GPair<U, V> o) {
            int value = ((Comparable<U>) first).compareTo(o.first);
            if (value != 0) {
                return value;
            }
            return ((Comparable<V>) second).compareTo(o.second);
        }

    }
}

