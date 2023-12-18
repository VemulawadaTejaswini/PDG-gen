
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
  static class FastScanner
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");
    
    String next() {
      while(!st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {}
      }
      return st.nextToken();
    }
    
    int nextInt() {
      return Integer.parseInt(next());
    }
    
    long nextLong() {
      return Long.parseLong(next());
    }
    
  }
  
  public static void main(String[] args) {
    FastScanner fs = new FastScanner();
    int N = fs.nextInt();
    int[][] arr = new int[N][3];
    for(int i = 0; i < N; ++i) {
      for(int j = 0; j < 3; ++j) {
        arr[i][j] = fs.nextInt();
      }
    }
    PrintWriter out = new PrintWriter(System.out);
    out.println(solve(arr));
    out.close();
  }
  
  public static int solve(int[][] arr) {
    int prevChose = 0;
    int[] dp = new int[arr.length];
    dp[0] = Math.max(Math.max(arr[0][0], arr[0][1]), arr[0][2]);
    if(dp[0] == arr[0][2]) prevChose = 2;
    if(dp[0] == arr[0][1]) prevChose = 1;
    if(dp[0] == arr[0][0]) prevChose = 0;
    for(int i = 1; i < dp.length; ++i) {
      int extra = 0;
      if(prevChose == 0) extra = Math.max(arr[i][1], arr[i][2]);
      if(prevChose == 1) extra = Math.max(arr[i][0], arr[i][2]);
      if(prevChose == 2) extra = Math.max(arr[i][1], arr[i][0]);
      if(extra == arr[i][2]) prevChose = 2;
      if(extra == arr[i][1]) prevChose = 1;
      if(extra == arr[i][0]) prevChose = 0;
      dp[i] = dp[i-1] + extra;
    }
    return dp[arr.length - 1];

  }
  

}
