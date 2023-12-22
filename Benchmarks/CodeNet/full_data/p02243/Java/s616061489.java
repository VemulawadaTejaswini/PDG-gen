// ALDS1_12_B, ALDS1_12_C: SSSP, nonnegative edges (Dijkstra's)

import java.util.*;

// Given: all nodes are reachable; source is node 0
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Map<Integer, Integer> cost = new HashMap<Integer, Integer>();
    cost.put(0, 0);

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
    for (int i = 0; i < n; ++i) {
      adj.add(new ArrayList<int[]>());
      sc.nextInt(); // skip id
      int n_nbrs = sc.nextInt();
      for (int j = 0; j < n_nbrs; ++j) {
        int destination = sc.nextInt();
        int edge_cost = sc.nextInt();
        adj.get(i).add(new int[] {i, destination, edge_cost});
      }
    }

    // populate priority queue with neighbors of the source node 0
    for (int[] e : adj.get(0)) {
      pq.add(new int[] {e[1], e[2]});
    }

    while (cost.size() < n) {
      int[] v = pq.remove(); // cheapest vertex
      if (!cost.containsKey(v[0])) {
        cost.put(v[0], v[1]);
        for (int[] e : adj.get(v[0])) {
          pq.add(new int[] {e[1], v[1] + e[2]});
        }
      }
    }

    for (int i = 0; i < n; ++i) {
      System.out.printf("%d %d\n", i, cost.get(i));
    }
  }
}
