import java.util.*;
import java.io.*;

class Main {


  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int K = in.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {a[i] = in.nextInt();}
    boolean[] dp = new boolean[K + 1]; // dp[i]: True if who are making the move now wins when there are i stones left
    dp[0] = false;
    for (int i = 1; i <= K; i++) {
      dp[i] = false;
      for (int j = 0; j < N; j++) {
        if (i >= a[j]) {
          if (dp[i - a[j]] == false) {
            dp[i] = true;
            break;
          }
        } else {
          break;
        }
      }
    }



    System.out.println(dp[K] ? "First" : "Second");
  }

}