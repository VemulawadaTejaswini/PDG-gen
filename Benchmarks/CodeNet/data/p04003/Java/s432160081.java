import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    private static final int INF = (int) 1e+9 + 7;
    private static Map<Long, Integer> idMap = new HashMap<>();
    private static GraphL g = new GraphL();

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int c = sc.nextInt();
            g.addEdge(new Edge(toId(p, c), toId(q, c), 0));
            g.addEdge(new Edge(toId(p, c), toId(p, 0), 0));
            g.addEdge(new Edge(toId(p, 0), toId(p, c), 1));
            g.addEdge(new Edge(toId(q, c), toId(q, 0), 0));
            g.addEdge(new Edge(toId(q, 0), toId(q, c), 1));
        }
        long ans = dijkstra(toId(1, 0), toId(n, 0));
        System.out.println(ans == INF ? -1 : ans);
    }

    private static int toId(int fst, int snd) {
        long lid = ((long) (fst) << 32) + (long) (snd);
        Integer id = idMap.get(lid);
        if (id == null) {
            idMap.put(lid, id = idMap.size());
            g.assoc.add(new ArrayList<>());
        }
        return id;
    }

    private static long dijkstra(int s, int t) {
        // O(E*logV)
        int[] d = new int[idMap.size()];
        Arrays.fill(d, INF);
        d[s] = 0;
        PriorityQueue<PriorityPair> q = new PriorityQueue<>(PriorityPair::compareTo);
        q.add(new PriorityPair(s, 0));
        while (!q.isEmpty()) {
            PriorityPair pair = q.poll();
            int from = pair.element;
            if (d[from] < pair.priority) continue;
            g.getNext(from).stream().filter(to -> d[to] > d[from] + g.getWeight(from, to)).forEach(to -> {
                d[to] = d[from] + g.getWeight(from, to);
                q.add(new PriorityPair(to, d[to]));
            });
        }
        return d[t];
    }

}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufLen = 0;

    private boolean hasNextByte() {
        if (ptr < bufLen) {
            return true;
        } else {
            ptr = 0;
            try {
                bufLen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bufLen <= 0) {
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

    private boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    private String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private long nextLong() {
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

    int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
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

class Edge {

    int s;
    int t;
    int w;

    Edge(int s, int t, int w) {
        this.s = s;
        this.t = t;
        this.w = w;
    }
}

class GraphL {

    public ArrayList<ArrayList<Integer>> assoc = new ArrayList<>();
    public Map<Long, Integer> weight = new HashMap<>();

    public boolean hasNext(int s) {
        return assoc.get(s) != null;
    }

    public boolean hasWeight(int s, int t) {
        return weight.containsKey(intPairToLong(s, t));
    }

    public ArrayList<Integer> getNext(int s) {
        return assoc.get(s);
    }

    public int getWeight(int s, int t) {
        return weight.get(intPairToLong(s, t));
    }

    private static long intPairToLong(int fst, int snd) {
        return ((long) (fst) << 32) | (long) snd & 0xffffffffL;
    }

    private static int getFstFromLong(long intPair) {
        return (int) (intPair >> 32);
    }

    private static int getSndFromLong(long intPair) {
        return (int) (intPair & 0xffffffffL);
    }

    public void addEdge(Edge edge) {
        assoc.get(edge.s).add(edge.t);
        weight.put(intPairToLong(edge.s, edge.t), edge.w);
    }
}