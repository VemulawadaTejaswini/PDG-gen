import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            EDistMax solver = new EDistMax();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EDistMax {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            pair<Integer, Integer>[] p = new pair[n];
            for (int i = 0; i < n; i++)
                p[i] = new pair<>(s.nextInt(), s.nextInt());
            for (int i = 0; i < n; i++) {
                int x = p[i].x, y = p[i].y;
                p[i].x = x - y;
                p[i].y = x + y;
            }
            func.sort(p);
            int mx1 = p[n - 1].x - p[0].x;
            func.sort(p, new Comparator<pair<Integer, Integer>>() {

                public int compare(pair<Integer, Integer> o1, pair<Integer, Integer> o2) {
                    return Integer.compare(o1.y, o2.y);
                }
            });
            w.println(Math.max(mx1, p[n - 1].y - p[0].y));
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
            int cmp = x.compareTo(other.x);
            return cmp == 0 ? y.compareTo(other.y) : cmp;
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

    static class func {
        public static <T extends Comparable<? super T>> void sort(T[] arr) {
            int n = arr.length, mid, h, s, l, i, j, k;
            T[] res = arr.clone();
            n--;
            for (s = 1; s <= n; s <<= 1) {
                for (l = 0; l < n; l += (s << 1)) {
                    h = Math.min(l + (s << 1) - 1, n);
                    mid = Math.min(l + s - 1, n);
                    i = l;
                    j = mid + 1;
                    k = l;
                    while (i <= mid && j <= h)
                        res[k++] = arr[i].compareTo(arr[j]) <= 0 ? arr[i++] : arr[j++];
                    while (i <= mid) res[k++] = arr[i++];
                    while (j <= h) res[k++] = arr[j++];
                    for (k = l; k <= h; k++) arr[k] = res[k];
                }
            }
        }

        public static <T> void sort(T[] arr, Comparator<T> comp) {
            int n = arr.length, mid, h, s, l, i, j, k;
            T[] res = arr.clone();
            n--;
            for (s = 1; s <= n; s <<= 1) {
                for (l = 0; l < n; l += (s << 1)) {
                    h = Math.min(l + (s << 1) - 1, n);
                    mid = Math.min(l + s - 1, n);
                    i = l;
                    j = mid + 1;
                    k = l;
                    while (i <= mid && j <= h)
                        res[k++] = comp.compare(arr[i], (arr[j])) <= 0 ? arr[i++] : arr[j++];
                    while (i <= mid) res[k++] = arr[i++];
                    while (j <= h) res[k++] = arr[j++];
                    for (k = l; k <= h; k++) arr[k] = res[k];
                }
            }
        }

    }
}

