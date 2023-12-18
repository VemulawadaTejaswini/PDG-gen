import java.util.*;
public class Main {
    
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    // get a integer
    int N = sc.nextInt();
    int[] input = new int[N];
    for(int i=0; i<N ; i++){
      input[i] = sc.nextInt();
    }
    System.out.println(minCost(N, input));
  }
  
  public static int minCost(int N, int[] array) {
    int[] dp = new int[N];
    dp[0] = 0;
    dp[1] = Math.abs(array[0] - array[1]);
    for (int i=2; i < N; i++) {
      int pre = Math.abs(array[i] - array[i-1]);
      int prepre = Math.abs(array[i] - array[i-2]);
      if (pre > prepre) {
        dp[i] = dp[i-2] + prepre;
      } else {
        dp[i] = dp[i-1] + pre;
      }
    }
    return dp[N-1];
  }
}