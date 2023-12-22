import java.util.*;
 
class Main{
 
    int h, w;
    int sx, sy, gx, gy;
    int[][] grid;
 
    void solve(){
        Scanner sc = new Scanner(System.in);
 
        while(true){
 
            h = sc.nextInt();
            w = sc.nextInt();
            if(h==0 && w==0) break;
 
            grid = new int[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    grid[i][j] = sc.nextInt();
                }
            }
            sy = sc.nextInt();
            sx = sc.nextInt();
            gy = sc.nextInt();
            gx = sc.nextInt();
 
            System.out.println(bfs());
        }
    }
 
    class Dice{
        int[] dice = new int[6];
        Dice(int a, int b, int c, int d, int e, int f){
            dice[0] = a; dice[1] = b; dice[2] = c;
            dice[3] = d; dice[4] = e; dice[5] = f;
        }
    }
 
    int[][] dd = {{1,5,2,3,0,4}, {3,1,0,5,4,2}, {4,0,2,3,5,1}, {2,1,5,0,4,3}};
 
    Dice rotate(Dice d, int idx){
        return new Dice(d.dice[dd[idx][0]], d.dice[dd[idx][1]], d.dice[dd[idx][2]], d.dice[dd[idx][3]], d.dice[dd[idx][4]], d.dice[dd[idx][5]]);
    }
 
    class P{
        Dice d;
        int[] num;
        P(int[] num, Dice d){
            this.num = num;
            this.d = d;
        }
    }
    
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};
    
    int bfs(){
        //x, y pena,direction
        PriorityQueue<P> 
            q = new PriorityQueue<P>(10, new Comparator<P>(){
                    public int compare(P a, P b){
                        return a.num[2] - b.num[2];
                    }
                });
        boolean[][][] v = new boolean[h][w][4];
        Dice d = new Dice(1,2,3,4,5,6);
        q.add(new P(new int[]{sx, sy, 0, -1}, d));
              
        int min = Integer.MAX_VALUE;
              
        while(q.size()>0){
            P p = q.poll();
            int[] qq = p.num;
            int x = qq[0], y = qq[1], pena = qq[2], direc = qq[3];
            Dice ddd = p.d;
            //System.out.println(x+" "+y+" "+pena+" "+Arrays.toString(ddd.dice));
 
            if(x==gx && y==gy) return pena;

            if(direc!=-1){ 
                if(v[y][x][direc]) continue;
                v[y][x][direc] = true;
            }
 
            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h) continue;
                Dice newDice = rotate(ddd, i);
                q.add(new P(new int[]{nx, ny, pena+grid[ny][nx]*newDice.dice[5], i}, newDice));
            }
        }

        return min; 
    }
 
 
    public static void main(String[] args){
        new Main().solve();
    }
}