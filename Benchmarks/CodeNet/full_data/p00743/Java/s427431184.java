import java.util.*;

class Main{

    int INF = Integer.MAX_VALUE;
    int n, m, s, g;
    int[][] dist, seigen;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt(); m = sc.nextInt();
            if(n==0 && m==0) break;
            s = sc.nextInt()-1; g = sc.nextInt()-1;
            dist = new int[n][n];
            seigen = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(dist[i], INF);
            for(int i=0; i<m; i++){
                int x = sc.nextInt()-1, y = sc.nextInt()-1;
                int d = sc.nextInt(), c = sc.nextInt();
                dist[x][y] = d; dist[y][x] = d;
                seigen[x][y] = c; seigen[y][x] = c;
            }
            System.out.println(dijkstra());
        }
    }

    class P{
        int pos, bpos, speed;
        double cost;
        P(int pos, int bpos, int speed, double cost){
            this.pos = pos;
            this.bpos = bpos;
            this.speed = speed;
            this.cost = cost;
        }
    }

    String dijkstra(){
        PriorityQueue<P> q = new PriorityQueue<P>(10, new Comparator<P>(){
                public int compare(P p1, P p2){
                    if(p1.cost<p2.cost) return -1;
                    else if(p1.cost>p2.cost) return 1;
                    return 0;
                }
            });
        q.add(new P(s, -1, 1, 0));
        boolean[][][] v = new boolean[n][n][10000];

        while(q.size()>0){
            P pp = q.poll();
            int pos = pp.pos, bpos = pp.bpos, speed = pp.speed;
            double cost = pp.cost;

            if(pos==g && speed==1) return String.valueOf(cost);
            if(bpos==-1){
                for(int i=0; i<n; i++) v[pos][i][speed] = true;
            }else{
                if(v[pos][bpos][speed]) continue;
                v[pos][bpos][speed] = true;
            }

            for(int i=0; i<n; i++){
                if(i==pos || i==bpos || dist[pos][i]==INF) continue;
                for(int j=-1; j<=1; j++){
                    int nspeed = speed + j;
                    if(nspeed<=0 || seigen[pos][i]<nspeed) continue;
                    if(bpos==-1 && nspeed!=1) continue;
                    q.add(new P(i, pos, nspeed, cost+(double)dist[pos][i]/nspeed));
                }
            }

        }

        return "unreachable";
    }

    public static void main(String[] args){
        new Main().solve();
    }
}