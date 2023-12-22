
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
    int INF = 2 << 28;
    
    int w, h;
    boolean[][] map;
    ArrayList<P> trgPs;
    int qsx, qsy, asx, asy;
    
    int[][][][][] mem;

    
    void run() {
        Scanner sc = new Scanner(System.in);
        
        for (;;) {
            w = sc.nextInt(); h = sc.nextInt();
            if ((w|h) == 0) break;
            map = new boolean[h + 2][w + 2];
            trgPs = new ArrayList<P>();
            
            for (int i = 1; i <= h; i++) {
                String l = sc.next();
                for (int j = 1; j <= w; j++) {
                    switch (l.charAt(j - 1)) {
                    case '.': map[i][j] = true;  break;
                    case '#': map[i][j] = false; break;
                    case 'Q': map[i][j] = true;  qsx = j; qsy = i; break;
                    case 'A': map[i][j] = true;  asx = j; asy = i; break;
                    case 'E': map[i][j] = true;  trgPs.add(new P(j, i));
                    }
                }
            }
            
            mem = new int[2][w + 2][h + 2][w + 2][h + 2];
            
            for (P p : trgPs) {
                for (int x = 1; x <= w; x++) for (int y = 1; y <= h; y++) {
                    mem[0][p.x][p.y][x][y] = 1;
                }
            }
            
            for (int x = 1; x <= w; x++) for (int y = 1; y <= h; y++) {
                mem[0][x][y][x][y] = -1;
            }
            
            boolean update = true;
            int x = 1;
            while (update) {
                update = false;
                for (int qx = 1; qx <= w; qx++) for (int qy = 1; qy <= h; qy++) if (map[qy][qx]) {
                    for (int ax = 1; ax <= w; ax++) for (int ay = 1; ay <= h; ay++) if (map[ay][ax]) {
                        update |= update(qx, qy, ax, ay, x);
                    }
                }
//                debug(x, update);
                x = 1 - x;
                for (int[][][] a : mem[x]) for (int[][] b : a) for (int[] c : b) fill(c, 0);
            }
            
            
            
            switch (mem[1-x][qsx][qsy][asx][asy]) {
            case 1:
                System.out.println("Queen can escape.");
                break;
            case 0:
                System.out.println("Queen can not escape and Army can not catch Queen.");
                break;
            case -1:
                System.out.println("Army can catch Queen.");
                break;
            }
        }
    }
    
    int[] dx = {-1,0,1,0,0};
    int[] dy = {0,-1,0,1,0};
    boolean update(int qx, int qy, int ax, int ay, int t) {
        if (mem[1-t][qx][qy][ax][ay] != 0) {
            mem[t][qx][qy][ax][ay] = mem[1-t][qx][qy][ax][ay];
            return false;
        }
        
        for (int i = 0; i < 5; i++) if (map[qy+dy[i]][qx+dx[i]]) {
            boolean flg = true;
            for (int j = 0; j < 5; j++) if (map[ay+dy[j]][ax+dx[j]]) 
                flg &= mem[1-t][qx+dx[i]][qy+dy[i]][ax+dx[j]][ay+dy[j]] > 0;
            if (flg) {
                mem[t][qx][qy][ax][ay] = 1;
                return true;
            }
        }
        
        boolean flg = true;
        for (int i = 0; i < 5; i++) if (map[qy+dy[i]][qx+dx[i]]) {
            boolean tmp = false;
            for (int j = 0; j < 5; j++) if (map[ay+dy[j]][ax+dx[j]])
                tmp |= mem[1-t][qx+dx[i]][qy+dy[i]][ax+dx[j]][ay+dy[j]] < 0;
            flg &= tmp;
        }
        if (flg) {
            mem[t][qx][qy][ax][ay] = -1;
            return true;
        }
        
        return false;
    }
    
    class P {
        int x, y;
        P(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    void debug(Object...os) {
        System.err.println(deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}