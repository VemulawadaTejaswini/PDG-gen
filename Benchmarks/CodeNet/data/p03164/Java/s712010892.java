import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int W = in.nextInt();
    int[] w = new int[n];
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      w[i] = in.nextInt();
      v[i] = in.nextInt();
    }
    final Solver solve = new Solver();
    System.out.println(solve.solve(W, w, v));
  }
}

class Solver {
  public long solve(int W, int[] w, int[] v) {
    int n = w.length;
    SortedSet<Integer> set = new TreeSet<Integer>();
    set.add(0);
    for (int i = 0; i < n; i++) {
      if (!set.contains(w[i])) {
        set.add(w[i]);
      }
    }
    if (set.last() != W) {
      set.add(W);
    }
    Integer[] arr = set.toArray(new Integer[0]);
    set.clear();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] < W) {
          set.add(arr[i] + arr[j]);
        }
      }
    }
    set.add(0);
    set.add(W);
    Integer[] pair_sum = set.toArray(new Integer[0]);
    W = pair_sum.length;
//    boolean[] present = new boolean[W + 1];
//    for (int i = 0; i < pair_sum.length; i++) {
//      present[pair_sum[i]] = true;
//      System.out.println(pair_sum[i]);
//    }
    long[][] dp = new long[n + 1][W];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < W; j++) {
        long val = 0;
        if (pair_sum[j] - w[i - 1] >= 0) {
          int temp = pair_sum[j] - w[i - 1];
          int idx = Arrays.binarySearch(pair_sum, temp);
          if (!set.contains(temp)) {
            idx += 1;
            idx = -1 * idx;
            idx -= 1;
          }
          val = dp[i - 1][idx] + v[i - 1];
        }
        dp[i][j] = Math.max(dp[i - 1][j], val);
      }
    }

    return dp[n][W-1];
  }
}
