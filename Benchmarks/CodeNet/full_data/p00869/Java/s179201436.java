import java.util.*;
 
class Main{
     
    int h, w;
    int[][] map;
    int[] order;
    int INF = Integer.MAX_VALUE;
    char[] cc = {'r','c','g','m','b','y','w','k','#'};

     
    void solve(){
        Scanner sc = new Scanner(System.in);
         
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;
             
            int sx = 0, sy = 0;
            map = new int[h][w];
            for(int i=0; i<h; i++){
                String line = sc.next();
                for(int j=0; j<w; j++){
                    for(int k=0; k<cc.length; k++){
                        if(line.charAt(j)==cc[k]) map[i][j] = k;
                    }
                    if(line.charAt(j)=='#'){
                        sx = j; sy = i;
                    }
                }
            }
             
            String color = sc.next();
            order = new int[6];
            for(int i=0; i<color.length(); i++){
                for(int j=0; j<cc.length; j++){
                    if(color.charAt(i)==cc[j]) order[i] = j;
                }
            }

            Dice d = new Dice(0, 1, 2, 3, 4, 5);
 
            int min = dijkstra(sx, sy, d);
            if(min==INF) System.out.println("unreachable");
            else System.out.println(min);
        }
    }
     
    class Dice{
        int[] d = new int[6];
        Dice(int top, int bottom, int north, int south, int east, int west){
            d[0] = top;
            d[1] = bottom;
            d[2] = north;
            d[3] = south;
            d[4] = east;
            d[5] = west;
        }
    }
     
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};
    int[][][] v;
     
    int[][] r = {
        {3, 2, 0, 1, 4, 5},
        {5, 4, 2, 3, 0, 1},
        {2, 3, 1, 0, 4, 5},
        {4, 5, 2, 3, 1, 0}
    };
     
    class P{
        int x, y, cnt, cost;
        Dice d;
        P(int x, int y, int cnt, int cost, Dice d){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.cost = cost;
            //this.direc = direc;
            this.d = d;
        }
    }
 
    int dijkstra(int sx, int sy, Dice dd){
        //x, y, cnt, cost, direc, dice
        PriorityQueue<P> 
            q = new PriorityQueue<P>(10, new Comparator<P>(){
                    public int compare(P a, P b){
                        return a.cost - b.cost;
                    }
                });
        q.add(new P(sx, sy, 0, 0, dd));
        boolean[][][][][][] v = new boolean[h][w][7][6][6][6];
 
        while(q.size()>0){
            P pp = q.poll();
            int x = pp.x, y = pp.y, cnt = pp.cnt, cost = pp.cost;
            //int direc = pp.direc;
            Dice d = pp.d;
 
            //System.out.println(x+" "+y+" "+cnt+" "+cost+" "+Arrays.toString(d.d));
 
            if(cnt==6) return cost;
 
            if(v[y][x][cnt][d.d[0]][d.d[2]][d.d[4]]) continue;
            v[y][x][cnt][d.d[0]][d.d[2]][d.d[4]] = true;;
 
            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y+dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h) continue;
                Dice dice = new Dice(d.d[r[i][0]] , d.d[r[i][1]], d.d[r[i][2]], d.d[r[i][3]], d.d[r[i][4]], d.d[r[i][5]]);
                if(map[ny][nx]==order[cnt] && dice.d[0]==order[cnt]){
                    if(v[ny][nx][cnt+1][dice.d[0]][dice.d[2]][dice.d[4]])
                        continue;
                    q.add(new P(nx, ny, cnt+1, cost+1, dice));
                }
                if(map[ny][nx]==6){
                    if(v[ny][nx][cnt][dice.d[0]][dice.d[2]][dice.d[4]])
                        continue;
                    q.add(new P(nx, ny, cnt, cost+1, dice));
                }
                 
            }
        }
        return INF;
    }
     
    public static void main(String[] args){
        new Main().solve();
    }
}