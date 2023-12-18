
import java.util.Scanner;

public class Main {

    //dp[i] = max(dp[i-1],dp[i-wi]+vi);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int[] weights = new int[N];
        int[] values = new int [N];
        long[] dp = new long[W+1];

        for(int i=0;i<N;i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            for(int j=W;j>=0;j--){
                if(j>=weights[i]) {
                    dp[j] = Math.max(dp[j], dp[j - weights[i]] + values[i]);
                }
                else{
                    dp[j] = dp[j];
                }
            }
        }

        System.out.println(dp[W]);

        sc.close();

    }

}
