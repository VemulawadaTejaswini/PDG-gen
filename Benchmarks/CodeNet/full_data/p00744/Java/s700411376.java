import java.util.*;

public class Main {
  // constant
  static final int INF = 1 << 30;

  // subroutines
  static int gcd(int a, int b) {
    if (a < b) {
      int tmp = a; a = b; b = tmp;
    }

    while (b > 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int m = sc.nextInt();
      int n = sc.nextInt();
      if ((m | n) == 0) break;

      int[] cbs = new int[m];
      for (int i = 0; i < m; i++) cbs[i] = sc.nextInt();

      int[] crs = new int[n];
      for (int i = 0; i < n; i++) crs[i] = sc.nextInt();

      int vn = m + n + 2;
      int st = m + n;
      int gl = m + n + 1;

      int[][] edges = new int[vn][vn];
      int[][] fs = new int[vn][vn];
      for (int i = 0; i < vn; i++)
	for (int j = 0; j < vn; j++)
	  edges[i][j] = fs[i][j] = 0;

      ArrayList<ArrayList<Integer>> nbrs = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < vn; i++)
	nbrs.add(new ArrayList<Integer>());
  
      for (int i = 0; i < m; i++)
	for (int j = 0; j < n; j++)
	  if (gcd(cbs[i], crs[j]) > 1) {
	    edges[i][m + j] = 1;
	    nbrs.get(i).add(m + j);
	    nbrs.get(m + j).add(i);
	  }

      for (int i = 0; i < m; i++) {
	edges[st][i] = 1;
	nbrs.get(st).add(i);
      }

      for (int j = 0; j < n; j++) {
	edges[m + j][gl] = 1;
	nbrs.get(m + j).add(gl);
      }

      int[] prevs = new int[vn];
      int[] dists = new int[vn];
      
      for (;;) {
	for (int i = 0; i < vn; i++) {
	  prevs[i] = -1;
	  dists[i] = INF;
	}
	dists[st] = 0;

	ArrayList<Integer> q = new ArrayList<Integer>();
	q.add(st);

	while (! q.isEmpty()) {
	  int u = q.remove(0);
	  if (u == gl) break;

	  for (int v: nbrs.get(u)) {
	    if (fs[u][v] == edges[u][v]) continue;
	    int vd = dists[u] + 1;
	    if (dists[v] > vd) {
	      dists[v] = vd;
	      prevs[v] = u;
	      q.add(v);
	    }
	  }
	}
	if (dists[gl] >= INF) break;
    
	ArrayList<Integer> path = new ArrayList<Integer>();
	int u = gl;
	while (prevs[u] >= 0) {
	  path.add(0, u);
	  u = prevs[u];
	}
    
	int min_c = INF;
	u = st;
	for (int v: path) {
	  int cf = edges[u][v] - fs[u][v];
	  if (min_c > cf) min_c = cf;
	  u = v;
	}

	u = st;
	for (int v: path) {
	  fs[u][v] += min_c;
	  fs[v][u] -= min_c;
	  u = v;
	}
      }

      int sum = 0;
      for (int i = 0; i < m; i++) sum += fs[st][i];
      System.out.println(sum);
    }
  }
}