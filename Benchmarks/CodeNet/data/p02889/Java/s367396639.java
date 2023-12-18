import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Edge {
    int fr;
    int to;
    int cost;
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();

    // key : from city, value : edge
    Map<Integer, Set<Edge>> map = new HashMap<>();

    // exclude the expensive edge (than L) in advance
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (c <= l) {
        Edge edge1 = new Edge();
        edge1.fr = a;
        edge1.to = b;
        edge1.cost = c;
        Set<Edge> edges1 = map.getOrDefault(edge1.fr, new HashSet<>());
        edges1.add(edge1);
        map.put(edge1.fr, edges1);

        Edge edge2 = new Edge();
        edge2.fr = b;
        edge2.to = a;
        edge2.cost = c;
        Set<Edge> edges2 = map.getOrDefault(edge2.fr, new HashSet<>());
        edges2.add(edge2);
        map.put(edge2.fr, edges2);
      }
    }

    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      int s = sc.nextInt();
      int t = sc.nextInt();
      List<Edge> dijkstra = dijkstra(s, t, map, n);
      if (dijkstra.isEmpty()) {
        os.println(-1);
      } else {
      os.println(count(dijkstra, l));
      }
    }
  }

  private static class Path {

    int cost;
    List<Edge> path = new ArrayList<>();

  }

  private static int count(List<Edge> edges, int l) {
    int remain = l;
    int ans = 0;
    for (Edge edge : edges) {
      if (remain < edge.cost) {
        remain = l;
        ans++;
      }
      remain -= edge.cost;
    }
    return ans;
  }

  private static List<Edge> dijkstra(int s, int t, Map<Integer, Set<Edge>> map, int n) {
    Path[] d = new Path[n + 1];
    for (int i = 1; i <= n; i++) {
      Path p = new Path();
      p.cost = Integer.MAX_VALUE;
      d[i] = p;
    }
    Path p = d[s];
    p.cost = 0;

    SortedSet<Integer> queue = new TreeSet<>(Comparator.comparingInt(i -> d[i].cost));

    for(int i = 1; i <= n; i++) {
      queue.add(i);
    }

    while(!queue.isEmpty()) {
      Integer fr = queue.first();
      queue.remove(fr);
      for (Edge edge : map.getOrDefault(fr, new HashSet<>())) {
        int alt = d[fr].cost + edge.cost;
        if (alt < d[edge.to].cost) {
          p = new Path();
          p.cost = alt;
          p.path = new ArrayList<>(d[fr].path);
          p.path.add(edge);
          d[edge.to] = p;
          queue.remove(edge.to);
          queue.add(edge.to);
        }
      }
    }
    return d[t].path;
  }


//  private static int dijkstra(int s, int t, Map<Integer, Set<Edge>> map, int n) {
//    int[] d = new int[n + 1];
//    for (int i = 1; i <= n; i++) d[i] = Integer.MAX_VALUE;
//    d[s] = 0;
//
//    SortedSet<Integer> queue = new TreeSet<>(Comparator.comparingInt(i -> d[i]));
//
//    for(int i = 1; i <= n; i++) {
//      queue.add(i);
//    }
//
//    while(!queue.isEmpty()) {
//      Integer fr = queue.first();
//      queue.remove(fr);
//      for (Edge edge : map.getOrDefault(fr, new HashSet<>())) {
//        int alt = d[fr] + edge.cost;
//        if (alt < d[edge.to]) {
//          d[edge.to] = alt;
//          queue.add(edge.to);
//        }
//      }
//    }
//    return d[t];
//  }
}