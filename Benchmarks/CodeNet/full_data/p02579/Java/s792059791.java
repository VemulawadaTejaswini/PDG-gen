import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int sx = sc.nextInt() -1;
        int sy = sc.nextInt() -1;
        int gx = sc.nextInt() - 1;
        int gy = sc.nextInt() -1;
        boolean[][] g = new boolean[h][w];
        for(int i=0; i<h; i++) {
            char[] cc = sc.next().toCharArray();
            for(int j=0; j<w; j++) {
                g[i][j] = cc[j] == '.';
            }
        }
        if(sx == gx && sy == gy) {
            System.out.println(0);
            return;
        }
        boolean[][] v = new boolean[h][w];
        boolean[][] vd = new boolean[h][w];
        boolean[][] vn = new boolean[h][w];
        Queue<P> q = new LinkedList<>();
        Queue<P> nq = new LinkedList<>();
        int warp = 0;
        q.add(new P(sx, sy));
        while(true) {
            while(!q.isEmpty()) {
                P p = q.poll();
                if(vd[p.x][p.y]) continue;
                vd[p.x][p.y] = true;
                if(p.x == gx && p.y == gy) {
                    System.out.println(warp);
                    return;
                }
                for(int dx = -2; dx <= 2; dx++) {
                    int nx = p.x + dx;
                    if(nx < 0 || h <= nx) continue;
                    for(int dy = -2; dy <=2; dy++) {
                       int ny = p.y + dy;
                       if(ny <0 || w <= ny) continue;
                       if(!g[nx][ny]) continue;
                       int dd = Math.abs(dx) + Math.abs(dy);
                       if(dd == 0) continue;
                       if(dd == 1) {
                           if(v[nx][ny]) {
                               continue;
                           }
                           v[nx][ny] = true;
                           q.add(new P(nx, ny));
                           v[nx][ny] = true;
                       } else {
                           if(v[nx][ny] || vd[nx][ny] || vn[nx][ny]) continue;
                           nq.add(new P(nx, ny));
                           vn[nx][ny] = true;
                       }
                    }
                }
            }
            warp++;
            if(nq.isEmpty()) {
                System.out.println(-1);
                return;
            }
            q = nq;
            nq = new LinkedList<P>();
        }

    }
    static class P {
        int x;
        int y;
        P(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }





}