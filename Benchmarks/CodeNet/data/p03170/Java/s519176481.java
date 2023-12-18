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
    F();
    if (dp[K]) System.out.println("First"); else System.out.println("Second");
  }

  static boolean F(int k) {
    if (k < a[0]) return false;

    boolean win_state = false;
    for (int i = 0; i < N; i++) {
      if (k < a[i]) break;
      if (!F(k - a[i])) win_state = true;
    }

    return win_state;
  }

  static void F() {
    for (int k = 1; k <= a[0] && k <= K; k++) {
      dp[k] = false;
    }

    for (int k = a[0]; k <= K; k++) {
      boolean win_state = false;
      for (int i = 0; i < N; i++) {
        if(k < a[i])
          break;
        if (!dp[k - a[i]]) win_state = true;
      }
      dp[k] = win_state;
    }
  }
}
