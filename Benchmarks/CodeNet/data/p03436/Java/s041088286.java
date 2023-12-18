import java.util.*;
import java.io.IOException;
import java.io.InputStream;

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

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static class Pair {
        int h, w, cnt;

        public Pair(int h, int w, int cnt) {
            this.h = h;
            this.w = w;
            this.cnt = cnt;
        }
    }

    static int bfs() {
        visited = new boolean[H][W];
        visited[0][0] = true;
        prev = new Pair[H][W];
        prev[0][0] = new Pair(-1, -1, -1);

        Deque<Pair> que = new ArrayDeque<>();
        que.offer(new Pair(0, 0, 0));

        while (!que.isEmpty()) {
            Pair pair = que.poll();
            int ch = pair.h;
            int cw = pair.w;
            visited[ch][cw] = true;
            if (ch == H-1 && cw == W-1) return pair.cnt;
            for (int dir = 0; dir < 4; ++dir) {
                int nh = ch + dy[dir];
                int nw = cw + dx[dir];

                if (nh < 0 || nh >= H || nw < 0 || nw >= W) continue;
                if (grid[nh][nw] == '#') continue;
                if (visited[nh][nw]) continue;

                prev[nh][nw] = pair;
                que.offer(new Pair(nh, nw, pair.cnt + 1));
            }
        }

        return 0;
    }

    static int H;
    static int W;
    static int res = 1;
    static boolean[][] visited;
    static char[][] grid;
    static Pair[][] prev;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        H = fs.nextInt();
        W = fs.nextInt();
        grid = new char[H][W];
        for (int i = 0; i < H; ++i) grid[i] = fs.next().toCharArray();
        int black = 0;
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (grid[i][j] == '#') ++black;
            }
        }

        int cnt = bfs();

        if (cnt != 0)
            System.out.println(H * W - black - cnt - 1);
        else
            System.out.println(-1);

//        if (visited[H-1][W-1]) {
//            int h = H - 1;
//            int w = W - 1;
//            while (true) {
//                Pair pair = prev[h][w];
//                if (pair.h == -1 && pair.w == -1) break;
//                else ++res;
//                h = pair.h;
//                w = pair.w;
//            }
//            System.out.println((H * W - black - res));
//        }
//        else
//            System.out.println(-1);
    }
}