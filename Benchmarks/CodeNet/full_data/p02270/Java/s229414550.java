/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_D&lang=jp
 */

import java.util.*;
import java.util.Arrays;


class Main {

  int n=0, k=0;
  int[] W;

  void printArray(int[] a) {
    System.out.print(a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print(" " + a[i]);
    }
  }

  int solve2(int i, int t, int max) {
    if (i >= n) return 0;
    if (t == k-1) {
      int sum = 0;
      for (; i < n; i++) {
        sum += W[i];
      }
      return sum;
    }
    int sum = 0;
    int min = Integer.MAX_VALUE;
    sum += W[i];
    for (; i < n - (k-1-t); i++) {
      if (sum + W[i+1] >= max) break;
      sum += W[i+1];
    }
    for (; i < n - (k-1-t); i++) {
      min = Math.min(min, Math.max(sum, solve2(i+1, t+1, max)));
      sum += W[i+1];
      max = sum;
    }

    return min;
  }

  int solve3(int upper) {
    int space = upper;
    int rk = k;
    for (int i = 0; i < W.length; i++) {
      space -= W[i];
      if (space < 0) {
        rk--;
        if (rk == 0) {
          return solve3(upper+1);
        }
        space = upper;
        space -= W[i];
      }
    }
    return upper;
  }

  void run() {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    W = new int[n];
    //T = new int[k];
    int max = 0;
    for (int i = 0; i < n; i++) {
      W[i] = sc.nextInt();
      max = Math.max(max, W[i]);
    }

    System.out.println(solve3(max));

    //System.out.println(solve2(0, 0, 0));
  }
  static public void main(String[] args) {
    new Main().run();
  }
}
