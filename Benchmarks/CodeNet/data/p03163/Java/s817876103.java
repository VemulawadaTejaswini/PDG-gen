import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public long knapsack(int[] weights, int[] val, int n, int desired) {
        long[][] dp = new long[n+1][desired+1];
        for(int i=1;i<n+1;++i) {
            for(int j=1;j<desired+1;++j) {
                dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
                if(j>=weights[i-1]) {
                    dp[i][j]=Math.max(dp[i][j],val[i-1]+dp[i-1][j-weights[i-1]]);
                }
            }
        }
        return dp[n][desired];
    }

    public static void main(String[] args) {
        InputStreamReader r=new InputStreamReader(System.in);
        String[] line1=null;
        BufferedReader reader = new BufferedReader(r);
        Main b = new Main();
        try {
            line1=reader.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int desired = Integer.parseInt(line1[1]);
            int[] weights = new int[n];
            int[] val = new int[n];

            for(int i=0;i<n;++i) {
                String[] linei = reader.readLine().split(" ");
                weights[i]=Integer.parseInt(linei[0]);
                val[i]=Integer.parseInt(linei[1]);
            }
            System.out.println(b.knapsack(weights,val,n,desired));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
