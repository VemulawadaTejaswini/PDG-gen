import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        long dp[][] = new long[N+1][W+1];
        for(int i=1;i<=N;i++){
            int w = Integer.parseInt(sc.next());
            long v = Long.parseLong(sc.next());
            for(int j=0;j<=W;j++){
                if(j>=w){
                    if(i==1) dp[i][j] = v;
                    else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w]+v);
                }else{
                    if(i>1) dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][W]);
    }
}
