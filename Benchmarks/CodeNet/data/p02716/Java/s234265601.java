import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    long[] dp = new long[N];
    long[] arr = new long[N];
    
    for(int i = 0; i < N; i++){
        arr[i] = in.nextLong();
    }
    
    dp[0] = arr[0];
    dp[1] = arr[1];
    
    for(int i = 2; i < N; i++) {
        dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
    }
    
    System.out.println(Arrays.toString(dp));
    
    System.out.println(dp[N/2] < 0 ? 0 : dp[N/2]);
    
  }
  
}