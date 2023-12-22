import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {

  public static class edge {
    int from;
    int to;
    edge (int _from, int _to) {
      from = _from;
      to   = _to;
    }
  }

  static final int V = 100;
  static int n, t;
  static int d[], f[];
  static ArrayList<ArrayList<edge>> es;

  public static void dfs(int v) {  
    int i;
    d[v] = ++t;
    for (i=0; i<es.get(v).size(); i++) {
      int to = es.get(v).get(i).to;
      if (d[to] == -1) dfs(to);
    }
    f[v] = ++t;
  }

  public static void main(String[] args) {
    int i, j;

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    es = new ArrayList<ArrayList<edge>>();
    d = new int[n];
    f = new int[n];
    Arrays.fill(d, -1);
    Arrays.fill(f,  0);

    for (i=0; i<n; i++) {
      int u = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      ArrayList<edge> l = new ArrayList<edge>();
      for (j=0; j<k; j++) {
        int v = Integer.parseInt(sc.next());
        l.add(new edge(u-1, v-1));
      }
      es.add(new ArrayList<edge>(l));
    }

    t = 0;
    for (i=0; i<n; i++)
      if (d[i] == -1) dfs(i);

    for (i=0; i<n; i++) {
      System.out.print(String.valueOf(i+1) + ' ');
      System.out.print(String.valueOf(d[i]) + ' ');
      System.out.println(f[i]);
    }
  }
}