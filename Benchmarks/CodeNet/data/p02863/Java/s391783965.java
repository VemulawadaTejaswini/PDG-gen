import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    // segment tree to record minimum value
    // Each point has a infinite distance from 0 (except itself)
    long solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), T = sc.nextInt();
        int[][] weight_value = new int[n][2];
        for(int i=0;i<n;i++){
            int w = sc.nextInt(), v = sc.nextInt();
            weight_value[i][0] = w; weight_value[i][1] = v;
        }
        // put the one with smaller weight at front
        Arrays.sort(weight_value,(o1,o2)->(o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]));
        // note that traditional back-pack ends at sum(weight)=T-1
        int[][] dp = new int[n+1][T+1];
        for(int i=1;i<=n;i++){
            int w = weight_value[i-1][0], v = weight_value[i-1][1];
            int maxi = 0;
            for(int j=0;j<T;j++){
                dp[i][j] = dp[i-1][j];
                if(j>=w){
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-w]+v);
                }
                maxi = Math.max(maxi, dp[i-1][j]);
            }
            // finally the tricky "tail"
            dp[i][T] = Math.max(dp[i-1][T], maxi+v);
        }
        long ans = 0;
        for(int j=0;j<=T;j++) ans = Math.max(ans, dp[n][j]);
        return ans;
    }
}

