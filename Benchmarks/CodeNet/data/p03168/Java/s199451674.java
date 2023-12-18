import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int coins = Integer.parseInt(sc.nextLine());
    String[] str = sc.nextLine().split(" ");
    double[] d = new double[coins];
    for (int i = 0; i < coins; i++) {
      d[i] = Double.parseDouble(str[i]);
    }
    System.out.println(solve(d, coins));
  }

  private static String solve(double[] d, int coins) {

    double[] dp = new double[coins + 1];
    /**
     * Let f(i, j) be the probability of getting exactly i heads among the first j coins. We have
     * two possibilities for the j-th coin. Case 1 - It is a heads. The probability of getting a
     * head is p[j]. And we need to get exactly (i - 1) heads from the previous (j - 1) coins. This
     * is given by p[j] x f(i - 1, j - 1) Case 2 - It is tails The probability is given by (1 -
     * p[j]) We need i heads from the first j - 1 coins. The probability is (1 - p[j]) x f(i, j - 1)
     * The base case is that f(0, 0) = 1.
     */
    dp[0] = 1;
    for (int i = 0; i < d.length; i++) {
      for (int j = i + 1; j >= 0; j--) {
        dp[j] = (j == 0 ? 0 : dp[j - 1] * d[i]) + dp[j] * (1 - d[i]);
        //        System.out.print(dp[j] + " ");
      }
      //      System.out.println();
    }

    //    for(int i=0;i<coins;i++){
    //      System.out.print(dp[i]+" ");
    //    }
    //    System.out.println();

    double ans = 0;
    for (int heads = 0; heads <= coins; heads++) {
      int tails = coins - heads;
      if (heads > tails) {
        ans += dp[heads];
      }
    }
    return String.format("%.10f", ans);
  }
}
