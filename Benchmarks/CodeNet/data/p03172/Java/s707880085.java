import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int K = in.nextInt();
      int[] a = new int[N];
      for (int i = 0; i < N; i++) {
        a[i] = in.nextInt();
      }
      int[][] dp = new int[N+1][K+1];
      for(int i=0; i<= N ;i++){
        dp[i][0] = 1;
      }
      for(int i = 1; i<= N ;i++){
        for(int j = 1; j<=K; j++){
          int temp = 0;
          while(temp < a[i] && (j - temp) >=0){
            dp[i][j] += dp[i-1][j-temp];
            temp++;
          }
        }
      }
      
      System.out.println(dp[N][K]);
	}
}
