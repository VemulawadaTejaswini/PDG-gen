import java.util.*;
import java.io.*;
 
class Main {
 
  
 
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int n = in.nextInt();
    int[][] can = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        can[i][j] = in.nextInt();
      }
    }

    int INF = (int) 1e9 + 7;

    int[] dp = new int[1 << n];
    dp[0] = 1;
    for (int mask = 0; mask < (1 << n) - 1; mask++) {
      int a = countSetBit(mask); // we are going to check assign a woman to (a+1)th man
      for (int b = 0; b < n; b++) {
        if (can[a][b] == 1 && ((mask & (1<<b)) == 0)) {
          dp[mask | (1 << b)] += dp[mask];
          if (dp[mask | 1 << b] >= INF) {dp[mask | (1 << b)] -= INF;}
        }
      }
    }

    System.out.println(dp[(1<<n) - 1]);
  }

  static int countSetBit(int a) {
    int count = 0; 
    while (a > 0) {
      count += (a & 1);
      a = a >> 1;
    }
    return count;
  }

 
}