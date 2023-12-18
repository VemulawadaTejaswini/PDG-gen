import java.util.*;

public class Main {
    static int h, w;
    static int[][] map;
    static boolean[][] bmap;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        map = new int[h+2][w+2];
        bmap = new boolean[h+2][w+2];
        for(int i=0; i<h; i++){
            String s = sc.next();
            for(int j=0; j<w; j++){
                if(s.charAt(j) == '#'){
                    map[i+1][j+1] = 1;
                }else{
                    map[i+1][j+1] = -1;
                }
            }
        }
        sc.close();

        int ans = 0;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(map[i+1][j+1] == 1){
                    bmap = new boolean[h+2][w+2]; 
                    ans += bfs(i+1, j+1, map[i+1][j+1]);
                    // ans += cont * (cont-1) * 2;
                }
            }
        }

        System.out.println(ans);
    }

    public static int bfs(int x, int y, int now){
        int next = -now;
        int ret = map[x][y] == -1 ? 1 : 0;
        bmap[x][y] = true;
        if(!bmap[x+1][y] && map[x+1][y] == next) ret += bfs(x+1, y, next);
        if(!bmap[x-1][y] && map[x-1][y] == next) ret += bfs(x-1, y, next);
        if(!bmap[x][y+1] && map[x][y+1] == next) ret += bfs(x, y+1, next);
        if(!bmap[x][y-1] && map[x][y-1] == next) ret += bfs(x, y-1, next);
        return ret;
    }
}