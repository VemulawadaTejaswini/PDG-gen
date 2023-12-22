import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.io.Closeable;
import java.io.Writer;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            CMovingPieces solver = new CMovingPieces();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class CMovingPieces {
        boolean[][] visited;
        char[][] mat;
        int n;
        int m;
        int piece;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            m = in.readInt();
            mat = new char[n][m];
            for (int i = 0; i < n; i++) {
                in.readString(mat[i], 0);
            }

            visited = new boolean[n][m];
            List<int[]> pieces = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == 'o') {
                        pieces.add(new int[]{i, j});
                    }
                }
            }
            piece = pieces.size();
            List<IntegerCostFlowEdge>[] g = IntegerFlow.createCostFlow(idOfDst() + 1);
            for (int t = 0; t < piece; t++) {
                int[] xy = pieces.get(t);
                SequenceUtils.deepFill(visited, false);
                dfs(xy[0], xy[1]);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (!visited[i][j]) {
                            continue;
                        }
                        IntegerFlow.addCostEdge(g, idOfPiece(t), idOfCell(i, j), 1, xy[0] + xy[1] - i - j);
                    }
                }
            }

            for (int i = 0; i < piece; i++) {
                IntegerFlow.addCostEdge(g, idOfSrc(), idOfPiece(i), 1, 0);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    IntegerFlow.addCostEdge(g, idOfCell(i, j), idOfDst(), 1, 0);
                }
            }

            IntegerMinimumCostFlow mcf = new IntegerDijkstraMinimumCostFlow(g.length);
            int[] ans = mcf.apply(g, idOfSrc(), idOfDst(), (int) 1e9);
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(mat[i][j] == '#'){
//                    for(IntegerFlowEdge e : g[idOfCell(i, j)]){
//                        if(e.real && e.flow > 0){
//                            throw new RuntimeException();
//                        }
//                    }
//                }
//            }
//        }
            int move = -ans[1];
            out.println(move);
        }

        public void dfs(int i, int j) {
            if (i >= n || j >= m || visited[i][j] || mat[i][j] == '#') {
                return;
            }
            visited[i][j] = true;
            dfs(i + 1, j);
            dfs(i, j + 1);
        }

        public int idOfCell(int i, int j) {
            return i * m + j;
        }

        public int idOfPiece(int i) {
            return n * m + i;
        }

        public int idOfSrc() {
            return n * m + piece;
        }

        public int idOfDst() {
            return idOfSrc() + 1;
        }

    }

    static class IntegerDequeImpl implements IntegerDeque {
        private int[] data;
        private int bpos;
        private int epos;
        private static final int[] EMPTY = new int[0];
        private int n;

        public IntegerDequeImpl(int cap) {
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new int[cap];
            }
            bpos = 0;
            epos = 0;
            n = cap;
        }

        private void expandSpace(int len) {
            while (n < len) {
                n = Math.max(n + 10, n * 2);
            }
            int[] newData = new int[n];
            if (bpos <= epos) {
                if (bpos < epos) {
                    System.arraycopy(data, bpos, newData, 0, epos - bpos);
                }
            } else {
                System.arraycopy(data, bpos, newData, 0, data.length - bpos);
                System.arraycopy(data, 0, newData, data.length - bpos, epos);
            }
            epos = size();
            bpos = 0;
            data = newData;
        }

        public IntegerIterator iterator() {
            return new IntegerIterator() {
                int index = bpos;


                public boolean hasNext() {
                    return index != epos;
                }


                public int next() {
                    int ans = data[index];
                    index = IntegerDequeImpl.this.next(index);
                    return ans;
                }
            };
        }

        public int removeFirst() {
            int ans = data[bpos];
            bpos = next(bpos);
            return ans;
        }

        public void addLast(int x) {
            ensureMore();
            data[epos] = x;
            epos = next(epos);
        }

        public void clear() {
            bpos = epos = 0;
        }

        private int next(int x) {
            return x + 1 >= n ? 0 : x + 1;
        }

        private void ensureMore() {
            if (next(epos) == bpos) {
                expandSpace(n + 1);
            }
        }

        public int size() {
            int ans = epos - bpos;
            if (ans < 0) {
                ans += data.length;
            }
            return ans;
        }

        public boolean isEmpty() {
            return bpos == epos;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (IntegerIterator iterator = iterator(); iterator.hasNext(); ) {
                builder.append(iterator.next()).append(' ');
            }
            return builder.toString();
        }

    }

    static interface IntegerAugmentMinimumCostFlow extends IntegerMinimumCostFlow {
    }

    static class DigitUtils {
        private DigitUtils() {
        }

        public static int floorAverage(int x, int y) {
            return (x & y) + ((x ^ y) >> 1);
        }

        public static boolean equal(int a, int b) {
            return a == b;
        }

    }

    static class IntegerDijkstraMinimumCostFlow implements IntegerAugmentMinimumCostFlow {
        private int m;
        private IntegerPriorityQueueBasedOnSegment segment;
        private int[] lastDist;
        private int[] curDist;
        private IntegerCostFlowEdge[] prev;
        private boolean[] inq;
        private IntegerDeque dq;
        private static final int INF = Integer.MAX_VALUE / 4;
        private List<IntegerCostFlowEdge>[] g;
        private IntegerAugmentCallback callback = IntegerAugmentCallback.NIL;

        public IntegerDijkstraMinimumCostFlow(int m) {
            this.m = m - 1;
            this.segment = new IntegerPriorityQueueBasedOnSegment(0, m - 1);
            lastDist = new int[m];
            curDist = new int[m];
            prev = new IntegerCostFlowEdge[m];
            inq = new boolean[m];
            dq = new IntegerDequeImpl(m);
        }

        private void bf(int s) {
            int n = g.length;
            dq.clear();
            for (int i = 0; i < n; i++) {
                lastDist[i] = INF;
                inq[i] = false;
            }
            lastDist[s] = 0;
            inq[s] = true;
            dq.addLast(s);
            while (!dq.isEmpty()) {
                int head = dq.removeFirst();
                inq[head] = false;
                for (IntegerCostFlowEdge e : g[head]) {
                    if (e.rev.flow == 0 || lastDist[e.to] <= lastDist[head] + e.cost) {
                        continue;
                    }
                    lastDist[e.to] = lastDist[head] + e.cost;
                    if (!inq[e.to]) {
                        inq[e.to] = true;
                        dq.addLast(e.to);
                    }
                }
            }
        }

        private void dijkstra(int s) {
            int n = g.length;
            segment.reset(0, m);
            for (int i = 0; i < n; i++) {
                curDist[i] = INF;
                inq[i] = true;
                prev[i] = null;
            }
            curDist[s] = 0;
            segment.update(s, 0, m, 0);

            for (int i = 0; i < n; i++) {
                int head = segment.pop(0, m);
                inq[head] = false;
                if (curDist[head] >= INF) {
                    break;
                }
                for (IntegerCostFlowEdge e : g[head]) {
                    int dist;
                    if (DigitUtils.equal(e.rev.flow, 0) || !inq[e.to] || curDist[e.to] <= (dist = curDist[head] + e.cost - lastDist[e.to] + lastDist[head])) {
                        continue;
                    }
                    prev[e.to] = e.rev;
                    curDist[e.to] = dist;
                    segment.update(e.to, 0, m, curDist[e.to]);
                }
            }

            for (int i = 0; i < n; i++) {
                lastDist[i] = Math.min(curDist[i] + lastDist[i], INF);
            }
        }

        public int[] apply(List<IntegerCostFlowEdge>[] net, int s, int t, int send) {
            this.g = net;
            bf(s);
            int flow = 0;
            int cost = 0;
            while (flow < send) {
                dijkstra(s);
                if (prev[t] == null) {
                    break;
                }
                int remain = send - flow;
                for (IntegerCostFlowEdge trace = prev[t]; trace != null; trace = prev[trace.to]) {
                    remain = Math.min(remain, trace.flow);
                }
                int sumCost = 0;
                for (IntegerCostFlowEdge trace = prev[t]; trace != null; trace = prev[trace.to]) {
                    sumCost -= trace.cost;
                    IntegerFlow.send(trace, -remain);
                }
                cost += sumCost * remain;
                flow += remain;
                callback.callback(remain, sumCost);
            }
            return new int[]{flow, cost};
        }

    }

    static interface IntegerAugmentCallback {
        public static IntegerAugmentCallback NIL = (a, b) -> {
        };

        public void callback(int flow, int pathCost);

    }

    static interface IntegerIterator {
        boolean hasNext();

        int next();

    }

    static class IntegerFlow {
        public static <T extends IntegerFlowEdge> void send(T edge, int flow) {
            edge.flow += flow;
            edge.rev.flow -= flow;
        }

        public static IntegerCostFlowEdge addCostEdge(List<IntegerCostFlowEdge>[] g, int s, int t, int cap, int cost) {
            IntegerCostFlowEdge real = new IntegerCostFlowEdge(t, 0, true, cost);
            IntegerCostFlowEdge virtual = new IntegerCostFlowEdge(s, cap, false, -cost);
            real.rev = virtual;
            virtual.rev = real;
            g[s].add(real);
            g[t].add(virtual);
            return real;
        }

        public static List<IntegerCostFlowEdge>[] createCostFlow(int n) {
            return createGraph(n);
        }

        private static List[] createGraph(int n) {
            return IntStream.range(0, n).mapToObj(i -> new ArrayList<>()).toArray(i -> new List[i]);
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static class DirectedEdge {
        public int to;

        public DirectedEdge(int to) {
            this.to = to;
        }

        public String toString() {
            return "->" + to;
        }

    }

    static interface IntegerDeque extends IntegerStack {
        int removeFirst();

    }

    static interface IntegerMinimumCostFlow {
        int[] apply(List<IntegerCostFlowEdge>[] net, int s, int t, int send);

    }

    static interface IntegerStack {
        void addLast(int x);

        boolean isEmpty();

        void clear();

    }

    static class SequenceUtils {
        public static void deepFill(Object array, boolean val) {
            if (!array.getClass().isArray()) {
                throw new IllegalArgumentException();
            }
            if (array instanceof boolean[]) {
                boolean[] intArray = (boolean[]) array;
                Arrays.fill(intArray, val);
            } else {
                Object[] objArray = (Object[]) array;
                for (Object obj : objArray) {
                    deepFill(obj, val);
                }
            }
        }

    }

    static class IntegerPriorityQueueBasedOnSegment implements Cloneable {
        private static final int INF = Integer.MAX_VALUE;
        private IntegerPriorityQueueBasedOnSegment left;
        private IntegerPriorityQueueBasedOnSegment right;
        private int minimum;

        public void pushUp() {
            minimum = Math.min(left.minimum, right.minimum);
        }

        public IntegerPriorityQueueBasedOnSegment(int l, int r) {
            if (l < r) {
                int m = DigitUtils.floorAverage(l, r);
                left = new IntegerPriorityQueueBasedOnSegment(l, m);
                right = new IntegerPriorityQueueBasedOnSegment(m + 1, r);
                pushUp();
            } else {

            }
        }

        public void reset(int l, int r) {
            if (l < r) {
                int m = DigitUtils.floorAverage(l, r);
                left.reset(l, m);
                right.reset(m + 1, r);
                pushUp();
            } else {
                minimum = INF;
            }
        }

        public void update(int x, int l, int r, int val) {
            if (l > x || r < x) {
                return;
            }
            if (l == r) {
                minimum = val;
                return;
            }
            int m = DigitUtils.floorAverage(l, r);
            left.update(x, l, m, val);
            right.update(x, m + 1, r, val);
            pushUp();
        }

        public int pop(int l, int r) {
            if (l == r) {
                minimum = INF;
                return l;
            }
            int m = DigitUtils.floorAverage(l, r);
            int ans;
            if (left.minimum == minimum) {
                ans = left.pop(l, m);
            } else {
                ans = right.pop(m + 1, r);
            }
            pushUp();
            return ans;
        }

        private IntegerPriorityQueueBasedOnSegment deepClone() {
            IntegerPriorityQueueBasedOnSegment seg = clone();
            if (seg.left != null) {
                seg.left = seg.left.deepClone();
            }
            if (seg.right != null) {
                seg.right = seg.right.deepClone();
            }
            return seg;
        }

        protected IntegerPriorityQueueBasedOnSegment clone() {
            try {
                return (IntegerPriorityQueueBasedOnSegment) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        private void toString(StringBuilder builder) {
            if (left == null && right == null) {
                builder.append(minimum).append(",");
                return;
            }
            left.toString(builder);
            right.toString(builder);
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            deepClone().toString(builder);
            if (builder.length() > 0) {
                builder.setLength(builder.length() - 1);
            }
            return builder.toString();
        }

    }

    static class IntegerFlowEdge<T extends IntegerFlowEdge<T>> extends DirectedEdge {
        public int flow;
        public boolean real;
        public T rev;

        public IntegerFlowEdge(int to, int flow, boolean real) {
            super(to);
            this.flow = flow;
            this.real = real;
        }

        public String toString() {
            return rev.to + "-[" + flow + "/" + (flow + rev.flow) + "]->" + to;
        }

    }

    static class IntegerCostFlowEdge extends IntegerFlowEdge<IntegerCostFlowEdge> {
        public int cost;

        public IntegerCostFlowEdge(int to, int flow, boolean real, int cost) {
            super(to, flow, real);
            this.cost = cost;
        }

    }
}

