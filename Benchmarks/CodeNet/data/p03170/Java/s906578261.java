import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for(int i=0;i<N;++i) A[i] = sc.nextInt();
    
    System.out.println(getWinner(A, N, K));
  }
  
  private static String getWinner(int[] nums, int n, int k) {
    boolean[] dp = new boolean[k+1];
    
    // base case
    dp[0] = false;
    for(int i=1;i<=k;++i) {
      for(int j=0;j<n;++j) {
        if (i-nums[j] >= 0 && !dp[i-nums[j]]) {
          dp[i] = true;
          break;
        }
      }
    }
    
    return dp[k] ? "First" : "Second";
  }
}