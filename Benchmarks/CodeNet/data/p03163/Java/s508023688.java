
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
    long W = fs.nextLong();
    long[][] arr = new long[N][2];
    for(int i = 0; i < N; ++i) {
      arr[i][0] = fs.nextLong();
      arr[i][1] = fs.nextLong();
    }
    PrintWriter out = new PrintWriter(System.out);
    bubbleSort(arr);
    out.println(solve(arr, W));
    out.close();
  }
  
  public static void bubbleSort(long[][] arr) 
  { 
      int n = arr.length; 
      for (int i = 0; i < n-1; i++) 
          for (int j = 0; j < n-i-1; j++) 
              if (arr[j][0] > arr[j+1][0]) 
              { 
                  long[] temp = arr[j]; 
                  arr[j] = arr[j+1]; 
                  arr[j+1] = temp; 
              } 
  }
  
  
  public static long solve(long[][] arr, long W) {
    long[][] dp = new long[arr.length][(int) (W+1)];
    for(int i = 0; i < dp[0].length; ++i) {
      if(i >= arr[0][0]) {
        dp[0][i] = arr[0][1];
      }
    }
    for(int r = 1; r < dp.length; ++r) {
      int isUsed = dp[0].length;
      for(int c = 1; c < dp[0].length; ++c) {
        long val = Long.MIN_VALUE;
        if(c-arr[r][0] >= 0 && c-arr[r][0] < isUsed) {
          val = dp[r][(int) (c-arr[r][0])] + arr[r][1];
        }
        dp[r][c] = Math.max(Math.max(val, dp[r-1][c]), dp[r][c-1]);
        if(isUsed == dp[0].length && dp[r][c] == val && dp[r][c] != dp[r-1][c] && dp[r][c] != dp[r][c-1]) {
          isUsed = c;
        }
      }
    }
    return dp[arr.length - 1][(int)W];
  }

}
