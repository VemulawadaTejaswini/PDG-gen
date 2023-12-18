import java.util.*;
import java.io.*;
class Main {
    static int[] wt;
    static int[] val;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        wt = new int[N];
        val = new int[N];

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            wt[i] = Integer.parseInt(st.nextToken());
            val[i] = Integer.parseInt(st.nextToken());
        }

        long[][] dp = new long[N+1][C+1];
        knapsack(dp, N, C);

//        bottom-up
//        for (int i=1; i<=N; i++){
//            for (int j = 1; j <= C; j++) {
//                dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
//                if(j-wt[i-1]>=0)
//                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-wt[i-1]]+val[i-1]);
//            }
//        }
        System.out.println(dp[N][C]);
    }

    public static long knapsack(long[][] dp, int N, int C){
        if (N<=0 || C<=0)
            return 0;
        if(dp[N][C]!=0)
            return dp[N][C];

        long ans = 0;

            long t1 = knapsack(dp, N-1, C);
            long t2 = 0;
            if(wt[N-1]<=C)
                t2 = knapsack(dp, N-1, C-wt[N-1])+val[N-1];
            ans = Math.max(t1,t2);
        return dp[N][C]=ans;
    }
}
