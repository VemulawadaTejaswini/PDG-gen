import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] edge = new ArrayList[n];

        for (int i=0; i<n; i++) edge[i] = new ArrayList<>();

        for (int i=0; i<m; i++){
            int s = sc.nextInt()-1;
            int t = sc.nextInt()-1;
            edge[s].add(t);
        }

        double[] dp = new double[n];

        double ans = Double.MAX_VALUE;
        for (int i=0; i<n-1; i++){
            Arrays.fill(dp, 0.0);
            for (int j=n-2; j>=0; j--){
                double sum = 0;
                double max = 0;
                for (int e: edge[j]){
                    sum += dp[e];
                    max = Math.max(max, dp[e]);
                }
                dp[j] = sum / edge[j].size() + 1;
                if (j==i && edge[j].size() > 1){
                    dp[j] = (sum-max) / (edge[j].size()-1) + 1;
                }
            }
            ans = Math.min(ans, dp[0]);
        }
        System.out.println(ans);
    }
}