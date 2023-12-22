import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static class Pair<A, B> {
        public A left;
        public B right;

        public Pair(A a, B b) {
            this.left = a;
            this.right = b;
        }
    }

    public static int[][] copyArrayInt(int[][] arr) {
        int[][] cp = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                cp[i][j] = arr[i][j];
            }
        }

        return cp;
    }

    public static boolean[][] copyArrayBool(boolean[][] arr) {
        boolean[][] cp = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                cp[i][j] = arr[i][j];
            }
        }

        return cp;
    }

    public static class Value {
        int y, x, v;

        public Value(int y, int x, int v) {
            this.y = y;
            this.x = x;
            this.v = v;
        }
    }

    private static int w, h;
    private static int dx[] = { 0, 0, -1, 1 };
    private static int dy[] = { -1, 1, 0, 0 };
    private static int[][] cells;

    private static int dfs(Value pos) {
        if (cells[pos.y][pos.x] == 3) {
            return pos.v;
        }

        if (pos.v >= 10)
            return (int) 1e9;

        int min = (int) 1e9;
        for (int i = 0; i < 4; ++i) {
            int py = pos.y;
            int px = pos.x;

            boolean hit = false;
            while (px + dx[i] >= 0 && px + dx[i] < w && py + dy[i] >= 0 && py + dy[i] < h) {
                if (cells[py + dy[i]][px + dx[i]] == 0 || cells[py + dy[i]][px + dx[i]] == 3) {
                    px += dx[i];
                    py += dy[i];

                    if (cells[py][px] == 3)
                        break;
                } else {
                    hit = true;
                    break;
                }
            }

            if (cells[py][px] == 3) {
                min = Math.min(min, pos.v + 1);
            }

            if (hit && (py != pos.y || px != pos.x)) {
                cells[py + dy[i]][px + dx[i]] = 0;
                min = Math.min(min, dfs(new Value(py, px, pos.v + 1)));
                cells[py + dy[i]][px + dx[i]] = 1;
            }
        }

        return min;
    }

    private static boolean run() {
        w = scanner.nextInt();
        h = scanner.nextInt();

        if (w == 0)
            return false;

        cells = new int[h][w];

        int sy = 0, sx = 0;
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                cells[i][j] = scanner.nextInt();

                if (cells[i][j] == 2) {
                    sy = i;
                    sx = j;
                    cells[i][j] = 0;
                }
            }
        }

        int res = dfs(new Value(sy, sx, 0));

        System.out.println(res > 10 ? -1 : res);

        return true;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);

        while (run())
            ;
    }
}
