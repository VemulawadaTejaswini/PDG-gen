import java.util.*;

public class Main {
    private static final long INF = 1L << 60;
    private static final int MAX_N = 110;
    private static final int MAX_V = 100100;
    private static long[][] dp = new long[MAX_N][MAX_V];
    public static void main(String[] args) throws Exception {
        for(int i=0;i<MAX_N;i++){
            Arrays.fill(dp[i],INF);
        }
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        long[] weight = new long[MAX_N];
        int[] value = new int[MAX_N];
        for(int i=0;i<N;i++){
            weight[i] = Long.parseLong(sc.next());
            value[i] = Integer.parseInt(sc.next());
        }
        dp[0][0] = 0;
        for(int i=0;i<N;i++){
            for(int sumV=0;sumV<MAX_V;sumV++){
                if(sumV -value[i] >= 0){
                    dp[i+1][sumV] = Math.min(dp[i+1][sumV],dp[i][sumV-value[i]] + weight[i]);
                }
                dp[i+1][sumV] = Math.min(dp[i+1][sumV],dp[i][sumV]);
            }
        }
        long res = 0;
        for(int sumV=0;sumV<MAX_V;sumV++){
            if(dp[N][sumV] <= W)res = sumV;
        }
        System.out.println(res);
    }
}
