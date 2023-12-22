import java.util.*;

class Main{

    ArrayList[] cost;
    int n, m, r;
    int[] z;
    int INF = 1000000000;
    int[][][] rikumi;
    int[][] rikuOnly;

    @SuppressWarnings("unchecked")
    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            cost = new ArrayList[n];
            for(int i=0; i<n; i++) cost[i] = new ArrayList<Integer>();

            rikumi = new int[n][n][2];//cost, riku or umi
            rikuOnly = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(rikuOnly[i], INF);
            for(int i=0; i<n; i++) rikuOnly[i][i] = 0;

            for(int i=0; i<m; i++){
                int x = sc.nextInt()-1, y = sc.nextInt()-1, tt = sc.nextInt();
                String s = sc.next();
                int ss = 0;

                if(s.equals("S")) ss = 1;
                cost[x].add(new Integer(y));
                cost[y].add(new Integer(x));
                rikumi[x][y][0] = tt;
                rikumi[x][y][1] = ss;
                rikumi[y][x][0] = tt;
                rikumi[y][x][1] = ss;
                if(ss==0){
                    rikuOnly[x][y] = tt;
                    rikuOnly[y][x] = tt; 
                }
            }
            for(int k=0; k<n; k++){
                for(int i=0; i<n; i++){
                    for(int j=0; j<n; j++) rikuOnly[i][j] = Math.min(rikuOnly[i][j], rikuOnly[i][k] + rikuOnly[k][j]);
                }
            }

            r = sc.nextInt();
            z = new int[r];
            for(int i=0; i<r; i++) z[i] = sc.nextInt()-1;

            int ans = dijkstra();
            System.out.println(ans);
        }
    }

    int dijkstra(){
        //pos, time, next, fune
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[1] - b[1];
                }
            });
        if(z[0]==0) q.add(new int[]{0,0,1,0,0});
        else q.add(new int[]{0,0,0,0,0});


        int[][][] v = new int[n][r][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<r; j++){
                for(int k=0; k<n; k++){
                    v[i][j][k] = INF;
                }
            }
        }
         
        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], time = qq[1], next = qq[2], fune = qq[3];

            if(next==r){
                return time;
            }
            if(v[pos][next][fune]<=time) continue;
            v[pos][next][fune] = time;

            for(int i=0; i<cost[pos].size(); i++){
                int t1 = (Integer)(cost[pos].get(i));
                int t2 = rikumi[pos][t1][0];
                int t3 = rikumi[pos][t1][1];
                if(t3==1){//umi
                    if(rikuOnly[fune][pos]==INF) continue;
                    if(t1==z[next]) q.add(new int[]{t1, time+t2+rikuOnly[fune][pos]*2, next+1, t1});
                    else q.add(new int[]{t1, time+t2+rikuOnly[fune][pos]*2, next, t1});
                }else{//riku
                    if(t1==z[next]) q.add(new int[]{t1, time+t2, next+1, fune});
                    else q.add(new int[]{t1, time+t2, next, fune});
                }
                
            }
        }
        return INF;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}