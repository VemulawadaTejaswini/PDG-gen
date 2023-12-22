import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    static final int INF = Integer.MAX_VALUE;
    static final int WHITE = 0;
    static final int GRAY = 1;
    static final int BLACK = 2;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[][] m = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                m[i][j] = Integer.parseInt(sc.next());
                if(m[i][j] == -1) m[i][j] = INF;
            }
        }
        
        int[] color = new int[n];
        int[] d = new int[n];
        Arrays.fill(d, INF);
        int[] p = new int[n];
        d[0] = 0;
        p[0] = -1;
        
        while(true){
            int minCost = INF;
            int u = 0;
            for(int i = 0; i < n; i++){
                if(color[i] != BLACK && d[i] < minCost){
                    minCost = d[i];
                    u = i;
                }
            }
            
            if(minCost == INF) break;
            
            color[u] = BLACK;
            
            for(int v = 0; v < n; v++){
                if(color[v] != BLACK && m[u][v] != INF){
                    if(m[u][v] < d[v]){
                        d[v] = m[u][v];
                        p[v] = u;
                        color[v] = GRAY;
                    }
                }
            }
        }
        
        int ans = 0;
        for(int i = 1; i < n; i++){
            ans += m[i][p[i]];
        }
        System.out.println(ans);
    }
}
