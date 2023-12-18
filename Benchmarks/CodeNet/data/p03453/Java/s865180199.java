import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        PrintWriter out = new PrintWriter(outputStream);
        Task3 solver = new Task3();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task3 {
        long MOD = (long) 1e9 + 7;
        long[] sc;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int S = in.nextInt() - 1;
            int T = in.nextInt() - 1;

            EdgeWeightedDigraph G = new EdgeWeightedDigraph(N);

            for (int i = 0; i < M; i++) {
                int v = in.nextInt() - 1;
                int w = in.nextInt() - 1;
                int d = in.nextInt();

                G.addEdge(new DirectedEdge(v, w, d));
                G.addEdge(new DirectedEdge(w, v, d));
            }

            DijkstraSP dijkstraSP = new DijkstraSP(G, S);

            long ans = 1L;

            long shp = dijkstraSP.distTo(T);

            boolean[] marked = new boolean[N];
            sc = new long[N];

            int cnt = 0;

            for (DirectedEdge e : G.adj(T)) {
                int w = e.to();
                if (shp - e.weight() == dijkstraSP.distTo(w)) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                out.println(0);
            } else {
                out.println(cnt * (cnt - 1) % MOD);
            }


        }

    }

    static class DirectedEdge {
        private final int v;
        private final int w;
        private final long weight;

        public DirectedEdge(int v, int w, long weight) {
            if (v < 0) throw new IndexOutOfBoundsException("Vertex names must be nonnegative integers");
            if (w < 0) throw new IndexOutOfBoundsException("Vertex names must be nonnegative integers");
            if (Double.isNaN(weight)) throw new IllegalArgumentException("Weight is NaN");
            this.v = v;
            this.w = w;
            this.weight = weight;
        }

        public int from() {
            return v;
        }

        public int to() {
            return w;
        }

        public long weight() {
            return weight;
        }

        public String toString() {
            return v + "->" + w + " " + String.format("%5.2f", weight);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class IndexMinPQ<Key extends Comparable<Key>> implements Iterable<Integer> {
        private int NMAX;
        private int N;
        private int[] pq;
        private int[] qp;
        private Key[] keys;

        public IndexMinPQ(int NMAX) {
            if (NMAX < 0) throw new IllegalArgumentException();
            this.NMAX = NMAX;
            keys = (Key[]) new Comparable[NMAX + 1];    // make this of length NMAX??
            pq = new int[NMAX + 1];
            qp = new int[NMAX + 1];                   // make this of length NMAX??
            for (int i = 0; i <= NMAX; i++) qp[i] = -1;
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public boolean contains(int i) {
            if (i < 0 || i >= NMAX) throw new IndexOutOfBoundsException();
            return qp[i] != -1;
        }

        public void insert(int i, Key key) {
            if (i < 0 || i >= NMAX) throw new IndexOutOfBoundsException();
            if (contains(i)) throw new IllegalArgumentException("index is already in the priority queue");
            N++;
            qp[i] = N;
            pq[N] = i;
            keys[i] = key;
            swim(N);
        }

        public int delMin() {
            if (N == 0) throw new NoSuchElementException("Priority queue underflow");
            int min = pq[1];
            exch(1, N--);
            sink(1);
            qp[min] = -1;            // delete
            keys[pq[N + 1]] = null;    // to help with garbage collection
            pq[N + 1] = -1;            // not needed
            return min;
        }

        public void decreaseKey(int i, Key key) {
            if (i < 0 || i >= NMAX) throw new IndexOutOfBoundsException();
            if (!contains(i)) throw new NoSuchElementException("index is not in the priority queue");
            if (keys[i].compareTo(key) <= 0)
                throw new IllegalArgumentException("Calling decreaseKey() with given argument would not strictly decrease the key");
            keys[i] = key;
            swim(qp[i]);
        }

        private boolean greater(int i, int j) {
            return keys[pq[i]].compareTo(keys[pq[j]]) > 0;
        }

        private void exch(int i, int j) {
            int swap = pq[i];
            pq[i] = pq[j];
            pq[j] = swap;
            qp[pq[i]] = i;
            qp[pq[j]] = j;
        }

        private void swim(int k) {
            while (k > 1 && greater(k / 2, k)) {
                exch(k, k / 2);
                k = k / 2;
            }
        }

        private void sink(int k) {
            while (2 * k <= N) {
                int j = 2 * k;
                if (j < N && greater(j, j + 1)) j++;
                if (!greater(k, j)) break;
                exch(k, j);
                k = j;
            }
        }

        public Iterator<Integer> iterator() {
            return new HeapIterator();
        }

        private class HeapIterator implements Iterator<Integer> {
            private IndexMinPQ<Key> copy;

            public HeapIterator() {
                copy = new IndexMinPQ<Key>(pq.length - 1);
                for (int i = 1; i <= N; i++)
                    copy.insert(pq[i], keys[pq[i]]);
            }

            public boolean hasNext() {
                return !copy.isEmpty();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                return copy.delMin();
            }

        }

    }

    static class DijkstraSP {
        private long[] distTo;
        private DirectedEdge[] edgeTo;
        private IndexMinPQ<Long> pq;

        public DijkstraSP(EdgeWeightedDigraph G, int s) {
            for (DirectedEdge e : G.edges()) {
                if (e.weight() < 0)
                    throw new IllegalArgumentException("edge " + e + " has negative weight");
            }

            distTo = new long[G.V()];
            edgeTo = new DirectedEdge[G.V()];
            for (int v = 0; v < G.V(); v++)
                distTo[v] = Long.MAX_VALUE;
            distTo[s] = 0;

            // relax vertices in order of distance from s
            pq = new IndexMinPQ<Long>(G.V());
            pq.insert(s, distTo[s]);
            while (!pq.isEmpty()) {
                int v = pq.delMin();
                for (DirectedEdge e : G.adj(v))
                    relax(e);
            }

        }

        private void relax(DirectedEdge e) {
            int v = e.from(), w = e.to();
            if (distTo[w] > distTo[v] + e.weight()) {
                distTo[w] = distTo[v] + e.weight();
                edgeTo[w] = e;
                if (pq.contains(w)) pq.decreaseKey(w, distTo[w]);
                else pq.insert(w, distTo[w]);
            }
        }

        public long distTo(int v) {
            return distTo[v];
        }

    }

    static class EdgeWeightedDigraph {
        private final int V;
        private int E;
        private List<DirectedEdge>[] adj;

        public EdgeWeightedDigraph(int V) {
            if (V < 0) throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
            this.V = V;
            this.E = 0;
            adj = (List<DirectedEdge>[]) new LinkedList[V];
            for (int v = 0; v < V; v++)
                adj[v] = new LinkedList<DirectedEdge>();
        }

        public EdgeWeightedDigraph(int V, int E) {
            this(V);
            if (E < 0) throw new IllegalArgumentException("Number of edges in a Digraph must be nonnegative");
            for (int i = 0; i < E; i++) {
                int v = (int) (Math.random() * V);
                int w = (int) (Math.random() * V);
                long weight = 0;
                DirectedEdge e = new DirectedEdge(v, w, weight);
                addEdge(e);
            }
        }

        public EdgeWeightedDigraph(EdgeWeightedDigraph G) {
            this(G.V());
            this.E = G.E();
            for (int v = 0; v < G.V(); v++) {
                // reverse so that adjacency list is in same order as original
                Stack<DirectedEdge> reverse = new Stack<DirectedEdge>();
                for (DirectedEdge e : G.adj[v]) {
                    reverse.push(e);
                }
                for (DirectedEdge e : reverse) {
                    adj[v].add(e);
                }
            }
        }

        public int V() {
            return V;
        }

        public int E() {
            return E;
        }

        public void addEdge(DirectedEdge e) {
            int v = e.from();
            adj[v].add(e);
            E++;
        }

        public Iterable<DirectedEdge> adj(int v) {
            if (v < 0 || v >= V)
                throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (V - 1));
            return adj[v];
        }

        public Iterable<DirectedEdge> edges() {
            List<DirectedEdge> list = new LinkedList<DirectedEdge>();
            for (int v = 0; v < V; v++) {
                for (DirectedEdge e : adj(v)) {
                    list.add(e);
                }
            }
            return list;
        }

        public String toString() {
            String NEWLINE = System.getProperty("line.separator");
            StringBuilder s = new StringBuilder();
            s.append(V + " " + E + NEWLINE);
            for (int v = 0; v < V; v++) {
                s.append(v + ": ");
                for (DirectedEdge e : adj[v]) {
                    s.append(e + "  ");
                }
                s.append(NEWLINE);
            }
            return s.toString();
        }

    }
}

