import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        int[][] uv = in.nextVerticalIntArrays(2, n - 1);
        int[] u = decrement(uv[0]);
        int[] v = decrement(uv[1]);
        List<Edge> edges = Edge.listOf(u, v);
        AdjacencyList tree = AdjacencyList.forUndirectedGraph(n, edges);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = Integer.MIN_VALUE;
        int[] answer = new int[n];
        dfs(dp, tree, a, 0, -1, answer);
        out.printLines(answer);
    }
    private static void dfs(int[] dp,
                            AdjacencyList tree,
                            int[] a,
                            int id,
                            int parent,
                            int[] answer) {
        int p = lowerBound(dp, a[id]);
        int old = dp[p];
        dp[p] = a[id];
        answer[id] = lowerBound(dp, Integer.MAX_VALUE) - 1;
        for (Edge e : tree.edgesFrom(id)) {
            if (e.to == parent) {
                continue;
            }
            dfs(dp, tree, a, e.to, e.from, answer);
        }
        dp[p] = old;
    }
    private static int lowerBound(int[] a, int key) {
        return lowerBound(a, 0, a.length, key);
    }
    private static int lowerBound(int[] a, int from, int to, int key) {
        if (from < 0 || to > a.length || from > to) {
            throw new IllegalArgumentException();
        }
        int low = from;
        int high = to - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (key <= a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    static final class AdjacencyList {
        private final List<List<Edge>> list;

        private AdjacencyList(List<List<Edge>> list) {
            this.list = list;
        }
        int vertexCount() {
            return list.size();
        }
        List<Edge> edgesFrom(int vertexId) {
            return list.get(vertexId);
        }
        static AdjacencyList forDirectedGraph(int vertexCount,
                                              List<Edge> edges) {
            List<List<Edge>> list =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            list.replaceAll(e -> new ArrayList<>());
            for (Edge e : edges) {
                list.get(e.from).add(e);
            }
            return new AdjacencyList(list);
        }
        static AdjacencyList forUndirectedGraph(int vertexCount,
                                                List<Edge> edges) {
            List<List<Edge>> list =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            list.replaceAll(e -> new ArrayList<>());
            for (Edge e : edges) {
                list.get(e.from).add(e);
                list.get(e.to).add(e.reverse());
            }
            return new AdjacencyList(list);
        }
    }
    static final class Edge {
        final int from;
        final int to;
        final long weight;
        final int id;

        Edge(int from, int to) {
            this(from, to, 1);
        }
        Edge(int from, int to, int weight) {
            this(from, to, weight, -1);
        }
        Edge(int from, int to, long weight, int id) {
            if (from < 0 || to < 0) {
                throw new IllegalArgumentException();
            }
            this.from = from;
            this.to = to;
            this.weight = weight;
            this.id = id;
        }
        int from() {
            return from;
        }
        int to() {
            return to;
        }
        long weight() {
            return weight;
        }
        Edge reverse() {
            return new Edge(to, from, weight, id);
        }
        static List<Edge> listOf(int[] from, int[] to) {
            return listOf(from, to, null);
        }
        static List<Edge> listOf(int[] from, int[] to, int[] weight) {
            if (from.length != to.length
                || (weight != null && from.length != weight.length)) {
                throw new IllegalArgumentException();
            }
            List<Edge> result = new ArrayList<>(from.length);
            for (int i = 0; i < from.length; i++) {
                result.add(new Edge(from[i],
                                    to[i],
                                    weight == null ? 1 : weight[i],
                                    i));
            }
            return result;
        }
    }
    private static int[] decrement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]--;
        }
        return a;
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
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
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
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                if (n < limit / 10L) {
                    throw new InputMismatchException();
                }
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit) {
                    throw new InputMismatchException();
                }
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
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
        void println(int[] x) {
            println(x, " ");
        }
        void println(int[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(long[] x) {
            println(x, " ");
        }
        void println(long[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }
        void println(Iterable<?> iterable, String delimiter) {
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }
        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}
