import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {

  public static class edge {
    int from;
    int to;
    int cost;
    edge (int _from, int _to, int _cost) {
      from = _from;
      to   = _to;
      cost = _cost;
    }
  }

  static final int INF = Integer.MAX_VALUE;
  static int n;
  static int d[];
  static edge es[][];

  public static void shortest_path_BF(int s) {
    int i, j;
    Arrays.fill(d, INF);

    d[s] = 0;
    while (true) {
      boolean update = false;
      for (i=0; i<n; i++)
        for (j=0; j<es[i].length; j++) {
          edge e = es[i][j]; 
          if (d[e.from] != INF && d[e.to] > d[e.from] + e.cost) {
            d[e.to] = d[e.from] + e.cost;
            update = true;
          }
        }
      if (!update) break;
    }
  }

  public static void main(String[] args) {
    int i, j;

    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.next());
    es = new edge[n][];
    d = new int[n];

    for (i=0; i<n; i++) {
      int u = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      es[i] = new edge[k];
      for (j=0; j<k; j++) {
        int v = Integer.parseInt(sc.next());
        es[i][j] = new edge(u-1, v-1, 1);
      }
    }

    shortest_path_BF(0);

    for (i=0; i<n; i++) {
      int v = (d[i] != INF) ? d[i] : -1;
      System.out.print(String.valueOf(i+1) + ' ');
      System.out.print(String.valueOf(v) + '\n');
    }
  }
}