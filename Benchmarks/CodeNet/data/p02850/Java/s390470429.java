import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;

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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

public class Main {
    // static int MOD = 1000000007;

    // public static class Mas {
    // int x;
    // int y;
    // int step;

    // Mas(int x, int y, int step) {
    // this.x = x;
    // this.y = y;
    // this.step = step;
    // }
    // }

    static long pow(long l, long i) {
        if (i == 0)
            return 1;
        else {
            if (i % 2 == 0) {
                long val = pow(l, i / 2);
                return val * val % 2019;
            } else {
                return pow(l, i - 1) * l % 2019;
            }
        }
    }

    private static final int[] vX = { 1, 0, 0, -1 };
    private static final int[] vY = { 0, 1, -1, 0 };

    public static boolean test(int[] array) {
        array[1] = 3;
        return true;
    }

    static int N;

    static class Edge {
        int idx;
        int node;

        public Edge(int n, int i) {
            this.idx = i;
            this.node = n;
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        N = fs.nextInt();
        Map<Integer, List<Edge>> graph = new HashMap<>();
        Map<Integer, Set<Integer>> usedColor = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
            usedColor.put(i, new HashSet<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int v = fs.nextInt();
            int u = fs.nextInt();
            graph.get(v).add(new Edge(u, i));
            graph.get(u).add(new Edge(v, i));
        }
        int count = 0;
        for (List<Edge> adjs : graph.values()) {
            count = Math.max(count, adjs.size());
        }

        System.out.println(count);
        int[] colors = new int[N - 1];
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(1);
        visited.add(1);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            int c = 1;
            for (Edge e : graph.get(node)) {
                if (visited.contains(e.node))
                    continue;
                while (usedColor.get(node).contains(c) || usedColor.get(e.node).contains(c))
                    c++;
                if (colors[e.idx] == 0)
                    colors[e.idx] = c;
                usedColor.get(node).add(c);
                usedColor.get(e.node).add(c);
                queue.offer(e.node);
                visited.add(e.node);
                c++;
            }
        }
        for (int c : colors) {
            System.out.println(c);
        }
    }
}