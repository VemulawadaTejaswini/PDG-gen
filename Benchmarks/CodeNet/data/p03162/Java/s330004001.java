import java.util.*;
import java.io.*;

class Main {


  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();

    int[] dp = new int[3];
    int[] cur = new int[3];
    for (int day = 0; day < N; day++) {
      
      int[] new_dp = new int[3];
      for (int i = 0; i < 3; i++) {
        cur[i] = in.nextInt();
        for (int j = 0; j < 3; j++) {
          if (i != j) {new_dp[j] = Math.max(new_dp[j], dp[i] + cur[i]);}
        }
      }
      dp = new_dp;
    }



    System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));
  }

}