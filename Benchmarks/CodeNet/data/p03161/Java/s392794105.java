import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] input = new int[N];
    for (int i=0; i<N; i++) {
      input[i] = sc.nextInt();
    }
    System.out.println(minCost(N, K, input));
  }
  
  public static int minCost(int N, int K, int[] input) {
    if (N == 2) {
      return Math.abs(input[0] - input[1]);
    }
    int[] dp = new int[N];
    for (int i=2; i<N; i++) {
      int min = Integer.MAX_VALUE;
      int index = 1;
      while(K > index && index <= i) {
       	 int ap = Math.abs(input[i] - input[i - index]) + dp[i - index];
        if (min > ap) {
          min = ap;
        }
        index ++;
      }
      dp[i] = min;
    }
    return dp[N-1];
  }
}