import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        Graph graph;
        boolean[] seen1;
        boolean[] seen2;
        int[] dp;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[][] a = in.readIntTable(n, n - 1);
            MiscUtils.decreaseByOne(a);

            int size = n * (n - 1) / 2;

            graph = new Graph(size);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 2; j++) {
                    graph.addSimpleEdge(convert(i, a[i][j]), convert(i, a[i][j + 1]));
                }
            }

            seen1 = new boolean[size];
            seen2 = new boolean[size];
            dp = new int[size];
            Arrays.fill(dp, -1);

            int ans = 0;
            for (int i = 0; i < size; i++) {
                if (seen1[i]) continue;
                int res = dfs(i, -1);
                if (res == -1) {
                    out.printLine(-1);
                    return;
                }
                ans = Math.max(ans, res);
            }
            out.printLine(ans);
        }

        int dfs(int u, int p) {
            if (seen1[u] && !seen2[u]) return -1;
            if (dp[u] != -1) return dp[u];
            seen1[u] = true;
            int ret = 1;
            for (Edge e : graph.outbound(u)) {
                int v = e.getDestination();
                if (v == p) continue;
                int res = dfs(v, u);
                if (res == -1) return -1;
                ret = Math.max(ret, res + 1);
            }
            seen2[u] = true;
            return dp[u] = ret;
        }

        int convert(int x, int y) {
            if (x > y) {
                int tmp = x;
                x = y;
                y = tmp;
            }

            int base = y * (y - 1) / 2;
            return base + x;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }

    static class Graph {
        public static final int REMOVED_BIT = 0;
        protected int vertexCount;
        protected int edgeCount;
        private int[] firstOutbound;
        private int[] firstInbound;
        private Edge[] edges;
        private int[] nextInbound;
        private int[] nextOutbound;
        private int[] from;
        private int[] to;
        private long[] weight;
        public long[] capacity;
        private int[] reverseEdge;
        private int[] flags;

        public Graph(int vertexCount) {
            this(vertexCount, vertexCount);
        }

        public Graph(int vertexCount, int edgeCapacity) {
            this.vertexCount = vertexCount;
            firstOutbound = new int[vertexCount];
            Arrays.fill(firstOutbound, -1);

            from = new int[edgeCapacity];
            to = new int[edgeCapacity];
            nextOutbound = new int[edgeCapacity];
            flags = new int[edgeCapacity];
        }

        public int addEdge(int fromID, int toID, long weight, long capacity, int reverseEdge) {
            ensureEdgeCapacity(edgeCount + 1);
            if (firstOutbound[fromID] != -1) {
                nextOutbound[edgeCount] = firstOutbound[fromID];
            } else {
                nextOutbound[edgeCount] = -1;
            }
            firstOutbound[fromID] = edgeCount;
            if (firstInbound != null) {
                if (firstInbound[toID] != -1) {
                    nextInbound[edgeCount] = firstInbound[toID];
                } else {
                    nextInbound[edgeCount] = -1;
                }
                firstInbound[toID] = edgeCount;
            }
            this.from[edgeCount] = fromID;
            this.to[edgeCount] = toID;
            if (capacity != 0) {
                if (this.capacity == null) {
                    this.capacity = new long[from.length];
                }
                this.capacity[edgeCount] = capacity;
            }
            if (weight != 0) {
                if (this.weight == null) {
                    this.weight = new long[from.length];
                }
                this.weight[edgeCount] = weight;
            }
            if (reverseEdge != -1) {
                if (this.reverseEdge == null) {
                    this.reverseEdge = new int[from.length];
                    Arrays.fill(this.reverseEdge, 0, edgeCount, -1);
                }
                this.reverseEdge[edgeCount] = reverseEdge;
            }
            if (edges != null) {
                edges[edgeCount] = createEdge(edgeCount);
            }
            return edgeCount++;
        }

        protected final GraphEdge createEdge(int id) {
            return new GraphEdge(id);
        }

        public final int addFlowWeightedEdge(int from, int to, long weight, long capacity) {
            if (capacity == 0) {
                return addEdge(from, to, weight, 0, -1);
            } else {
                int lastEdgeCount = edgeCount;
                addEdge(to, from, -weight, 0, lastEdgeCount + entriesPerEdge());
                return addEdge(from, to, weight, capacity, lastEdgeCount);
            }
        }

        protected int entriesPerEdge() {
            return 1;
        }

        public final int addWeightedEdge(int from, int to, long weight) {
            return addFlowWeightedEdge(from, to, weight, 0);
        }

        public final int addSimpleEdge(int from, int to) {
            return addWeightedEdge(from, to, 0);
        }

        public final int destination(int id) {
            return to[id];
        }

        protected final void initEdges() {
            if (edges == null) {
                edges = new Edge[from.length];
                for (int i = 0; i < edgeCount; i++) {
                    edges[i] = createEdge(i);
                }
            }
        }

        public final boolean flag(int id, int bit) {
            return (flags[id] >> bit & 1) != 0;
        }

        public final void setFlag(int id, int bit) {
            flags[id] |= 1 << bit;
        }

        public final void removeEdge(int id) {
            setFlag(id, REMOVED_BIT);
        }

        public final boolean isRemoved(int id) {
            return flag(id, REMOVED_BIT);
        }

        public final Iterable<Edge> outbound(final int id) {
            initEdges();
            return new Iterable<Edge>() {
                public Iterator<Edge> iterator() {
                    return new EdgeIterator(id, firstOutbound, nextOutbound);
                }
            };
        }

        protected void ensureEdgeCapacity(int size) {
            if (from.length < size) {
                int newSize = Math.max(size, 2 * from.length);
                if (edges != null) {
                    edges = resize(edges, newSize);
                }
                from = resize(from, newSize);
                to = resize(to, newSize);
                nextOutbound = resize(nextOutbound, newSize);
                if (nextInbound != null) {
                    nextInbound = resize(nextInbound, newSize);
                }
                if (weight != null) {
                    weight = resize(weight, newSize);
                }
                if (capacity != null) {
                    capacity = resize(capacity, newSize);
                }
                if (reverseEdge != null) {
                    reverseEdge = resize(reverseEdge, newSize);
                }
                flags = resize(flags, newSize);
            }
        }

        protected final int[] resize(int[] array, int size) {
            int[] newArray = new int[size];
            System.arraycopy(array, 0, newArray, 0, array.length);
            return newArray;
        }

        private long[] resize(long[] array, int size) {
            long[] newArray = new long[size];
            System.arraycopy(array, 0, newArray, 0, array.length);
            return newArray;
        }

        private Edge[] resize(Edge[] array, int size) {
            Edge[] newArray = new Edge[size];
            System.arraycopy(array, 0, newArray, 0, array.length);
            return newArray;
        }

        protected class GraphEdge implements Edge {
            protected int id;

            protected GraphEdge(int id) {
                this.id = id;
            }

            public int getDestination() {
                return destination(id);
            }

        }

        public class EdgeIterator implements Iterator<Edge> {
            private int edgeID;
            private final int[] next;
            private int lastID = -1;

            public EdgeIterator(int id, int[] first, int[] next) {
                this.next = next;
                edgeID = nextEdge(first[id]);
            }

            private int nextEdge(int id) {
                while (id != -1 && isRemoved(id)) {
                    id = next[id];
                }
                return id;
            }

            public boolean hasNext() {
                return edgeID != -1;
            }

            public Edge next() {
                if (edgeID == -1) {
                    throw new NoSuchElementException();
                }
                lastID = edgeID;
                edgeID = nextEdge(next[lastID]);
                return edges[lastID];
            }

            public void remove() {
                if (lastID == -1) {
                    throw new IllegalStateException();
                }
                removeEdge(lastID);
                lastID = -1;
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

        public int[][] readIntTable(int rowCount, int columnCount) {
            int[][] table = new int[rowCount][];
            for (int i = 0; i < rowCount; i++) {
                table[i] = readIntArray(columnCount);
            }
            return table;
        }

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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

        public int readInt() {
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

    static interface Edge {
        public int getDestination();

    }

    static class MiscUtils {
        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }
            }
        }

    }
}

