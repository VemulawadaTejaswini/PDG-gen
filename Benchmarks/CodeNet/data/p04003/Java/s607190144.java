import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static final int INF = Integer.MAX_VALUE / 2;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] q = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt() - 1;
            q[i] = sc.nextInt() - 1;
            c[i] = sc.nextInt();
        }
        int ans = dijkstra(n, p, q, c, 0)[n - 1];
        System.out.println(ans == INF ? -1 : ans);
    }

    private static int[] dijkstra(int v, int[] S, int[] T, int[] W, int s) {
        // O(E*logV)
        Graph g = new Graph.Builder(S, T).weighted(W).undirected().build();
        int[] d = IntStream.generate(() -> INF).limit(v).toArray();
        int[] prev = IntStream.generate(() -> -1).limit(v).toArray();
        d[s] = 0;
        PriorityQueue<PriorityPair> q = new PriorityQueue<>(PriorityPair::compareTo);
        q.add(new PriorityPair(s, 0));

        while (!q.isEmpty()) {
            PriorityPair pair = q.poll();
            int from = pair.element;
            if (d[from] < pair.priority) continue;
            if (!g.hasNext(from)) continue;
            for (int to : g.getNext(from)) {
                if (d[to] > d[from]) {
                    int c = !g.hasWeight(prev[from], from) || g.getWeight(from, to) != g.getWeight(prev[from], from) ? 1 : 0;
                    d[to] = d[from] + c;
                    prev[to] = from;
                    q.add(new PriorityPair(to, d[to]));
                }
            }
        }
        return d;
    }
}

class Graph {

    private Map<Integer, Set<Integer>> assoc;
    private Map<Pair, Integer> weight;
    private boolean weighted;
    private boolean directed;

    public Graph(Map<Integer, Set<Integer>> assoc, Map<Pair, Integer> weight, boolean weighted, boolean directed) {
        this.assoc = assoc;
        this.weight = weight;
        this.weighted = weighted;
        this.directed = directed;
    }

    public static class Builder {

        private Map<Integer, Set<Integer>> assoc;
        private Map<Pair, Integer> weight;

        private int[] s;
        private int[] t;
        private int[] w;
        private boolean weighted;
        private boolean directed;

        public Builder(int[] s, int[] t) {
            this.s = s;
            this.t = t;
            this.w = new int[Math.min(s.length, t.length)];
            this.weighted = false;
            this.directed = true;
        }

        public Builder weighted(int[] w) {
            this.weighted = true;
            this.w = w;
            return this;
        }

        public Builder directed() {
            this.directed = true;
            return this;
        }

        public Builder undirected() {
            this.directed = false;
            return this;
        }

        public Graph build() {
            assoc = new HashMap<>();
            weight = new HashMap<>();
            for (int i = 0; i < Math.min(Math.min(s.length, t.length), w.length); i++) {
                assoc.putIfAbsent(s[i], new HashSet<>());
                assoc.get(s[i]).add(t[i]);
                if (weighted) weight.put(new Pair(s[i], t[i]), w[i]);
                if (!directed) {
                    assoc.putIfAbsent(t[i], new HashSet<>());
                    assoc.get(t[i]).add(s[i]);
                    if (weighted) weight.put(new Pair(t[i], s[i]), w[i]);
                }
            }
            return new Graph(assoc, weight, weighted, directed);
        }

    }

    public boolean hasNext(int s) {
        return assoc.containsKey(s);
    }

    public boolean hasWeight(int s, int t) {
        return weight.containsKey(new Pair(s, t));
    }

    public Set<Integer> getNext(int s) {
        return assoc.get(s);
    }

    public int getWeight(int s, int t) {
        return weight.get(new Pair(s, t));
    }

    public List<Triple> getWeightedEdges() {
        List<Triple> edges = new LinkedList<>();
        for (Map.Entry<Integer, Set<Integer>> entry : assoc.entrySet()) {
            int s = entry.getKey();
            edges.addAll(entry.getValue().stream().map(t -> new Triple(s, t, getWeight(s, t))).collect(Collectors.toList()));
        }
        return edges;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        Set<Pair> memo = new HashSet<>();
        for (Map.Entry<Integer, Set<Integer>> entry : assoc.entrySet()) {
            int s = entry.getKey();
            for (Integer t : entry.getValue()) {
                if (!directed && memo.contains(new Pair(t, s))) continue;
                b.append(s).append(!directed ? "<-" : "--").append(weighted ? getWeight(s, t) : "").append("->").append(t).append("\n");
                memo.add(new Pair(s, t));
            }
        }
        return b.toString();
    }
}

class PriorityPair implements Comparable<PriorityPair> {

    public int element;
    public int priority;

    public PriorityPair(int element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    public PriorityPair(List<Integer> list) {
        this.element = list.get(0);
        this.priority = list.get(1);
    }

    public PriorityPair(int[] array) {
        this.element = array[0];
        this.priority = array[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriorityPair that = (PriorityPair) o;

        return element == that.element && priority == that.priority;

    }

    @Override
    public int hashCode() {
        int result = element;
        result = 31 * result + priority;
        return result;
    }

    @Override
    public int compareTo(PriorityPair o) {
        return Integer.compare(priority, o.priority);
    }

    @Override
    public String toString() {
        return "(" + element + ", priority=" + priority + ")";
    }
}

class Pair {

    public int fst;
    public int snd;

    public Pair(int fst, int snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public Pair(List<Integer> list) {
        this.fst = list.get(0);
        this.snd = list.get(1);
    }

    public Pair(int[] array) {
        this.fst = array[0];
        this.snd = array[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair pair = (Pair) o;

        return fst == pair.fst && snd == pair.snd;

    }

    @Override
    public int hashCode() {
        int result = fst;
        result = 31 * result + snd;
        return result;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }

    public void swap() {
        int swap = fst;
        fst = snd;
        snd = swap;
    }
}

class Triple {

    public int fst;
    public int snd;
    public int trd;

    public Triple(int fst, int snd, int trd) {
        this.fst = fst;
        this.snd = snd;
        this.trd = trd;
    }

    public Triple(List<Integer> list) {
        this.fst = list.get(0);
        this.snd = list.get(1);
        this.trd = list.get(2);
    }

    public Triple(int[] array) {
        this.fst = array[0];
        this.snd = array[1];
        this.trd = array[2];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triple triple = (Triple) o;

        return fst == triple.fst && snd == triple.snd && trd == triple.trd;

    }

    @Override
    public int hashCode() {
        int result = fst;
        result = 31 * result + snd;
        result = 31 * result + trd;
        return result;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ", " + trd + ")";
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
