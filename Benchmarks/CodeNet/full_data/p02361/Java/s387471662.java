// GRL_1_A: SSSP, nonnegative edges (Dijkstra's)

import java.util.*;

public class SSSP_1a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int source = sc.nextInt();

    Map<Integer, Integer> cost = new HashMap<Integer, Integer>();
    cost.put(source, 0);

    // representing vertices as int[] with values {id, tentative cost}
    PriorityQueue<int[]> pq =
        new PriorityQueue<int[]>(
            new Comparator<int[]>() {
              public int compare(int[] v1, int[] v2) {
                return Integer.compare(v1[1], v2[1]);
              }
            });

    // populate adjacency list
    // adj[i] = list of all edges from node i
    ArrayList<ArrayList<int[]>> adj = new ArrayList<ArrayList<int[]>>();
    for (int i = 0; i < n; ++i) adj.add(new ArrayList<int[]>());
    for (int i = 0; i < m; ++i) {
      int src = sc.nextInt();
      int dst = sc.nextInt();
      int edgeCost = sc.nextInt();
      adj.get(src).add(new int[] {dst, edgeCost});
    }

    // populate priority queue with neighbors of the source node 0
    for (int[] e : adj.get(source)) {
      pq.add(new int[] {e[0], e[1]});
    }

    while (!pq.isEmpty() && cost.size() < n) {
      int[] v = pq.remove(); // cheapest vertex
      if (!cost.containsKey(v[0])) {
        cost.put(v[0], v[1]);
        for (int[] e : adj.get(v[0])) {
          pq.add(new int[] {e[0], v[1] + e[1]});
        }
      }
    }

    for (int i = 0; i < n; ++i) {
      if (cost.containsKey(i)) {
        System.out.println(cost.get(i));
      } else {
        System.out.println("INF");
      }
    }
  }
}
