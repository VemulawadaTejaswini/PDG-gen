import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    int[] arr = new int[N];
    int[] dp = new int[N];
    for (int m = 1; m <= N; ++m) {
       int n = in.nextInt();
       arr[m-1] = n;
    }
     
    dp[0] = arr[0];
    for(int i = 1; i < N; i++) {
      if(i == 1) {
        dp[i] = Math.abs(arr[i]-dp[i-1]);
      }
      else if(i == 2)
      {
        dp[i] = Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]), Math.abs(arr[i]-dp[i-2]));
      }
      else
      {
        dp[i] = Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]), dp[i-2]+Math.abs(arr[i]-arr[i-2]));
      }
    }

    System.out.println(dp[N-1]);
  }
  
}