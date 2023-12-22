import java.util.*;

public class Main {
  // constant
  static final double INF = Double.POSITIVE_INFINITY;
  static final int MAX_V = 30;

  // global variables
  static double[][][] times;

  // inner classes
  static class Node implements Comparable<Node> {
    int n, f, v;

    Node(int n, int f, int v) {
      this.n = n;
      this.f = f;
      this.v = v;
    }

    public boolean equals(Node nd) {
      return (n == nd.n && f == nd.f && v == nd.v);
    }

    public int compareTo(Node nd) {
      double t = times[n][f][v] - times[nd.n][nd.f][nd.v];
      return ((t < 0.0) ? -1 : (t > 0.0) ? 1 : 0);
    }
  }

  static class Edge {
    double d;
    int c;
    
    Edge(double d, int c) {
      this.d = d;
      this.c = c;
    }
  }
  
  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      if ((n | m) == 0) break;

      int st = sc.nextInt() - 1;
      int gl = sc.nextInt() - 1;

      Edge[][] edges = new Edge[n][n];

      ArrayList<ArrayList<Integer>> nbrs = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < n; i++) nbrs.add(new ArrayList<Integer>());

      for (int i = 0; i < m; i++) {
	int xi = sc.nextInt() - 1;
	int yi = sc.nextInt() - 1;
	double di = sc.nextDouble();
	int ci = sc.nextInt();

	edges[xi][yi] = edges[yi][xi] = new Edge(di, ci);
	nbrs.get(xi).add(yi);
	nbrs.get(yi).add(xi);
      }

      times = new double[n][n][MAX_V + 1];
      for (int i = 0; i < n; i++)
	for (int j = 0; j < n; j++)
	  for (int k = 0; k <= MAX_V; k++)
	    times[i][j][k] = INF;
      times[st][st][0] = 0.0;

      PriorityQueue<Node> q = new PriorityQueue<Node>();
      q.add(new Node(st, st, 0));

      double min_t = INF;
  
      while (! q.isEmpty()) {
	Node u = q.poll();

	int un = u.n;
	int uf = u.f;
	int uv = u.v;
	double ut = times[un][uf][uv];

	if (un == gl && uv == 1) {
	  if (min_t > ut) min_t = ut;
	  continue;
	}

	for (int vn: nbrs.get(un)) {
	  if (vn == uf) continue;

	  Edge ve = edges[un][vn];
	  double vd = ve.d;
	  int vc = ve.c;
	  if (uv - 1 > vc) continue;
      
	  for (int vv = uv - 1; vv <= uv + 1; vv++) {
	    if (vv <= 0 || vv > vc) continue;

	    double nvt = ut + vd / vv;
	    double vt = times[vn][un][vv];

	    if (vt > nvt) {
	      Node v = new Node(vn, un, vv);
	      if (vt < INF) q.remove(v);
	      times[vn][un][vv] = nvt;
	      q.add(v);
	    }
	  }
	}
      }

      if (min_t >= INF)
	System.out.println("unreachable");
      else
	System.out.printf("%.5f\n", min_t);
    }
  }
}