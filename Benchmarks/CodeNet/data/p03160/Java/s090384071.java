import java.util.*;
import java.io.*;

class Main {




  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int[] hs = new int[N];
    for (int i = 0; i < N; i++) {
      hs[i] = in.nextInt();
    }

    int[] dp = new int[N];
    dp[0] = 0;
    dp[1] = Math.abs(hs[1] - hs[0]);


    for (int i = 2; i < N; i++) {
      dp[i] = Math.min(dp[i - 1] + Math.abs(hs[i] - hs[i - 1]), 
                       dp[i - 2] + Math.abs(hs[i] - hs[i - 2]));
    }

    System.out.println(dp[N - 1]);
  }

  

  
}