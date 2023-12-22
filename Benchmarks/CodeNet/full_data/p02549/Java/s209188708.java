import java.util.Scanner;

public class Main {
  static final long MOD = 998244353;
  static int[][] lr;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    lr = new int[k][2];
    for(int i = 0; i < k; i++){
      lr[i][0] = sc.nextInt();
      lr[i][1] = sc.nextInt();
    }
    sc.close();
    long[] dp = new long[n + 1];
    dp[1] = 1;
    for(int i = 2; i <= n; i++){
      for(int j = 1; j < i; j++){
        if(canMove(i - j)){
          dp[i] += dp[j];
          dp[i] %= MOD;
        }
      }
    }

    System.out.println(dp[n]);
  }
  static boolean canMove(int n){
    for(int i = 0; i < lr.length; i++){
      if(lr[i][0] <= n && lr[i][1] >= n){
        return true;
      }
    }
    return false;
  }
}