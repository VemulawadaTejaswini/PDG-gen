import java.util.*;

class Main{

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

            rikumi = new int[n][n][2];//cost, riku or umi
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    for(int k=0; k<2; k++) rikumi[i][j][k] = INF;
                }
            }

            rikuOnly = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(rikuOnly[i], INF);
            for(int i=0; i<n; i++) rikuOnly[i][i] = 0;

            for(int i=0; i<m; i++){
                int x = sc.nextInt()-1, y = sc.nextInt()-1, tt = sc.nextInt();
                String s = sc.next();
                int ss = 0;

                if(s.equals("S")) ss = 1;
                rikumi[x][y][ss] = tt;
                rikumi[y][x][ss] = tt;
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

            for(int i=0; i<n; i++){
                for(int j=0; j<2; j++){
                    if(rikumi[pos][i][j]==INF) continue;
                    int cc = rikumi[pos][i][j];
                    if(j==1){//umi
                        if(rikuOnly[fune][pos]==INF) continue;
                        if(i==z[next]) q.add(new int[]{i, time+cc+rikuOnly[fune][pos]*2, next+1, i});
                        else q.add(new int[]{i, time+cc+rikuOnly[fune][pos]*2, next, i});
                    }else{//riku
                        if(i==z[next]) q.add(new int[]{i, time+cc, next+1, fune});
                        else q.add(new int[]{i, time+cc, next, fune});
                    }
                }
            }
        }
        return INF;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}