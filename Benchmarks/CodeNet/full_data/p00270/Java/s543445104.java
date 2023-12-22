import java.util.*;

public class Main {
  // constant

  static final long MAX_INT = 1L << 62;

  // inner classes

  static class Edge {
    int node, weight;

    Edge(int node, int weight) {
      this.node = node;
      this.weight = weight;
    }
  }

  // main

  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int sn = sc.nextInt();
    int rn = sc.nextInt();

    ArrayList<ArrayList<Edge>> nbrs = new ArrayList<ArrayList<Edge>>();
    for (int i = 0; i < sn; i++)
      nbrs.add(new ArrayList<Edge>());

    for (int i = 0; i < rn; i++) {
      int u = sc.nextInt() - 1;
      int v = sc.nextInt() - 1;
      int w = sc.nextInt();

      nbrs.get(u).add(new Edge(v, w));
      nbrs.get(v).add(new Edge(u, w));
    }

    int ta = sc.nextInt() - 1;
    int tb = sc.nextInt() - 1;
    int qn = sc.nextInt();

    long[] dists = new long[sn];
    for (int i = 0; i < sn; i++)
      dists[i] = MAX_INT;
    dists[ta] = 0;

    ArrayList<ArrayList<Integer>> prevs = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> q = new ArrayList<Integer>();
    for (int i = 0; i < sn; i++) {
      prevs.add(new ArrayList<Integer>());
      q.add(i);
    }

    while (! q.isEmpty()) {
      Integer ui = q.get(0);
      for (int i = 1; i < q.size(); i++) {
        Integer ui0 = q.get(i);
        if (dists[ui.intValue()] > dists[ui0.intValue()])
          ui = ui0;
      }

      q.remove(ui);
      int u = ui.intValue();

      if (u == tb) continue;

      for (Edge edge: nbrs.get(u)) {
        int v = edge.node;

        long dist0 = dists[u] + edge.weight;
        ArrayList<Integer> pv = prevs.get(v);
        if (dists[v] > dist0) {
          dists[v] = dist0;
          pv.clear();
          pv.add(u);
        }
        else if (dists[v] == dist0)
          pv.add(u);
      }
    }

    /*
    for (int i = 0; i < sn; i++)
      System.out.print(" " + dists[i]);
    System.out.println();
    */

    boolean[] onroutes = new boolean[sn];
    Arrays.fill(onroutes, false);
    onroutes[tb] = true;

    q.clear();
    q.add(tb);

    while (! q.isEmpty()) {
      int u = q.remove(0);
      if (u == ta) continue;

      for (int v: prevs.get(u)) {
        if (! onroutes[v]) {
          onroutes[v] = true;
          q.add(v);
        }
      }
    }

    for (int i = 0; i < qn; i++) {
      int c = sc.nextInt() - 1;
      int d = sc.nextInt() - 1;

      if (onroutes[c] && onroutes[d] && dists[c] < dists[d])
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}