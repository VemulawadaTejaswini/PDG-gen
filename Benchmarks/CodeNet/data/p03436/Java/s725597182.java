import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    static void bfs() {
        dist = new int[H][W];
        visited = new boolean[H][W];
        for (int i = 0; i < H; ++i) {
            Arrays.fill(dist[i], 0);
            Arrays.fill(visited[i], false);
        }
        dist[0][0] = 1;
        visited[0][0] = true;

        Deque<Integer> Y = new ArrayDeque<>();
        Deque<Integer> X = new ArrayDeque<>();
        Y.offer(0);
        X.offer(0);

        while (!Y.isEmpty()) {
            int h = Y.poll();
            int w = X.poll();
            if (h == H-1 && w == W-1) break;

            for (int i = 0; i < 4; ++i) {
                int nh = h + dy[i];
                int nw = w + dx[i];

                if (nh < 0 || nh >= H || nw < 0 || nw >= W) continue;
                if (visited[nh][nw]) continue;
                if (grid[nh][nw] == '#') continue;

                dist[nh][nw] = dist[h][w] + 1;
                visited[nh][nw] = true;
                Y.offer(nh);
                X.offer(nw);
            }
        }
    }

    static int H, W;
    static char[][] grid;
    static int[][] dist;
    static boolean[][] visited;
    static int[] dy = {1, -1, 0, 0};
    static int[] dx = {0, 0, 1, -1};

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        H = fs.nextInt();
        W = fs.nextInt();
        int white = 0;
        grid = new char[H][W];
        for (int i = 0; i < H; ++i) {
            grid[i] = fs.next().toCharArray();
            for (int j = 0; j < W; ++j) {
                if (grid[i][j] == '.') ++white;
            }
        }

        bfs();

        if (visited[H-1][W-1])
            System.out.println(white - dist[H-1][W-1]);
        else
            System.out.println(-1);
    }


    static class FastScanner {
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

}