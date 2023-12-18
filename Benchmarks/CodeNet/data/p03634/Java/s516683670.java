import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TransitTreePath solver = new TransitTreePath();
        solver.solve(1, in, out);
        out.close();
    }

    static class TransitTreePath {
        List<LongPair>[] tree;
        long[] dist;
        final long INF = (long) 1e15;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            tree = new ArrayList[n + 1];
            dist = new long[n + 1];
            for (int i = 0; i <= n; i++) tree[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                tree[a].add(new LongPair(b, c));
                tree[b].add(new LongPair(a, c));
            }
            int q = in.nextInt();
            int k = in.nextInt();
            Arrays.fill(dist, INF);
            dist[k] = 0;
            ArrayDeque<LongPair> deque = new ArrayDeque<>();
            deque.add(new LongPair(k, 0));
            while (!deque.isEmpty()) {
                LongPair cur = deque.poll();
                for (LongPair neigh : tree[(int) cur.getFirst()]) {
                    long cost = neigh.getSecond();
                    int node = (int) neigh.getFirst();
                    if (dist[node] > dist[(int) cur.getFirst()] + cost) {
                        dist[node] = dist[(int) cur.getFirst()] + cost;
                        deque.add(new LongPair(node, dist[node]));
                    }
                }
            }
            for (int i = 0; i < q; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                out.println(dist[from] + dist[to]);
            }
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class LongPair implements Comparable<LongPair> {
        long first;
        long second;

        public LongPair(long first, long second) {
            this.first = first;
            this.second = second;
        }


        public int compareTo(LongPair a) {
            if (second == a.second) {
                return Long.compare(first, a.first);
            }
            return Long.compare(second, a.second);
        }


        public String toString() {
            return "<" + first + ", " + second + ">";
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LongPair longPair = (LongPair) o;

            if (first != longPair.first) return false;
            return second == longPair.second;
        }


        public int hashCode() {
            int result = (int) (first ^ (first >>> 32));
            result = 31 * result + (int) (second ^ (second >>> 32));
            return result;
        }

        public long getFirst() {
            return first;
        }

        public long getSecond() {
            return second;
        }

    }
}

