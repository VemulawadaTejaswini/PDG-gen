import java.util.*;

public class Main{

    int n,m,l;
    int[][] dist,assa;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            l = sc.nextInt();
            if(n==0 && m==0 && l==0) break;

            dist = new int[n][n];
            assa = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(dist[i],-1);
            for(int i=0; i<m; i++){
                int a = sc.nextInt()-1, b = sc.nextInt()-1;
                int d = sc.nextInt(), e = sc.nextInt();
                dist[a][b] = d; dist[b][a] = d;
                assa[a][b] = e; assa[b][a] = e;
            } 

            System.out.println(dijkstra());
        }
    }

    int dijkstra(){
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(n,new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[2]-b[2];
                }
            });
        q.add(new int[]{0,l,0});
        boolean[][] v = new boolean[n][l+1];

        while(q.size()>0){
            int[] qp = q.poll();
            int pos = qp[0], money = qp[1], assas = qp[2];

            if(pos==n-1) return assas;
            if(v[pos][money]) continue;
            v[pos][money] = true;

            for(int i=0; i<n; i++){
                if(dist[pos][i]==-1) continue;
                if(dist[pos][i]<=money){
                    q.add(new int[]{i,money-dist[pos][i],assas});
                }
                q.add(new int[]{i,money,assas+assa[pos][i]});
            }
        }

        return -1;
    }


    public static void main(String[] args){
        new Main().solve();
    }
}