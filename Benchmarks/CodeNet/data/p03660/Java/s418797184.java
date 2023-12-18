import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.ArrayDeque;

class Edge implements Comparable<Edge> {
    // 頂点番号 最小コスト
    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    // x.compereTo(y)
    // x は cost
    // y は Edge.cost
    @Override
    public int compareTo(Edge edge) {
        return this.cost - edge.cost;
    }
}

@SuppressWarnings("unchecked")
public class Main {
    // 道情報 行き 配列
    static ArrayList<Edge>[] routeList;

    // 所要コスト 行き 配列
    static int[] costAry;

    // 行ったことある、ない
    static boolean[] gone;

    // 幅優先探索 Breadth-First Search
    static void bfs(int start) {
        ArrayDeque<Edge> que = new ArrayDeque<>();

        // スタート地点をキューに入れる
        que.add(new Edge(start, 0));

        // 距離を0にする
        costAry[start] = 0;

        // 行ったことがある
        gone[start] = true;

        while (0 < que.size()) {
            Edge q = que.poll();

            for (int i = 0; i < routeList[q.to].size(); i++) {
                Edge e = routeList[q.to].get(i);

                // 行ったことがない
                if (gone[e.to] == false) {
                    costAry[e.to] = costAry[q.to] + e.cost;
                    // push 頂点 コスト
                    que.add(new Edge(e.to, costAry[e.to]));
                    // 行ったことがある
                    gone[e.to] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final String Fennec = "Fennec";
        final String Snuke = "Snuke";

        final int N = nextInt();

        routeList = new ArrayList[N];

        for (int i = 0; i < N; i++) routeList[i] = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            // 0-indexed
            final int a = nextInt() - 1;
            final int b = nextInt() - 1;

            routeList[a].add(new Edge(b, 1));
            routeList[b].add(new Edge(a, 1));
        }

        costAry = new int[N];
        gone = new boolean[N];

        for (int i = 0; i < N; i++) {
            // 初期化
            costAry[i] = 0;
            // 行ったことがない
            gone[i] = false;
        }

        // 幅優先探索 Breadth-First Search
        bfs(0);

        int[] tmp = new int[costAry.length];
        System.arraycopy(costAry, 0, tmp, 0, costAry.length);

        for (int i = 0; i < N; i++) {
            // 初期化
            costAry[i] = 0;
            // 行ったことがない
            gone[i] = false;
        }

        bfs(N - 1);

        int first = 0;
        int second = 0;
        for (int i = 0; i < N; i++) {
            if (tmp[i] <= costAry[i]) first++;
            else second++;
        }

        out.println(first <= second ? Snuke : Fennec);

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
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
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
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
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
