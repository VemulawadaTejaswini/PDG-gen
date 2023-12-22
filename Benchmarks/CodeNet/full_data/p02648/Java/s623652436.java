import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static long[][] dp;
    private static final int MAX = (int)1e5;
    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(br.readLine());
        init(n);
        int[] v = new int[n+1];
        int[] w = new int[n+1];
        String[] tokens = null;
        for(int i=1;i<=n;i++){
            tokens = br.readLine().split(" ");
            v[i] = Integer.parseInt(tokens[0]);
            w[i] = Integer.parseInt(tokens[1]);
        }
        int q = Integer.parseInt(br.readLine());;
        while(q-->0){
            tokens = br.readLine().split(" ");
            int vertex = Integer.parseInt(tokens[0]);
            int l  = Integer.parseInt(tokens[1]);
            System.out.println(solve(v,w,vertex,l));
        }
    }

    private static void  init(int n){
        dp = new long[n+1][MAX+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
    }
    private static long solve(int[] v,int[] w,int vertex,int l){
        if(dp[vertex][l]!=-1)
            return dp[vertex][l];
        if(vertex==0)
            return 0;
        long ans = solve(v,w,vertex>>1,l);
        if(w[vertex]<=l)
            ans = Math.max(ans,solve(v,w,vertex>>1,l-w[vertex])+v[vertex]);
        dp[vertex][l] = ans;
        return ans;
    }


}