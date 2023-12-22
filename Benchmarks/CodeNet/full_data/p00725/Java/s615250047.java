import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        new Main().run();
    }
    void debug(Object ... o) {
        System.out.println(Arrays.deepToString(o));
    }
    int w, h;
    int [][] F;
    int sx, sy, gx, gy;
    boolean init() {
        w = sc.nextInt();
        h = sc.nextInt();
        F = new int[h][w];
        if (w == 0 && h == 0) return false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                F[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (F[i][j] == 2) {
                    F[i][j] = 0;
                    sx = j; 
                    sy = i;
                }
                if (F[i][j] == 3) {
                    gx = j;
                    gy = i;
                }
            }
        }
        return true;
    }
    static int [] dx = {0, 1, 0, -1};
    static int [] dy = {1, 0, -1, 0};
    int INF = (1<<28);
    int dfs(int y, int x, int r) {
        //debug(F);
        if (r == 10) return INF;
        int ret = INF;
        for (int i = 0; i < 4; i++) {
            try {
                int ny = y + dy[i], nx = x + dx[i];
                if (F[ny][nx] == 1) continue; // すぐとなりが障害物
                while (F[ny][nx] == 0) {
                    ny += dy[i];
                    nx += dx[i];
                }
                if (F[ny][nx] == 3) return r + 1;
                if (F[ny][nx] == 1) {
                    F[ny][nx] = 0;
                    int py = ny - dy[i],
                        px = nx - dx[i];
                    ret = Math.min(ret, dfs(py, px, r + 1));
                    F[ny][nx] = 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                continue;
            }
        }
        return ret;
    }
    void run() {
        while (init()) {
            int ans = dfs(sy, sx, 0);
            System.out.println(ans == INF ? -1 : ans);
        }
    }
}