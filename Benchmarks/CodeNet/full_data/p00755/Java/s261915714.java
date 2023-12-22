import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;

    int h, w, c;
    int[][] p;
    boolean[][] done; // biribiri用フラグ

    public static void main(String[] args) {
        new Main().run();
    }

    Main() {
        sc = new Scanner(System.in);
    }

    boolean init() {
        h = sc.nextInt();
        w = sc.nextInt();
        c = sc.nextInt();

        if (h == 0 && w == 0 && c == 0) return false;

        p = new int[h][w];
        for (int i = 0; i < h; i++) 
            for (int j = 0; j < w; j++) 
                p[i][j] = sc.nextInt();

        return true;
    }

    void debug_p() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) 
                System.out.print(p[i][j] + " ");
            System.out.println("");
        }
    }

    void run() {
        while (init()) {
            System.out.println(solve());
        }
    }

    int solve() {
        return max_panel(0);
    }

    int dx[] = {0, 1, 0, -1},
        dy[] = {1, 0, -1, 0};

    int count(int y, int x) {
        done = new boolean[h][w];
        return count_dfs(y, x);
    }

    int count_dfs(int y, int x) {
        if (p[y][x] != c) return 0;
        done[y][x] = true;
        int cnt = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (0 <= ny && ny < h && 0 <= nx && nx < w && !done[ny][nx]) {
                cnt += count_dfs(ny, nx);
            }
        }
        return cnt;
    }

    void change_color(int color) {
        done = new boolean[h][w];
        biribiri(0, 0, color);
//        debug_p();
    }

    void biribiri(int y, int x, int color) {
        done[y][x] = true;
//        System.out.printf("%d,%d: %d\n", x, y, color);
        int prev = color;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (0 <= ny && ny < h && 0 <= nx && nx < w && p[y][x] == p[ny][nx] && !done[ny][nx]) {
                biribiri(ny, nx, color);
            }
        }
        p[y][x] = color;
    }

    int max_panel(int time) {
//        System.out.printf("%d ", time);
        if (time == 4) {
            int cnt;
            int _p[][] = new int[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    _p[i][j] = p[i][j];
            change_color(c);
            cnt = count(0, 0);
//            debug_p();
            for (int i = 0; i < h; i++) 
                for (int j = 0; j < w; j++)
                    p[i][j] = _p[i][j];
//            System.out.printf("%d\n", cnt);
            return cnt; 
        }
        int cnt = 0;
        for (int color = 1; color <= 6; color++) {
            int _p[][] = new int[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    _p[i][j] = p[i][j];
            change_color(color);
            cnt = Math.max(cnt, max_panel(time+1));
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    p[i][j] = _p[i][j];
        }
        return cnt;
    }
}