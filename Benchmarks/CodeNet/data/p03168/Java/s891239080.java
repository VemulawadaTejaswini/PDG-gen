import java.util.*;
import java.io.*;

class Main {


  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();

    double[] p = new double[N];
    for (int i = 0; i < N; i++) {p[i] = in.nextDouble();}

    double[] dp = new double[N + 1];
    dp[0] = 1;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j >= 0; j--) {
        dp[j] = (j == 0 ? 0 : (dp[j - 1] * p[i])) + dp[j] * (1 - p[i]);
      }
    }

    double ans = 0;
    for (int i = N / 2 + 1; i <= N; i++) {
      ans += dp[i];
    }




    System.out.println(ans);
  }

}