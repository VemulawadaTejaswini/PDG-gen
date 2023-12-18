import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class Edge implements Comparable<Edge> {
    int from, to, id, color;

    public Edge(int from, int to, int id, int color) {
        this.from = from;
        this.to = to;
        this.id = id;
        this.color = color;
    }

    @Override
    public int compareTo(Edge o) {
        return id - o.id;
    }
}

class Pair {
    int id, prevColor;

    public Pair(int id, int prevColor) {
        this.id = id;
        this.prevColor = prevColor;
    }
}

public class Main {

    static void bfs(int at) {
        visited = new boolean[N];
        visited[at] = true;
        Deque<Pair> deq = new ArrayDeque<>();
        deq.offer(new Pair(0, 0));

        while (!deq.isEmpty()) {
            Pair node = deq.poll();
            int color = 1;
            if (color == node.prevColor) ++color;

            for (Edge e : graph.get(node.id)) {
                if (visited[e.to]) continue;
                visited[e.to] = true;
                e.color = color++;
                edges.add(e);
                deq.offer(new Pair(e.to, e.color));

                if (color == node.prevColor) ++color;
            }
        }
    }

    static int N;
    static List<List<Edge>> graph;
    static List<Edge> edges;
    static boolean[] visited;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        N = fs.nextInt();
        edges = new ArrayList<>();
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < N-1; ++i) {
            int a = fs.nextInt() - 1;
            int b = fs.nextInt() - 1;
            graph.get(a).add(new Edge(a, b, i, 0));
            graph.get(b).add(new Edge(b, a, i, 0));
        }

        int maxDegree = 0;
        for (int i = 0; i < N; ++i) maxDegree = Math.max(maxDegree, graph.get(i).size());

        bfs(0);

        System.out.println(maxDegree);
        Collections.sort(edges);
        for (int i = 0; i < N-1; ++i) {
            System.out.println(edges.get(i).color);
        }
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
        }else{
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

    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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

    public double nextDouble() { return Double.parseDouble(next());}
}



























