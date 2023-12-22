import java.util.*;

public class Main {
  // constant

  static final double INF = Double.POSITIVE_INFINITY;

  static int MAX_N = 8;
  static int MAX_M = 30;

  // global variables

  static double[][] times;

  // inner classes

  static class Node implements Comparable<Node> {
    int i, b;

    Node(int i, int b) {
      this.i = i;
      this.b = b;
    }

    public boolean equals(Node nd) {
      return (i == nd.i && b == nd.b);
    }

    public int compareTo(Node nd) {
      double d = times[i][b] - times[nd.i][nd.b];
      return ((d < 0.0) ? -1 : (d > 0.0) ? 1 : 0);
    }
  }

  // main

  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int pn = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      if ((n | m | pn | a | b) == 0) break;

      a--;
      b--;

      int[] tickets = new int[n];
      for (int i = 0; i < n; i++) tickets[i] = sc.nextInt();

      double[][] edges = new double[m][m];
      for (int i = 0; i < m; i++)
	for (int j = 0; j < m; j++) edges[i][j] = 0.0;

      ArrayList<ArrayList<Integer>> nbrs = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < m; i++) nbrs.add(new ArrayList<Integer>());

      for (int i = 0; i < pn; i++) {
	int xi = sc.nextInt() - 1;
	int yi = sc.nextInt() - 1;
	double zi = sc.nextDouble();

	edges[xi][yi] = edges[yi][xi] = zi;
	nbrs.get(xi).add(yi);
	nbrs.get(yi).add(xi);
      }

      int nbits = (1 << n) - 1;

      times = new double[m][nbits + 1];
      for (int i = 0; i < m; i++) Arrays.fill(times[i], INF);

      times[a][nbits] = 0.0;

      PriorityQueue<Node> q = new PriorityQueue<Node>();
      q.add(new Node(a, nbits));

      double min_t = INF;

      while (! q.isEmpty()) {
	Node u = q.poll();

	int ui = u.i;
	int ubits = u.b;

	if (ui == b) {
	  if (min_t > times[ui][ubits]) min_t = times[ui][ubits];
	  continue;
	}

	double ut = times[ui][ubits];

	for (int vi: nbrs.get(ui)) {
	  for (int ti = 0; ti < n; ti++) {
	    int bti = 1 << ti;
	    if ((ubits & bti) == 0) continue;

	    int vbits = ubits & ~bti;
	    double nvt = ut + edges[ui][vi] / tickets[ti];
	    double vt = times[vi][vbits];

	    Node v = new Node(vi, vbits);

	    if (vt > nvt) {
	      if (vt < INF) q.remove(v);
	      times[vi][vbits] = nvt;
	      q.add(v);
	    }
	  }
	}
      }

      if (min_t >= INF)
	System.out.println("Impossible");
      else
	System.out.printf("%.3f\n", min_t);
    }
  }
}