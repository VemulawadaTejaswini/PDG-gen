/**
 * Created by Aminul on 8/22/2020.
 */

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt();
        int sx = in.nextInt(), sy = in.nextInt();
        int tx = in.nextInt(), ty = in.nextInt();
        char[][] mat = new char[n][];
        for (int i = 0; i < n; i++) {
            mat[i] = in.next().toCharArray();
        }

        pw.println(bfs(n, m, sx - 1, sy - 1, tx - 1, ty - 1, mat));

        pw.close();
    }

    static final int inf = (int) 1e9;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};

    static boolean isValid(int x, int y, int n, int m, char[][] mat) {
        return x >= 0 && x < n && y >= 0 && y < m &&  mat[x][y] == '.';
    }
    
    static int bfs(int n, int m, int sx, int sy, int tx, int ty, char[][] mat) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[][] vis = new int[n][m];
        for (int[] a : vis) Arrays.fill(a, inf);
        queue.add(new int[]{sx, sy});
        vis[sx][sy] = 0;
        while (!queue.isEmpty()) {
            int p[] = queue.pollFirst();

            for (int i = 0; i < 4; i++) {
                int x = p[0] + dx[i], y = p[1] + dy[i];
                if (isValid(x, y, n, m, mat) && vis[x][y] > vis[p[0]][p[1]]) {
                    vis[x][y] = vis[p[0]][p[1]];
                    queue.addFirst(new int[]{x, y});
                }
            }

            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    int x = p[0] + i, y = p[1] + j;
                    if (isValid(x, y, n, m, mat) && vis[x][y] > vis[p[0]][p[1]] + 1) {
                        vis[x][y] = vis[p[0]][p[1]] + 1;
                        queue.addLast(new int[]{x, y});
                    }
                }
            }
        }

        if (vis[tx][ty] >= inf) return -1;
        return vis[tx][ty];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }


        public String nextLine() {
            int c = skip();
            StringBuilder sb = new StringBuilder();
            while (!isEndOfLine(c)) {
                sb.appendCodePoint(c);
                c = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char[] next(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        public char readChar() {
            return (char) skip();
        }
    }
}