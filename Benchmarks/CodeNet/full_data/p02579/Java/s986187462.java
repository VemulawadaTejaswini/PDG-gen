import java.util.*;

public class Main{
    int h, w, gy, gx, out;
    char[][] s;
    boolean[][] seen;
    Queue<Integer[]> p;
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    void solve(){
        Scanner scan = new Scanner(System.in);
        h = scan.nextInt();
        w = scan.nextInt();
        int sy = scan.nextInt() - 1;
        int sx = scan.nextInt() - 1;
        gy = scan.nextInt() - 1;
        gx = scan.nextInt() - 1;
        s = new char[h][w];
        for(int i = 0; i < h; i++){
            String sin = scan.next();
            for(int j = 0; j < w; j++){
                s[i][j] = sin.charAt(j);
            }
        }
        seen = new boolean[h][w];
        seen[sy][sx] = true;
        out = 0;
        p = new ArrayDeque<>();
        p.add(new Integer[]{sy, sx});
        check();
        System.out.println(-1);
        scan.close();
    }

    void check(){
        Integer[] pos = new Integer[2];
        while(!p.isEmpty()){
            pos = p.poll();
            if(pos[0] == gy && pos[1] == gx){
                System.out.println(out);
                System.exit(0);
            }
            for(int i = 0; i < 4; i++){
                int yp = pos[0] + dy[i];
                int xp = pos[1] + dx[i];
                if(0 <= yp && yp < h && 0 <= xp && xp < w && s[yp][xp] == '.' && !seen[yp][xp]){
                    seen[yp][xp] = true;
                    p.add(new Integer[]{yp, xp});
                }
            }
        }
        warp(pos[0], pos[1]);
    }

    void warp(int y, int x){
        for(int i = -2; i <= 2; i++){
            for(int j = -2; j <= 2; j++){
                int yp = y + i;
                int xp = x + j;
                if(0 <= yp && yp < h && 0 <= xp && xp < w && s[yp][xp] == '.' && !seen[yp][xp]){
                    seen[yp][xp] = true;
                    out++;
                    p.add(new Integer[]{yp, xp});
                    check();
                }
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}