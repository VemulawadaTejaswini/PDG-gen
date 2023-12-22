/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_D&lang=jp
 */

import java.util.*;
import java.util.Arrays;


class Main {
  class Memo {
    int i, t, cw, p;
    Memo(int i, int t, int cw, int p) {
      this.i = i;
      this.t = t;
      this.cw = cw;
      this.p = p;
    }
    public int hashCode() {
      return Objects.hash(i, t, cw, p);
    }
    public boolean equals(Object o) {
      if (o instanceof Memo) {
        Memo m = (Memo) o;
        if (m.i == i && m.t == t && m.cw == cw && m.p == p) {
          return true;
        }
      }
      return false;
    }
  }
  int n=0, k=0;
  int[] W;
  int[] T;
  Hashtable<Memo, Integer> ht = new Hashtable<Memo, Integer>();

  void printArray(int[] a) {
    System.out.print(a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print(" " + a[i]);
    }
  }
  /*
   * i : index of array `W`
   * t : index of track
   * cw: the current weight of track `t`
   * p : the common maximum load.
   */
  int solve(int i, int t, int cw, int p) {
    if (i >= n) return p;
    Memo m = new Memo(i, t, cw, p);
    Integer x = ht.get(m);
    if (x != null) return x;
    int ret = -1;
    if (t == k - 1) {
      //cw = T[T.length-1] = cw+W[i];
      //return solve(i+1, t, cw, Math.max(cw, p));
      for (; i < n; i++) {
        cw += W[i];
      }
      T[T.length-1] = cw;
      ret = Math.max(cw, p);
    } else if (cw == 0) {
      T[t] = W[i];
      ret = solve(i+1, t, T[t], Math.max(T[t], p));
    } else {
      if (p < cw+W[i]) {
        int a1 = solve(i, t+1, 0, p);
        T[t] = cw+W[i];
        int a2 = solve(i+1, t, T[t], Math.max(T[t], p));
        ret = Math.min(a1, a2);
      } else {
        T[t] = cw+W[i];
        int a2 = solve(i+1, t, T[t], Math.max(T[t], p));
        ret = a2;
      }
    }
    ht.put(m, ret);
    return ret;
  }

  void run() {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    W = new int[n];
    T = new int[k];
    for (int i = 0; i < n; i++) {
      W[i] = sc.nextInt();
    }

    System.out.println(solve(0, 0, 0, 0));
  }
  static public void main(String[] args) {
    new Main().run();
  }
}
