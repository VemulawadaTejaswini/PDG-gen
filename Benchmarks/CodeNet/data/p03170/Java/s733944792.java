import java.io.*;
import java.util.*;

class Main {
  static final Scanner in = new Scanner(System.in);
  static int N, K;

  static int[] a;
  static boolean dp[];

  public static void main(String[] args) throws Exception {
    N = in.nextInt();
    K = in.nextInt();
    a = new int[N];
    dp = new boolean[K + 1];

    for (int i = 0; i < N; i++) a[i] = in.nextInt();

    G();
    if (dp[K]) 
        System.out.println("First"); 
    else 
        System.out.println("Second");
  }

  static void G() {

    for (int k = a[0]; k <= K; k++) {

      boolean win_state = false;

      for (int i = 0; i < N; i++) {
        if (k < a[i]) 
            break;

        if (!dp[k - a[i]]) 
            win_state = true;
      }

      dp[k] = win_state;

    }
  }
}
