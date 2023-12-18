package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class DPeopleonaLine {

  public void solve(int testNumber, Scanner in, PrintWriter out) {
    boolean f = true;
    int n = in.nextInt();
    int m = in.nextInt();
    PotentialUnionFind puf = new PotentialUnionFind();
    puf.init(n);
    for (int i = 0; i < m; i++) {
      int l = in.nextInt() - 1;
      int r = in.nextInt() - 1;
      long dis = in.nextLong();
      if (puf.find(l, r)) {
        // out.println(i + ": find true");
        // out.println("dif(l, r):" + puf.dif(l, r));
        if (puf.dif(l, r) != dis) {
          f = false;
        }
      } else {
        // out.println(i + ": find false");
        puf.union(l, r, dis);
      }
      // out.println(f);
      /*
      for (int j = 0; j < n; j++) {
        out.println(j + "th weight: " + puf.potential(j));
      }
      */
    }

    out.println(f ? "Yes" : "No");
  }
}
