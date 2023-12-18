import java.util.*;
import java.io.*;

class Main {
  int N, M, ans;
  List<List<Integer>> adj;
  int[] dp;
  Main(int n, int m, List<List<Integer>> a) {
    N = n; M = m; adj = a;
    ans = 0;
    dp = new int[N];
    Arrays.fill(dp, -1);
  }

  void solve() {

    for (int i = 0; i < N; i++) {
      if (dp[i] == -1) dp[i] = dp(i);
    }

    for (int i = 0; i < N; i++) {
      //System.out.print(dp[i] + " ");
      ans = Math.max(ans, dp[i]);
    }
    //System.out.println();
  }

  int dp(int cur) {
    if (dp[cur] != -1) return dp[cur];
    dp[cur] = 0;
    for (int i : adj.get(cur)) {
      dp[cur] = Math.max(dp[cur], dp(i) + 1);
    }
    return dp[cur];
  }

  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int M = in.nextInt();
    List<List<Integer>> adj = new ArrayList<>(N);
    for (int i = 0; i < N; i++) {adj.add(new ArrayList<>());}
    for (int i = 0; i < M; i++) {
      int u = in.nextInt() - 1;
      int v = in.nextInt() - 1;
      adj.get(u).add(v);
    }
    Main test = new Main(N, M, adj);
    test.solve();
    System.out.println(test.ans);
  }

}