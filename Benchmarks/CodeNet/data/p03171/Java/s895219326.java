import java.io.*;
import java.util.*;

class Main {
  static final Scanner in = new Scanner(System.in);
  static int N, K;

  static int[] a;
  static Pair dp[][];

  static class Pair {
    long curr_val, other_val;

    Pair(int l, int r) {
      curr_val = l;
      other_val = r;
    }

    @Override
    public String toString() {
      return "(" + curr_val + " , " + other_val + ")";
    }
  }

  public static void main(String[] args) throws Exception {
    N = in.nextInt();

    a = new int[N];

    for (int i = 0; i < N; i++) a[i] = in.nextInt();
    dp = new Pair[N][N];
    Pair ans = F(0, N - 1);

    System.out.println(ans.curr_val - ans.other_val);
  }

  static Pair F(int l, int r) {
    // System.out.println("l = " + l + " r = " + r);
    if (l == r) {
      dp[l][r] = new Pair(a[l], 0);
      return dp[l][r];
    }

    if (dp[l][r] != null) return dp[l][r];

    Pair left = F(l + 1, r);
    Pair right = F(l, r - 1);

    Pair toRet = new Pair(-1, -1);
    if (left.other_val + a[l] > right.other_val + a[r]) {
      toRet.curr_val = left.other_val;
      toRet.curr_val += a[l];
      toRet.other_val = left.curr_val;
      return toRet;
    }

    if (left.other_val + a[l] < right.other_val + a[r]) {
      toRet.curr_val = right.other_val;
      toRet.curr_val += a[r];
      toRet.other_val = right.curr_val;
    } else {
      if (left.curr_val < right.curr_val) {
        toRet.curr_val = left.other_val;
        toRet.curr_val += a[l];
        toRet.other_val = left.curr_val;
      } else {
        toRet.curr_val = right.other_val;
        toRet.curr_val += a[r];
        toRet.other_val = right.curr_val;
      }
    }

    dp[l][r] = toRet;
    return toRet;
  }

  // static void F() {
  //   for (int k = 1; k <= a[0] && k <= K; k++) {
  //     dp[k] = false;
  //   }

  //   for (int k = a[0]; k <= K; k++) {
  //     boolean win_state = false;
  //     for (int i = 0; i < N; i++) {
  //       if (k < a[i]) break;
  //       if (!dp[k - a[i]]) win_state = true;
  //     }
  //     dp[k] = win_state;
  //   }
  // }
}
