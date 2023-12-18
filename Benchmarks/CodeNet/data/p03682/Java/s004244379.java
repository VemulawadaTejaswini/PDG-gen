import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {
    static final class Point {
        final int index;
        final int x;
        final int y;
        Point(int index, int x, int y) {
            this.index = index;
            this.x = x;
            this.y = y;
        }
        int x() {
            return x;
        }
        int y() {
            return y;
        }
    }
    static final class UnionFindTree {
        private final int[] parent;
        private final long[] weight;
        public UnionFindTree(int n) {
            if (n < 1) {
                throw new IllegalArgumentException();
            }
            parent = new int[n];
            Arrays.setAll(parent, i -> i);

            weight = new long[n];
        }
        public int root(int x) {
            if (parent[x] == x) {
                return x;
            }
            int r = root(parent[x]);
            weight[x] += weight[parent[x]];
            return parent[x] = r;
        }
        public boolean same(int x, int y) {
            return root(x) == root(y);
        }
        public boolean unite(int x, int y) {
            return unite(x, y, 0);
        }
        public boolean unite(int x, int y, long w) {
            int xr = root(x);
            int yr = root(y);
            if (xr == yr) {
                return false;
            }
            weight[yr] = w + weight(x) - weight(y);
            parent[yr] = xr;
            return true;
        }
        public long weight(int x) {
            root(x);
            return weight[x];
        }
        public long diff(int x, int y) {
            if (same(x, y)) {
                return weight(y) - weight(x);
            }
            throw new IllegalArgumentException();
        }
    }
    static final class Edge {
        public final int src;
        public final int dest;
        public final long weight;
        public Edge(int src, int dest, long weight) {
            if (src < 0 || dest < 0) {
                throw new IllegalArgumentException();
            }
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        public int src() {
            return src;
        }
        public int dest() {
            return dest;
        }
        public long weight() {
            return weight;
        }
        public Edge reverse() {
            return new Edge(dest, src, weight);
        }
    }
    static final class Kruskal {
        private static Comparator<Edge> weightOrder() {
            return Comparator.comparingLong(Edge::weight)
                             .thenComparingInt(Edge::src)
                             .thenComparingInt(Edge::dest);
        }
        public static List<Edge> exec(int vertexCount, List<Edge> edges) {
            List<Edge> sorted = new ArrayList<>(edges);
            sorted.sort(weightOrder());

            UnionFindTree t = new UnionFindTree(vertexCount);

            List<Edge> result = new ArrayList<>(vertexCount - 1);
            for (Edge e : sorted) {
                if (result.size() >= vertexCount - 1) {
                    break;
                }
                if (t.same(e.src, e.dest)) {
                    continue;
                }
                t.unite(e.src, e.dest);
                result.add(e);
            }
            return result;
        }
    }
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int[][] xy = in.nextVerticalIntArrays(2, n);
        int[] x = xy[0];
        int[] y = xy[1];

        Point[] p = IntStream.range(0, n)
                             .mapToObj(i -> new Point(i, x[i], y[i]))
                             .toArray(Point[]::new);

        List<Edge> edges = new ArrayList<>();

        Arrays.sort(p, Comparator.comparingInt(Point::x));
        for (int i = 0; i < n - 1; i++) {
            int yen = Math.abs(p[i].x - p[i + 1].x);
            edges.add(new Edge(p[i].index, p[i + 1].index, yen));
        }

        Arrays.sort(p, Comparator.comparingInt(Point::y));
        for (int i = 0; i < n - 1; i++) {
            int yen = Math.abs(p[i].y - p[i + 1].y);
            edges.add(new Edge(p[i].index, p[i + 1].index, yen));
        }

        long ans =
                Kruskal.exec(n, edges).stream().mapToLong(Edge::weight).sum();
        out.println(ans);
    }

    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private byte readByte() {
            if (point < readLength) {
                byte result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(byte c) {
            return 33 <= c && c <= 126;
        }
        public char nextChar() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        public String next() {
            return next(16);
        }
        public String next(int n) {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        public long nextLong() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        public int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        public long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        public char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        public char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        public int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        public long[][] nextVerticalLongArrays(int arrayCount,
                                               int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        public char[][] nextVerticalCharArrays(int arrayCount,
                                               int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        public void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(long[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        public void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringBuilder b = new StringBuilder();
            for (Iterator<?> i = iterable.iterator(); i.hasNext();) {
                b.append(i.next());
                while (i.hasNext()) {
                    b.append(delimiter).append(i.next());
                }
            }
            println(b.toString());
        }
    }
}
