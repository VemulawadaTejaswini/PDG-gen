import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int[] p = new int[n];
        int[] c = new int[n];
        for(int i=0; i<n; i++){
            p[i] = Integer.parseInt(sc.next())-1;
        }
        for(int i=0; i<n; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        
        int[][] dbgp = new int[45][n];
        long[][] dbgc = new long[45][n];
        for(int i=0; i<n; i++){
            dbgp[0][i] = p[i];
            dbgc[0][i] = c[p[i]];
        }
        for(int i=0; i<43; i++){
            for(int j=0; j<n; j++){
                dbgp[i+1][j] = dbgp[i][dbgp[i][j]];
                dbgc[i+1][j] = dbgc[i][j]+dbgc[i][dbgp[i][j]];
            }
        }
        
        long max = -(long)1e18;
        for(int i=0; i<n; i++){
            long ans = 0;
            int now = i;
            for(int j=0; j<Math.min(5050, k); j++){
                ans += c[p[now]];
                now = p[now];
                max = Math.max(ans, max);
            }
        }
        
        for(int d=0; d<n; d++){
            for(int i=0; i<n; i++){
                long ans = 0;
                int idx = 0;
                int t = k-d;
                int now = i;
                while(t > 0){
                    if(t%2==1){
                        ans += dbgc[idx][now];
                        now = dbgp[idx][now];
                    }
                    t/=2;
                    idx++;
                }
                max = Math.max(max, ans);
            }
        }
        
        System.out.println(max);
    }
}
