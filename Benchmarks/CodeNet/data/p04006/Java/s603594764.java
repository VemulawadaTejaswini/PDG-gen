import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    long x = scan.nextLong();
    long[][] dp = new long[n][n];
    for(int j = 0; j < n; j++) {
      dp[0][j] = scan.nextLong();
    }
    for(int i = 1; i < n; i++) {
      for(int j = 0; j < n; j++) {
        dp[i][j] = Math.min(dp[i-1][j], dp[0][(j-i+n)%n]);
      }
    }
    long result = 1L<<60;
    for(int i = 0; i < n; i++) {
      long dummyResult = i*x;
      for(int j = 0; j < n; j++) {
        dummyResult += (long)dp[i][j];
      }
      result = Math.min(result,dummyResult);
    }
    System.out.println(result);
  }
}
