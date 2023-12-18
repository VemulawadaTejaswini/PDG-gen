
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
    int n = fs.nextInt();
    int k = fs.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; ++i) {
      arr[i] = fs.nextInt();
    }
    int[] dp = new int[n];
    for(int i = 1; i < n; ++i) {
      int min = Integer.MAX_VALUE;
      for(int j = 1; j <= k; ++j) {
        int val = Integer.MAX_VALUE;
        if(i-j >= 0) {
          val = dp[i-j] + (int)Math.abs(arr[i-j]-arr[i]);
        }
        if(val < min) {
          min = val;
        }
        
      }
      dp[i] = min;
    }
    PrintWriter out = new PrintWriter(System.out);
    out.println(dp[n-1]);
    out.close();
  }
}
