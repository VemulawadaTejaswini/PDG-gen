import java.util.*;
import java.util.concurrent.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static boolean[][] ary;
    private static boolean[][] b;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            ary = new boolean[12][12];
            b = new boolean[12][12];
            solve();
        }
    }
    
    private static void solve() {
        for (int i = 0;i < 12;i++) {
            String s = sc.next();
            for (int j = 0;j < 12;j++) {
                if (s.charAt(j)=='1') {
                    ary[i][j] = true;
                }
            }
        }
        
        int ans = 0;
        for (int i = 0;i < 12;i++) {
            for (int j = 0;j < 12;j++) {
                if (ary[i][j]&&!b[i][j]) {
                    move(i,j);
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
    
    private static void move(int x, int y) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        b[x][y] = true;
        
        for (int i = 0;i < 4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (range(nx,ny)) {
                if (ary[nx][ny]&&!b[nx][ny]) {
                    move(nx, ny);
                }
            }
        }
    }
    
    private static boolean range(int x, int y) {
        return 0<=x&&x<12&&0<=y&&y<12;
    }
}