import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int WW = Integer.parseInt(sc.next());
    int[] v = new int[N+1];
    int[] w = new int[N+1];
    for(int i=1; i<N+1; i++){
      v[i] = Integer.parseInt(sc.next());
      w[i] = Integer.parseInt(sc.next());
    }

    int[][] dp = new int[N+1][WW+1];
    for(int i=1; i<N+1; i++){
        dp[i][0] = 0;
    }
  
    for (int i=1; i<=N; i++) {
      for (int W=1; W<=WW; W++) {
        for(int n=1; W-n*w[i] >=0; n++){
            dp[i][W] = Math.max(dp[i-1][W], dp[i-1][W-n*w[i]] + n*v[i]);
        }
      }
    }
    System.out.println(dp[N][WW]);
  }
}