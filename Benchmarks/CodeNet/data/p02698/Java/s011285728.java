import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "khokharnikunj8", 1 << 27);
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
            FLISOnTree solver = new FLISOnTree();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FLISOnTree {
        int[] val;
        int[] ans;
        int pointer;
        HashMap<Integer, Integer> map;
        int[][] G;
        int[] root;
        PersistentSegmentTree persistentSegment;
        int n;

        void findIt(int[] val) {
            int[] temp = Arrays.copyOf(val, val.length);
            Randomized.shuffle(temp);
            Arrays.sort(temp);
            map = new HashMap<>();
            pointer = 0;
            for (int i = 0; i < temp.length; ) {
                int j = i;
                while (j < temp.length && temp[j] == temp[i]) j++;
                map.put(temp[i], pointer++);
                i = j;
            }
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            val = new int[n];
            ans = new int[n];
            root = new int[n];
            persistentSegment = new PersistentSegmentTree(n + 5, n + 5);
            for (int i = 0; i < n; i++) val[i] = in.readInt();
            findIt(val);
            int[] from = new int[n - 1];
            int[] to = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                from[i] = in.readInt() - 1;
                to[i] = in.readInt() - 1;
            }
            G = packGraph(from, to, n);
            dfs(0, -1);
            for (int i : ans) out.println(i);

        }

        private void dfs(int node, int parent) {
            if (parent == -1) {
                ans[node] = 1;
                root[node] = persistentSegment.update(0, 0, n + 5, map.get(val[node]), ans[node]);
            } else {
                ans[node] = persistentSegment.query(root[parent], 0, n + 5, 0, map.get(val[node]) - 1) + 1;
                root[node] = persistentSegment.update(root[parent], 0, n + 5, map.get(val[node]), ans[node]);
                ans[node] = Math.max(ans[node], ans[parent]);
            }
            for (int i : G[node]) {
                if (i == parent) continue;
                dfs(i, node);
            }
        }

        public int[][] packGraph(int[] from, int[] to, int n) {
            return packGraph(from, to, n, from.length);
        }

        public int[][] packGraph(int[] from, int[] to, int n, int m) {
            int[][] g = new int[n + 1][];
            int p[] = new int[n + 1];
            for (int i = 0; i < m; i++) p[from[i]]++;
            for (int i = 0; i < m; i++) p[to[i]]++;
            for (int i = 0; i <= n; i++) g[i] = new int[p[i]];
            for (int i = 0; i < m; i++) {
                g[from[i]][--p[from[i]]] = to[i];
                g[to[i]][--p[to[i]]] = from[i];
            }
            return g;
        }

        class PersistentSegmentTree {
            public int[] tree;
            public int[] L;
            public int[] R;
            public int[] root;
            public int NEXT_FREE;
            public int logN;
            public int query_counter;
            public int N;

            public PersistentSegmentTree(int N, int updates) {
                this.N = N;
                logN = 20;
                NEXT_FREE = 0;
                query_counter = 0;
                root = new int[updates + 5];
                tree = new int[2 * (N + 5) + logN * (updates + 5)];
                L = new int[2 * (N + 5) + logN * (updates + 5)];
                R = new int[2 * (N + 5) + logN * (updates + 5)];
                build((root[query_counter++] = NEXT_FREE++), 0, N);
            }

            private void build(int id, int start, int end) {
                if (start == end) {
                    //default value can change
                    tree[id] = 0;
                    return;
                }
                L[id] = NEXT_FREE++;
                R[id] = NEXT_FREE++;
                int mid = (start + end) >> 1;
                build(L[id], start, mid);
                build(R[id], mid + 1, end);
                tree[id] = tree[L[id]] + tree[R[id]];
            }

            private int update(int id, int start, int end, int p, int v) {
                int ID = NEXT_FREE++;
                if (p == start && p == end) {
                    //adds value v to position p
                    //can assign as well
                    tree[ID] = v;

                    return ID;
                }
                L[ID] = L[id];
                R[ID] = R[id];
                int mid = (start + end) >> 1;
                if (p <= mid) L[ID] = update(L[id], start, mid, p, v);
                else R[ID] = update(R[id], mid + 1, end, p, v);
                tree[ID] = Math.max(tree[R[ID]], tree[L[ID]]);
                return ID;
            }

            int query(int id, int start, int end, int l, int r) {
                if (l > r) return 0;
                if (r < start || l > end) return 0;
                if (l <= start && end <= r) return tree[id];
                int mid = (start + end) >> 1;
                return Math.max(query(L[id], start, mid, l, r), query(R[id], mid + 1, end, l, r));
            }

        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 20];
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

    }

    static class Randomized {
        private static Random random = new Random();

        public static void shuffle(int[] data) {
            shuffle(data, 0, data.length - 1);
        }

        public static void shuffle(int[] data, int from, int to) {
            to--;
            for (int i = from; i <= to; i++) {
                int s = nextInt(i, to);
                int tmp = data[i];
                data[i] = data[s];
                data[s] = tmp;
            }
        }

        public static int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(1 << 20);
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
}

