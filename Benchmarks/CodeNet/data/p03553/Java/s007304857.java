import java.util.*;

public class Main {

  static class Edge {
    int t, rev, cap, f;

    public Edge(int t, int rev, int cap) {
      this.t = t;
      this.rev = rev;
      this.cap = cap;
    }
  }

  public static List<Edge>[] createGraph(int nodes) {
    List<Edge>[] graph = new List[nodes];
    for (int i = 0; i < nodes; i++)
      graph[i] = new ArrayList<>();
    return graph;
  }

  public static void addEdge(List<Edge>[] graph, int s, int t, int cap) {
    graph[s].add(new Edge(t, graph[t].size(), cap));
    graph[t].add(new Edge(s, graph[s].size() - 1, 0));
  }

  static boolean dinicBfs(List<Edge>[] graph, int src, int dest, int[] dist) {
    Arrays.fill(dist, -1);
    dist[src] = 0;
    int[] Q = new int[graph.length];
    int sizeQ = 0;
    Q[sizeQ++] = src;
    for (int i = 0; i < sizeQ; i++) {
      int u = Q[i];
      for (Edge e : graph[u]) {
        if (dist[e.t] < 0 && e.f < e.cap) {
          dist[e.t] = dist[u] + 1;
          Q[sizeQ++] = e.t;
        }
      }
    }
    return dist[dest] >= 0;
  }

  static int dinicDfs(List<Edge>[] graph, int[] ptr, int[] dist, int dest, int u, int f) {
    if (u == dest)
      return f;
    for (; ptr[u] < graph[u].size(); ++ptr[u]) {
      Edge e = graph[u].get(ptr[u]);
      if (dist[e.t] == dist[u] + 1 && e.f < e.cap) {
        int df = dinicDfs(graph, ptr, dist, dest, e.t, Math.min(f, e.cap - e.f));
        if (df > 0) {
          e.f += df;
          graph[e.t].get(e.rev).f -= df;
          return df;
        }
      }
    }
    return 0;
  }

  public static int maxFlow(List<Edge>[] graph, int src, int dest) {
    int flow = 0;
    int[] dist = new int[graph.length];
    while (dinicBfs(graph, src, dest, dist)) {
      int[] ptr = new int[graph.length];
      while (true) {
        int df = dinicDfs(graph, ptr, dist, dest, src, Integer.MAX_VALUE);
        if (df == 0)
          break;
        flow += df;
      }
    }
    return flow;
  }

  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long a[] = new long[N];
  long ans = 0;
  for(int i = 0; i < N; i++) {
    a[i] = sc.nextLong();
    if(a[i] > 0) ans += a[i];
  }
  List<Edge>[] G = new List[N + 2];
  for(int i = 0; i < N + 2; i++) {
    G[i] = new List<Edge>();
  }

  for(int i = 0; i < N; i++) {
      if(a[i] > 0) addEdge(G, i, N + 1, (int)a[i]);
      if(a[i] <= 0) addEdge(G, N, i, (-1) * (int)a[i]);
    }
  for(int i = 0; i < N; i++) {
    for(int j = 1; (i + 1) * j <= N; j++) {
      addEdge(G, i, (i + 1) * j - 1, (int)Math.pow(10, 13));
    }
  }

  System.out.println(ans - (long)maxFlow(G, N, N + 1));
}