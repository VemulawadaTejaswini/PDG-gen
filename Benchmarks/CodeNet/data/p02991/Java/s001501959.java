import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    Node[] leapNodes = new Node[N];
    for (int i = 0; i < N; i++) {
      nodes[i] = new Node(i);
      leapNodes[i] = new Node(i);
    }
    int M = scanner.nextInt();
    for (int i = 0; i < M; i++) {
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      nodes[u].adjacents.add(nodes[v]);
    }
    int S = scanner.nextInt() - 1;
    int T = scanner.nextInt() - 1;

    for (int i = 0; i < N; i++) {
      final int n = i;
      dfs(nodes[i], 0, (node) -> leapNodes[n].adjacents.add(leapNodes[node.id]));
    }

    int shortest = bfs(N, leapNodes, S, T);
    System.out.println(shortest);
  }

  private static void dfs(Node node, int depth, Consumer<Node> visitor) {
    if (depth == 3) {
      visitor.accept(node);
      return;
    }
    for (Node a : node.adjacents) {
      dfs(a, depth + 1, visitor);
    }
  }

  private static int bfs(int N, Node[] nodes, int s, int t) {
    int[] dist = new int[N];
    boolean[] visited = new boolean[N];
    Arrays.fill(dist, -1);
    Queue<Node> queue = new LinkedList<>();
    queue.add(nodes[s]);
    dist[s] = 0;
    visited[s] = true;
    while (!queue.isEmpty()) {
      Node n = queue.poll();
      for (Node a : n.adjacents) {
        if (!visited[a.id]) {
          dist[a.id] = dist[n.id] + 1;
          visited[a.id] = true;
          queue.add(a);
        }
      }
    }
    return dist[t];
  }

  private static class Node {
    private final int id;
    List<Node> adjacents = new ArrayList<>();
    Node(int id) {
      this.id = id;
    }

    @Override public String toString() {
      return Integer.toString(id);
    }
  }
}
