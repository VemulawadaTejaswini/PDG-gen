
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;
    int INF = 1 << 28;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    int h, w, k;
    int[][] board;

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        h = sc.nextInt();
        w = sc.nextInt();
        k = sc.nextInt();
        int sy = sc.nextInt(), sx = sc.nextInt(), gy = sc.nextInt(), gx = sc.nextInt();
        board = new int[h + 2][w + 2];
        for (int[] a : board) Arrays.fill(a, -1);

        for (int i = 1; i <= h; i++) {
            String s = sc.next();
            for (int j = 1; j <= w; j++) {
                board[i][j] = s.charAt(j - 1) == '@' ? -1 : INF;
            }
        }

        out.println(dijkstra(sx, sy, gx, gy));


        out.flush();
    }

    int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1};
    int dijkstra(int sx, int sy, int gx, int gy) {
        int[][][] d = new int[h + 2][w + 2][4];
        int[][][] e = new int[h + 2][w + 2][4];
        for (int[][] a : d) for (int[] b : a) Arrays.fill(b, -1);
        for (int i = 1; i <= h; i++) for (int j = 1; j <= w; j++) {
            d[i][j][0] = d[i][j][1] = d[i][j][2] = d[i][j][3] = board[i][j];
        }
        for (int[][] a : e) for (int[] b : a) Arrays.fill(b, 0);

        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(sx, sy, 0, 0));
        q.add(new Node(sx, sy, 1, 0));
        q.add(new Node(sx, sy, 2, 0));
        q.add(new Node(sx, sy, 3, 0));
        d[sy][sx][0] = d[sy][sx][1] = d[sy][sx][2] = d[sy][sx][3] = 0;
        e[sy][sx][0] = e[sy][sx][1] = e[sy][sx][2] = e[sy][sx][3] = 0;

        while (!q.isEmpty()) {
            Node cur = q.remove();
//            debug(cur.x, cur.y, cur.d, e[cur.y][cur.x][cur.d], cur.cnt);
            if (cur.x == gx && cur.y == gy) {
                return cur.cnt;
            }
            if (d[cur.y][cur.x][cur.d] != cur.cnt) continue;

            if (e[cur.y][cur.x][cur.d] > 0) {
                for (int i = 1; i <= e[cur.y][cur.x][cur.d]; i++) {
                    if (d[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i][cur.d] == -1) break;
                    if (d[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i][cur.d] > cur.cnt) {
                        d[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i][cur.d] = cur.cnt;
                        q.add(new Node(cur.x + dx[cur.d] * i, cur.y + dy[cur.d] * i, cur.d, cur.cnt));
                        e[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i][cur.d] = Math.max(e[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i][cur.d], e[cur.y][cur.x][cur.d] - i);
                        break;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                if (i == cur.d && e[cur.y][cur.x][cur.d] > 0) continue;
                if (d[cur.y + dy[i]][cur.x + dx[i]][i] > cur.cnt + 1) {
                    d[cur.y + dy[i]][cur.x + dx[i]][i] = cur.cnt + 1;
                    q.add(new Node(cur.x + dx[i], cur.y + dy[i], i, cur.cnt + 1));
                    e[cur.y + dy[i]][cur.x + dx[i]][i] = k - 1;
                }
            }
        }
        return -1;
    }

    class Node implements Comparable<Node> {
        int x, y, d, cnt;
        Node(int x, int y, int cnt) {
            this(x, y, -1, cnt);
        }

        Node(int x, int y, int d, int cnt) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.cnt = cnt;

        }

        @Override
        public int compareTo(Node o) {
            return cnt - o.cnt;
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}