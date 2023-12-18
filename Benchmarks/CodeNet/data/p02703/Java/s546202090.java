import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
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
        ETwoCurrencies solver = new ETwoCurrencies();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETwoCurrencies {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt(), MX = (n - 1) * 50, si = Math.min(s.nextInt(), MX);
            ArrayList<dist>[] a = new ArrayList[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1, ai = s.nextInt(), bi = s.nextInt();
                a[u].add(new dist(v, ai, bi));
                a[v].add(new dist(u, ai, bi));
            }
            pair<Long, Long>[] p = new pair[n];
            for (int i = 0; i < n; i++) p[i] = new pair<>(s.nextLong(), s.nextLong());
            long[][] ans = new long[n][MX + 1];
            PriorityQueue<dist> pq = new PriorityQueue<>();
            pq.add(new dist(0, si, 0));
            for (int i = 0; i < n; i++) Arrays.fill(ans[i], Long.MAX_VALUE);
            ans[0][si] = 0;
            while (!pq.isEmpty()) {
                dist cur = pq.poll();
                for (dist d : a[cur.x])
                    for (int j = 0; j <= MX; j++) {
                        long coins = cur.y - d.y + j * p[cur.x].x;
                        if (coins >= 0 && coins <= MX) {
                            long time = cur.z + d.z + j * p[cur.x].y;
                            if (ans[d.x][(int) coins] > time) {
                                ans[d.x][(int) coins] = time;
                                pq.add(new dist(d.x, coins, time));
                            }
                        }
                    }
            }
            for (int i = 1; i < n; i++) w.println(func.min(ans[i]) + " ");
        }

        public class dist implements Comparable<dist> {
            int x;
            long y;
            long z;

            public dist(int xi, long yi, long zi) {
                x = xi;
                y = yi;
                z = zi;
            }

            public int compareTo(dist o) {
                return Long.compare(y, o.y);
            }

        }

    }

    static class func {
        public static long min(long... v) {
            long min = Long.MAX_VALUE;
            for (long i : v) min = Math.min(min, i);
            return min;
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
            int i = x.compareTo(other.x);
            if (i != 0) return i;
            return y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return x.equals(other.x) && y.equals(other.y);
        }

        public int hashCode() {
            return 31 * x.hashCode() + y.hashCode();
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

        public long nextLong() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            long res = 0;

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

