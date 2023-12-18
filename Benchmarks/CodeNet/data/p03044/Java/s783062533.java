import java.util.*;

public class Main {
  static int n;
  static ArrayList[] e;
  static HashMap[] elen;
  static int[] c;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    e = new ArrayList[n];
    elen = new HashMap[n];
    c = new int[n];
    for(int i = 0; i < n; i++) {
      e[i] = new ArrayList<Integer>();
      elen[i] = new HashMap<Integer, Integer>();
    }
    for(int i = 0; i < n - 1; i++) {
      int u = sc.nextInt() - 1;
      int v = sc.nextInt() - 1;
      int w = sc.nextInt();
      e[u].add(v);
      e[v].add(u);
      elen[u].put(v, w);
      elen[v].put(u, w);
    }
    dfs(0, -1);
    for(int i = 0; i < n; i++) {
      System.out.println(c[i]);
    }
  }

  public static void dfs(int now, int p) {
    ArrayList<Integer> l = e[now];
    HashMap<Integer, Integer> h = elen[now];
    for(int i = 0; i < l.size(); i++) {
      int g = l.get(i);
      if(g != p) {
        int len = h.get(g);
        if(len % 2 == 0) {
          c[g] = c[now];
        } else {
          c[g] = 1 - c[now];
        }
        dfs(g, now);
      }
    }
  }
}
