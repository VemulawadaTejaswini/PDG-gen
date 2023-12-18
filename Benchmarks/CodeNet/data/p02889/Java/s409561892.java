import java.util.*;

public class Main{
    
    static final long INF = (long)1L<<60;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        
        long[][] dist = new long[n][n];
        for(long[] tmp : dist){
            Arrays.fill(tmp, INF);
        }
        for(int i=0; i<n; i++){
            dist[i][i] = 0;
        }
        
        for(int i=0; i<m; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            int c = Integer.parseInt(sc.next());
            dist[a][b] = c;
            dist[b][a] = c;
        }
        
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dist[i][j] <= l){
                    dist[i][j] = 1;
                }else{
                    dist[i][j] = INF;
                }
            }
        }
        
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
                }
            }
        }
        
        int q = Integer.parseInt(sc.next());
        for(int i=0; i<q; i++){
            int s = Integer.parseInt(sc.next())-1;
            int t = Integer.parseInt(sc.next())-1;
            if(dist[s][t] != INF){
                System.out.println(dist[s][t]-1);
            }else{
                System.out.println(-1);
            }
        }
        
    }
}

