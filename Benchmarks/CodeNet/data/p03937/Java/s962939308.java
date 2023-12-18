import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int h;
    static int w;
    static char[][] road;
    
    public static void main(String[] args) {
        h = sc.nextInt();
        w = sc.nextInt();
        road = new char[h][w];
        for(int y = 0; y < h; ++y) road[y] = sc.next().toCharArray();
        dfs(0, 0);
        String ans = (hasVisitedAllGrids()) ? "Possible" : "Impossible";
        System.out.println(ans);
    }
    
    static int[] dy = {0, 1};
    static int[] dx = {1, 0};
    static void dfs(int y, int x) {
        road[y][x] = '!';
        for(int i = 0; i < 2; ++i) {
            int ty = y + dy[i];
            int tx = x + dx[i];
            
            if(isOutside(ty, tx) || road[ty][tx] != '#') continue;
            
            dfs(ty, tx);
            return;
        }
    }
    
    static boolean isOutside(int y, int x) {
        return (y < 0 || h <= y || x < 0 || w <= x);
    }
    
    static boolean hasVisitedAllGrids() {
        for(int y = 0; y < h; ++y) {
            for(int x = 0; x < w; ++x) {
                if(road[y][x] == '#') return false;
            }
        }
        return true;
    }
}
