
import java.util.*;

public class Main {
    static int[][] DIR = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static void update(int n, int x, int y, int[][] ret, int[][] grid) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(x*n+y);
        while (!q.isEmpty()) {
            int curr = q.poll();
            int i = curr / n, j = curr % n;
            int can = ret[i][j] + grid[i][j];
            for (int[] dir : DIR) {
                int ni = i + dir[0], nj = j + dir[1];
                if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                    if (ret[ni][nj] > can) {
                        ret[ni][nj] = can;
                        q.add(ni*n+nj);
                    }
                }
            }
        }
    }

    static void solve(int N, int[] P) {
        int[][] grid = new int[N][N];
        for (int[] g : grid) Arrays.fill(g, 1);
        int[][] ret = new int[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                ret[i][j] = Math.min(Math.min(i, N-1-i), Math.min(j, N-1-j));
            }
        }
        int r = 0;
        for (int p : P) {
            int x = p/N, y = p%N;
            r += ret[x][y];
            grid[x][y] = 0;
            update(N, x, y, ret, grid);
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] P = new int[N*N];
        for (int i=0;i<P.length;i++) P[i] = in.nextInt() - 1;
        solve(N, P);
    }
}
