import java.util.*;
import java.io.*;

class Main {


  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();

    double[] p = new double[N];
    for (int i = 0; i < N; i++) {p[i] = in.nextDouble();}

    double[][] dp = new double[N +  1][N + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= i; j++) {
        dp[i][j] = (j == 0 ? 0 : (dp[i - 1][j - 1] * p[i - 1])) + dp[i - 1][j] * (1 - p[i - 1]);
      }
    }

    double ans = 0;
    for (int i = N / 2 + 1; i <= N; i++) {
      ans += dp[N][i];
    }




    System.out.println(ans);
  }

}