import java.util.*;

public class Main {
  // constant
  static long MAX_LONG = Long.MAX_VALUE;

  // global variables
  static long[] dists;

  // inner classes
  static class NBR {
    int bi;
    long ti;

    NBR(int bi, long ti) {
      this.bi = bi;
      this.ti = ti;
    }
  }

  static class QComp implements Comparator<Integer> {
    public int compare(Integer int0, Integer int1) {
      int i0 = int0.intValue();
      int i1 = int1.intValue();
      long cmpd = dists[i0] - dists[i1];
      if (cmpd < 0) return -1;
      if (cmpd > 0) return 1;
      return  i0 - i1;
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    long x = sc.nextLong();

    long[] hs = new long[n];
    for (int i = 0; i < n; i++)
      hs[i] = sc.nextInt();

    ArrayList<ArrayList<NBR>> nbrs = new ArrayList<ArrayList<NBR>>();
    for (int i = 0; i < n; i++)
      nbrs.add(new ArrayList<NBR>());

    for (int i = 0; i < m; i++) {
      int ai = sc.nextInt() - 1;
      int bi = sc.nextInt() - 1;
      long ti = sc.nextLong();

      nbrs.get(ai).add(new NBR(bi, ti));
      nbrs.get(bi).add(new NBR(ai, ti));
    }

    dists = new long[n];
    Arrays.fill(dists, MAX_LONG);
    dists[0] = 0;

    PriorityQueue<Integer> q = new PriorityQueue<Integer>(n / 2, new QComp());
    q.add(0);

    while (! q.isEmpty()) {
      Integer ui = q.poll();
      int u = ui.intValue();

      if (u == n - 1) continue;

      long du = dists[u];
      long xu = x - du;
      if (xu < 0) xu = 0;
      long hu = hs[u];

      for (NBR vnbr: nbrs.get(u)) {
        int v = vnbr.bi;
        long dv = du + vnbr.ti;
        long xv = xu - vnbr.ti;

        if (xv < 0) {
          if (xu + -xv > hu) continue;
          dv += -xv;
        }
        else if (xv > hs[v]) {
          dv += xv - hs[v];
        }

        if (dists[v] > dv) {
          if (dists[v] < MAX_LONG) q.remove(v);
          dists[v] = dv;
          q.add(v);
        }
      }
    }

    long dg = dists[n - 1];

    if (dg >= MAX_LONG)
      dg = -1;
    else {
      long xg = x - dg;
      if (xg < 0) xg = 0;
      dg += hs[n - 1] - xg;
    }

    System.out.println(dg);
  }
}