import java.util.*;

class Main{

    int n,m,c,s,g;
    int[][][] dist;
    //int[][] company;
    int[] p;
    int[][] q,r;
    int INF = Integer.MAX_VALUE;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt(); m = sc.nextInt(); c = sc.nextInt();
            s = sc.nextInt(); g = sc.nextInt();
            if(n==0 && m==0 && c==0 && s==0 && g==0) break;
            s--; g--;


            //from, to, company = dist
            dist = new int[n][n][c];
            for(int i=0; i<n; i++) 
                for(int j=0; j<n; j++) Arrays.fill(dist[i][j], INF);
            //company = new int[n][n];
            for(int i=0; i<m; i++){
                int x = sc.nextInt()-1, y = sc.nextInt()-1;
                int d = sc.nextInt(), c = sc.nextInt()-1;
                dist[x][y][c] = Math.min(dist[x][y][c], d); 
                dist[y][x][c] = Math.min(dist[x][y][c], d);
                //company[x][y] = c; company[y][x] = c;
            }
            p = new int[c];
            for(int i=0; i<c; i++) p[i] = sc.nextInt();
            q = new int[c][];
            r = new int[c][];
            for(int i=0; i<c; i++){
                q[i] = new int[p[i]-1];
                r[i] = new int[p[i]];
                for(int j=0; j<p[i]-1; j++) q[i][j] = sc.nextInt();
                for(int j=0; j<p[i]; j++) r[i][j] = sc.nextInt();
            }
            System.out.println(dijkstra());
        }
    }

    int dijkstra(){
        //pos, company, dist, cost
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[3] - b[3];
                }
            });
        boolean[][] v = new boolean[n][c];
        q.add(new int[]{s, -1, 0, 0});

        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], com = qq[1], di = qq[2], cost = qq[3];
            //System.out.println((pos+1)+" "+(com+1)+" "+di+" "+cost);

            if(pos==g) return cost;
            if(com!=-1){
                if(v[pos][com]) continue;
                v[pos][com] = true;
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<c; j++){
                    if(dist[pos][i][j]==INF) continue;
                    int newDist = dist[pos][i][j];
                    if(com==j) newDist += di;
                    int newCost = cost;
                    if(com!=-1 && com!=j){
                        //System.out.println("1from:"+(pos+1)+" to:"+(i+1));
                        newCost += getCost(com, di);
                    }
                    if(i==g){
                        //System.out.println("2from:"+(pos+1)+" to:"+(i+1)+" newDist:"+newDist);
                        newCost += getCost(j, newDist);
                    }
                    q.add(new int[]{i, j, newDist, newCost});
                    //q.add(new int[]{i, com, di + dist[pos][i][j], cost});
                }
            }
        }
        return -1;
    }

    int getCost(int com, int di){
        int res = 0;
        for(int i=0; i<p[com]-1; i++){
            if(di>=q[com][i]){
                int minus = q[com][i];
                if(i!=0) minus -= q[com][i-1];
                res += r[com][i] * minus;
                di -= minus;
            }else{
                res += r[com][i] * di;
                di = 0;
            }
        }
        res += di * r[com][p[com]-1];
        //System.out.println("com:"+(com+1)+" dist:"+di+" res:"+res);
        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}