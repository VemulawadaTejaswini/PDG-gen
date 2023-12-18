import java.util.*;
import java.io.*;
 
class Main {
 
  
 
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int INF = (int) 1e9 + 7;
 
    int N = in.nextInt();
    int K = in.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }
 
    int[] dp = new int[K + 1];
    dp[0] = 1;
    // Arrays.fill(dp[0], 1);
    for (int child = 0; child < N; child++) {
      int[] tmp = new int[K + 1];
      for (int used = K; used >= 0; used--) {
 
        // pre + (j - a[i - 1] ... j)
        // int pre = (dp[i - 1][j] - (j - a[i - 1] <= 0 ? 0 : dp[i - 1][j - a[i - 1] - 1]));
        // if (pre < 0) {pre += INF;}
        // dp[i][j] = (j == 0 ? 0 : dp[i][j - 1]) + pre;
        // if (dp[i][j] >= INF) {dp[i][j] -= INF;}
        
        int delta = dp[used];
        int L = used + 1;
        int R = used + Math.min(a[child], K - used);

        if (L <= R) {
          tmp[L] += delta;
          if (R + 1 <= K) {
            tmp[R + 1] -= delta;
          }
        }

        // for (int here = 1; here <=  Math.min(a[child], K - used); here++) {
        //   dp[used + here] += dp[used];
        //   if (dp[used] >= INF) {dp[used] -= INF;}
        // }
      }

      int prefix = 0;
      for (int i = 0; i <= K; i++) {
        prefix += tmp[i];
        dp[i] += prefix;
      }
    }
    
    // int res = dp[N][K] - (K == 0 ? 0 : dp[N][K - 1]);
    System.out.println(dp[K]);
  }
 
}