import java.util.*;

public class Main {
    boolean[][] map;
    void run() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            map = new boolean[14][14];
            for (int y = 1; y <= 12; y++) {
                String str = sc.next();
                for (int x = 1; x <= 12; x++) {
                    map[y][x] = str.charAt(x - 1) == '1';
                }
            }
            int cnt = 0;
            for (int y = 1; y <= 12; y++) for (int x = 1; x <= 12; x++) if (map[y][x]){
                cnt++;
                dfs(x, y);
            }
            System.out.println(cnt);
        }
    }
    
    int[] dx = {-1,0,1,0}, dy = {0,-1,0,1};
    void dfs(int x, int y) {
        map[y][x] = false;
        for (int i = 0; i < 4; i++) if (map[y+dy[i]][x+dx[i]]) dfs(x + dx[i], y + dy[i]);
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}