import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int w = Integer.parseInt(in[1]);

        int[] W = new int[n];
        long[] V = new long[n];

        for(int i=0;i<n;i++){
            in = br.readLine().split(" ");
            W[i] = Integer.parseInt(in[0]);
            V[i] = Long.parseLong(in[1]);
        }
        long[][] dp = new long[n][w+1];

        for(int i=0;i<n;i++){
            for(int j=1;j<w+1;j++){
                if(i==0){
                    if(j>=W[0])
                        dp[i][j] = V[0];
                    continue;
                }
                dp[i][j] = dp[i-1][j];
                if(j-W[i]>=0){
                    dp[i][j] = Math.max(dp[i][j],V[i]+dp[i-1][j-W[i]]);
                }
            }
        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<w+1;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(dp[n-1][w]);
    }
}
