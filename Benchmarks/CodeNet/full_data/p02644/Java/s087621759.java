
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
        board[sy][sx] = 0;
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(sx, sy, 0));

        while (!q.isEmpty()) {
            Node cur = q.remove();
//            debug(cur.x, cur.y, cur.d, cur.k, cur.cnt);
            if (cur.x == gx && cur.y == gy) {
                return cur.cnt;
            }
            if (board[cur.y][cur.x] != cur.cnt) continue;

            if (cur.d >= 0 && cur.k > 0) {
                for (int i = 1; i <= cur.k; i++) {
                    if (board[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i] == -1) break;
                    if (board[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i] > cur.cnt) {
                        board[cur.y + dy[cur.d] * i][cur.x + dx[cur.d] * i] = cur.cnt;
                        q.add(new Node(cur.x + dx[cur.d] * i, cur.y + dy[cur.d] * i, cur.d, cur.k - i, cur.cnt));
                        break;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                if (i == cur.d && cur.k > 0) continue;
                if (board[cur.y + dy[i]][cur.x + dx[i]] > cur.cnt + 1) {
                    board[cur.y + dy[i]][cur.x + dx[i]] = cur.cnt + 1;
                    q.add(new Node(cur.x + dx[i], cur.y + dy[i], i, k - 1, cur.cnt + 1));
                }
            }
        }
        return -1;
    }

    class Node implements Comparable<Node> {
        int x, y, d, k, cnt;
        Node(int x, int y, int cnt) {
            this(x, y, -1, -1, cnt);
        }

        Node(int x, int y, int d, int k, int cnt) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.k = k;
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