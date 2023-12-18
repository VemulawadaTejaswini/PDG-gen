import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] dp = new int[N+1];
    int[] list = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};
    int len = list.length;
    for(int i = 0; i<N+1; i++){
      if(i == 0) dp[i] = 0;
      else dp[i] = 1000007;
    }
    for(int i=0; i<N+1; i++){
      for(int j=0; j<len; j++){
        if(i+list[j]<N+1) dp[i+list[j]] = Math.min(dp[i]+1, dp[i+list[j]]);
      }
    }
    System.out.println(dp[N]);
  }
}