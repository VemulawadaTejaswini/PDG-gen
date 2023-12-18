import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
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
                TaskD solver = new TaskD();
                solver.solve(1, in, out);
                out.close();
        }

        static class TaskD {
                final int INF = (int) 1e9 + 7;
                int[] dx = {-1, 1, 0, 0};
                int[] dy = {0, 0, 1, -1};
                char[][] ar;
                boolean[][] vis;
                int n;
                int m;
                int dist = INF;
                boolean got = false;

                public void solve(int testNumber, InputReader in, PrintWriter out) {
                        n = in.i();
                        m = in.i();
                        ar = new char[n][m];
                        vis = new boolean[n][m];
                        for (int i = 0; i < n; i++) ar[i] = in.s().toCharArray();
                        int count_sharp = 0;
                        for (int i = 0; i < n; i++) {
                                for (int j = 0; j < m; j++) {
                                        if (ar[i][j] == '#') count_sharp++;
                                }
                        }
                        bfs(0, 0);
                        if (!got) {
                                out.println(-1);
                                return;
                        }
                        dist--;
                        out.println(n * m - count_sharp - dist - 2);

                }

                void bfs(int x, int y) {
                        vis[x][y] = true;
                        Queue<TaskD.Point> q = new LinkedList<>();
                        q.add(new TaskD.Point(x, y));
                        while (!q.isEmpty()) {
                                TaskD.Point p = q.remove();
                                if (p.x == n - 1 && p.y == m - 1) {
                                        got = true;
                                        dist = Math.min(dist, p.dist);
                                        return;
                                }
                                for (int i = 0; i < 4; i++) {
                                        if (isValid(p.x + dx[i], p.y + dy[i]) && !vis[p.x + dx[i]][p.y + dy[i]]) {
                                                vis[p.x + dx[i]][p.y + dy[i]] = true;
                                                TaskD.Point po = new TaskD.Point(p.x + dx[i], p.y + dy[i]);
                                                po.dist = p.dist + 1;
                                                q.add(po);
                                        }
                                }

                        }
                }

                boolean isValid(int x, int y) {
                        if (x >= 0 && x < n && y >= 0 && y < m && ar[x][y] != '#') return true;
                        return false;
                }

                static class Point {
                        int x;
                        int y;
                        int dist;

                        public Point(int x, int y) {
                                this.x = x;
                                this.y = y;
                                this.dist = 0;
                        }

                }

        }

        static class InputReader {
                InputStream is;
                private byte[] inbuf = new byte[1024];
                public int lenbuf = 0;
                public int ptrbuf = 0;

                public InputReader(InputStream is) {
                        this.is = is;
                }

                private int readByte() {
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

                private boolean isSpaceChar(int c) {
                        return !(c >= 33 && c <= 126);
                }

                private int skip() {
                        int b;
                        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
                        return b;
                }

                public String s() {
                        int b = skip();
                        StringBuilder sb = new StringBuilder();
                        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
                                sb.appendCodePoint(b);
                                b = readByte();
                        }
                        return sb.toString();
                }

                public int i() {
                        int num = 0, b;
                        boolean minus = false;
                        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
                        if (b == '-') {
                                minus = true;
                                b = readByte();
                        }

                        while (true) {
                                if (b >= '0' && b <= '9') {
                                        num = num * 10 + (b - '0');
                                } else {
                                        return minus ? -num : num;
                                }
                                b = readByte();
                        }
                }

        }
}

