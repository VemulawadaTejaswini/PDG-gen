import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Harry on 4/4/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_n
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }
        long[] preSum = new long[N+1];
        for(int i=1; i<=N; i++){
            preSum[i] = preSum[i-1]+A[i-1];
        }

        long[][] dp = new long[N][N];
        for(int j=1; j<N; j++){
            for(int i=j-1; i>=0; i--){
                dp[i][j] = Long.MAX_VALUE/2;
                for(int k=j; k>=i+1; k--){
                    dp[i][j] = Math.min(dp[i][j], dp[i][k-1]+dp[k][j]+preSum[j+1]-preSum[i]);
                }
            }
        }

        System.out.print(dp[0][N-1]);
    }
}
