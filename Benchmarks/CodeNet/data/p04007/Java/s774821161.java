
import java.util.*;

public class Main {

    int H, W;
    boolean[][] board;
    G[][] gd;
    List<G> gl = new ArrayList<>();
    Set<Long> gs = new HashSet<>();

    void run() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        gd = new G[H + 2][W + 2];

        for (int h = 1; h <= H; h++) {
            String l = sc.next();
            for (int w = 1; w <= W; w++) {
                if (l.charAt(w - 1) == '#') {
                    gl.add(new G(w, h));
                    gs.add(1L * h * 1000 + w);
                }
            }
        }

        init();
        G s = gl.get(0);

        bfs(s.x, s.y);
        init();
        rbfs(s.x, s.y);

        printBoard();
        System.out.println();

        gd = new G[H + 2][W + 2];

        for (G g: gl) board[g.y][g.x] = false;

        bfs(s.x, s.y);
        init();

//        debug(gl);
//        for (int i = 1; i <= H + 1; i++) debug(gd[i]);

        rbfs(s.x, s.y);

        printBoard();
    }

    void init() {
        board = new boolean[H + 2][W + 2];
        Arrays.fill(board[0], true);
        Arrays.fill(board[H + 1], true);
        for (int i = 0; i < H + 2; i++) board[i][0] = board[i][W + 1] = true;
    }

    int[] dx = {-1,0,1,0};
    int[] dy = {0,-1,0,1};
    void bfs(int x, int y) {
        PriorityQueue<G> q = new PriorityQueue<>();
        q.add(new G(x, y));
        board[y][x] = true;
        while (!q.isEmpty()) {
            G cur = q.remove();
            for (int i = 0; i < 4; i++) if (!board[cur.y + dy[i]][cur.x + dx[i]]) {
                board[cur.y + dy[i]][cur.x + dx[i]] = true;
                gd[cur.y + dy[i]][cur.x + dx[i]] = new G(cur.x, cur.y);
                long hash = 1L * (cur.y + dy[i]) * 1000 + cur.x + dx[i];
                q.add(new G(cur.x + dx[i], cur.y + dy[i], gs.contains(hash) ? 0 : 1));
            }
        }
    }

    void rbfs(int x, int y) {
        for (G g: gl) {
            while (g.x != x || g.y != y) {
                if (board[g.y][g.x]) break;
                board[g.y][g.x] = true;
                g = gd[g.y][g.x];
                if (g == null) break;
            }
        }
        board[y][x] = true;
    }

    void printBoard() {
        for (int h = 1; h <= H; h++) {
            for (int w = 1; w <= W; w++) {
                System.out.print(board[h][w] ? '#' : '.');
            }
            System.out.println();
        }
    }

    class G implements Comparable<G> {
        int x, y, c;
        G(int x, int y) {
            this.x = x;
            this.y = y;
            c = 1;
        }

        G(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }

        @Override
        public String toString() {
            return String.format("(x: %d, y: %d)", x, y);
        }

        @Override
        public int compareTo(G o) {
            return c - o.c;
        }
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
