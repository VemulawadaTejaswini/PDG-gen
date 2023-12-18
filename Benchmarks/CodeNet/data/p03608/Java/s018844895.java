import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      String[] ln = in.readLine().split(" ");
      int n = atoi(ln[0]);
      int m = atoi(ln[1]);
      int r = atoi(ln[2]);

      int[] t = mapInt(in.readLine().split(" "));

      final int INF = 1 << 28;
      Graph G = new Graph(n, r, t);

      int[] edge = new int[3];
      for (int a[] : G.graph) Arrays.fill(a, INF);
      for (int i = 0; i < m; i++) {
        mapInt(edge, in.readLine().split(" "));
        G.graph[edge[0]-1][edge[1]-1] = edge[2];
        G.graph[edge[1]-1][edge[0]-1] = edge[2];
      }

      // warshal-Froid
      for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            G.graph[i][j] = min(G.graph[i][j], G.graph[i][k] + G.graph[k][j]);
          }
        }
      }

      final int ans = G.compute();
      out.println(ans);
      out.println(Runtime.getRuntime().totalMemory() / 1024);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

 static class Graph {
    private int n, enm;
    private int[] pmt;
    private int ret;
    private Set<Integer> set;

    public int[][] graph;
    // option
    private int t[];

    public Graph(int n, int enm, int[] t) {
      this.n = n;
      this.enm = enm;
      this.t = t;
      ret = Integer.MAX_VALUE;
      graph = new int[n][n];
      pmt = new int[enm];
      set = new HashSet<>();
    }

    public int compute() {
      dfs(0);
      return ret;
    }

    private void dfs(int cnt) {
      if(cnt == enm) {
        evalute();
        return;
      }
  
      for (int v: t) {
        pmt[cnt] = --v;
        dfs(cnt+1);
      }
    }
  
    private void evalute() {
      set.clear();
      for (int p : pmt) {
        if(!set.add(p)) return;
      }
  
      int result = 0;
      for (int i = 1; i < enm; i++) result += graph[pmt[i-1]][pmt[i]];
      ret = min(ret, result);
    }
  }

  static int  atoi(String s) { return Integer.parseInt(s); }
  static long atol(String s) { return Long.parseLong(s); }
  static int[] mapInt(String[] sa) {
    int[] ret = new int[sa.length];
    for (int i = 0; i < sa.length; i++) ret[i] = Integer.parseInt(sa[i]);
    return ret;
  }
  static void mapInt(int[] ret, String[] sa) {
    for (int i = 0; i < sa.length; i++) ret[i] = Integer.parseInt(sa[i]);
  }
  static long[] mapLong(String[] sa) {
    long[] ret = new long[sa.length];
    for (int i = 0; i < sa.length; i++) ret[i] = Long.parseLong(sa[i]);
    return ret;
  }
  static void mapLong(long[] ret, String[] sa) {
    for (int i = 0; i < sa.length; i++) ret[i] = Long.parseLong(sa[i]);
  }
}