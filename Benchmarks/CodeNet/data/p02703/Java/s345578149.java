import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int[][] uvab = in.nextVerticalIntArrays(4, m);
        int[] u = decrement(uvab[0]);
        int[] v = decrement(uvab[1]);
        int[] a = uvab[2];
        int[] b = uvab[3];
        int[][] cd = in.nextVerticalIntArrays(2, n);
        int[] c = cd[0];
        int[] d = cd[1];

        List<Edge> edges =
                IntStream.range(0, m)
                         .mapToObj(i -> new Edge(u[i], v[i], a[i], b[i]))
                         .collect(Collectors.toList());
        AdjacencyList g = AdjacencyList.forUndirectedGraph(n, edges);

        int maxA = IntStream.of(a).max().getAsInt();
        int limit = maxA * (n - 1);
        var dp = new long[n][limit + 1];
        for (long[] e : dp) {
            Arrays.fill(e, Long.MAX_VALUE);
        }
        dp[0][Math.min(s, limit)] = 0;

        var q = new PriorityQueue<>(Comparator.comparingLong(Elem::time));
        q.offer(new Elem(0, Math.min(s, limit), 0));
        while (!q.isEmpty()) {
            Elem elem = q.poll();
            if (dp[elem.vertexId][elem.coins] < elem.time) {
                continue;
            }
            int addedCoins = Math.min(limit, elem.coins + c[elem.vertexId]);
            long addedTime = elem.time + d[elem.vertexId];
            if (dp[elem.vertexId][addedCoins] > addedTime) {
                dp[elem.vertexId][addedCoins] = addedTime;
                q.offer(new Elem(elem.vertexId, addedCoins, addedTime));
            }
            for (Edge edge : g.edgesFrom(elem.vertexId)) {
                int nextCoins = elem.coins - edge.a;
                long nextTime = elem.time + edge.b;
                if (nextCoins >= 0 && dp[edge.to][nextCoins] > nextTime) {
                    dp[edge.to][nextCoins] = nextTime;
                    q.offer(new Elem(edge.to, nextCoins, nextTime));
                }
            }
        }
        long[] answer =
                IntStream.range(1, n)
                         .mapToLong(i -> LongStream.of(dp[i]).min().getAsLong())
                         .toArray();
        out.printLines(answer);
    }
    static final class Elem {
        final int vertexId;
        final int coins;
        final long time;
        Elem(int vertexId, int coins, long time) {
            this.vertexId = vertexId;
            this.coins = coins;
            this.time = time;
        }
        long time() {
            return time;
        }
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
        final int a;
        final int b;

        Edge(int from, int to, int a, int b) {
            this.from = from;
            this.to = to;
            this.a = a;
            this.b = b;
        }
        Edge reverse() {
            return new Edge(to, from, a, b);
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
