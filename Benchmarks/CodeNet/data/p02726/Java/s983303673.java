import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            edges.add(new Edge(i, i + 1));
        }
        edges.add(new Edge(x, y));
        AdjacencyList al = AdjacencyList.forUndirectedGraph(n, edges);
        int[] answer = new int[n];
        for (int i = 0; i < n - 1; i++) {
            List<Vertex> vs = Dijkstra.exec(al, i);
            for (Vertex v : vs) {
                if (v.id <= i || v.distance == Long.MAX_VALUE) {
                    continue;
                }
                answer[(int)v.distance]++;
            }
        }
        for (int i = 1; i < n; i++) {
            out.println(answer[i]);
        }
    }
    static final class Vertex {
        public final int id;
        public long distance;
        public int previous;

        public Vertex(int id, long distance, int previous) {
            if (id < 0 || previous < -1) {
                throw new IllegalArgumentException();
            }
            this.id = id;
            this.distance = distance;
            this.previous = previous;
        }
        public static List<Vertex> path(List<Vertex> vertexes, int end) {
            List<Vertex> result = new ArrayList<>();
            Vertex v = vertexes.get(end);
            result.add(v);
            for (int i = v.previous; i != -1; i = v.previous) {
                v = vertexes.get(i);
                result.add(v);
            }
            Collections.reverse(result);
            return result;
        }
        @Override
        public int hashCode() {
            return Objects.hash(distance, id, previous);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Vertex)) {
                return false;
            }
            Vertex other = (Vertex)obj;
            return distance == other.distance
                   && id == other.id
                   && previous == other.previous;
        }
        @Override
        public String toString() {
            return "Vertex [id="
                   + id
                   + ", distance="
                   + distance
                   + ", previous="
                   + previous
                   + "]";
        }
    }
    static final class Dijkstra {
        private static final class Elem implements Comparable<Elem> {
            private final int vertexId;
            private final long vertexDistance;
            private Elem(int vertexId, long distance) {
                this.vertexId = vertexId;
                this.vertexDistance = distance;
            }
            @Override
            public int compareTo(Elem o) {
                if (vertexDistance < o.vertexDistance) {
                    return -1;
                }
                if (vertexDistance > o.vertexDistance) {
                    return 1;
                }
                return 0;
            }
        }
        public static List<Vertex> exec(AdjacencyList list, int start) {
            int n = list.vertexCount();

            List<Vertex> vertexes =
                    new ArrayList<>(Collections.nCopies(n, null));
            vertexes.set(start, new Vertex(start, 0, -1));

            Queue<Elem> queue = new PriorityQueue<>();
            queue.offer(new Elem(start, 0));

            boolean[] done = new boolean[n];

            while (!queue.isEmpty()) {
                Elem elem = queue.poll();

                if (done[elem.vertexId]) {
                    continue;
                }
                done[elem.vertexId] = true;

                Vertex srcVertex = vertexes.get(elem.vertexId);
                for (Edge edge : list.edgesFrom(srcVertex.id)) {
                    if (edge.weight < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (done[edge.to]) {
                        continue;
                    }
                    long newDistance = srcVertex.distance + edge.weight;
                    Vertex destVertex = vertexes.get(edge.to);
                    if (destVertex == null) {
                        destVertex =
                                new Vertex(edge.to, newDistance, srcVertex.id);
                        vertexes.set(edge.to, destVertex);
                    } else if (destVertex.distance > newDistance) {
                        destVertex.distance = newDistance;
                        destVertex.previous = srcVertex.id;
                    } else {
                        continue;
                    }
                    queue.offer(new Elem(destVertex.id, newDistance));
                }
            }
            for (int i = 0; i < vertexes.size(); i++) {
                if (vertexes.get(i) == null) {
                    vertexes.set(i, new Vertex(i, Long.MAX_VALUE, -1));
                }
            }
            return vertexes;
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
