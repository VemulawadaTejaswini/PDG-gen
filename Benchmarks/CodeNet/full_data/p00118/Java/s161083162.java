import java.util.Scanner;

/**
 * Created by sotetsuk on 2015/07/07.
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static int h, w;
    static int[] dx = {0, 1,  0, -1};
    static int[] dy = {1, 0, -1,  0};
    static char[][] grid = new char[105][105];

    public static void dfs(int i, int j , char c) {
        // stopping condition
        if(i < 0 || i >= h || j < 0 || j >= w) return;
        if(grid[i][j] != c) return;

        // marking where already visit
        grid[i][j] = '.';

        // recursion
        for(int k = 0; k < 4; k++) dfs(i + dx[k], j + dy[k], c);
        return;
    }

    public static void solve() {
        int ans = 0;

        // input
        for(int i = 0; i < h; i++) {
            grid[i] = sc.next().toCharArray();
        }

        // dfs
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(grid[i][j] != '.') {
                    ans++;
                    dfs(i, j, grid[i][j]);
                }

            }
        }

        System.out.println(ans);
        return;
    }

    public static void main(String[] args) {
        while(true) {
            h = sc.nextInt();
            w = sc.nextInt();
            if(h == 0 && w == 0) break;
            solve();
        }
        return;
    }

}