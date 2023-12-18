import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();
    for (int i = 0; i < M; i++) {
      int l = scanner.nextInt() - 1;
      int r = scanner.nextInt() - 1;
      int d = scanner.nextInt();
      nodes[l].edges.add(new Edge(nodes[r], d));
      nodes[r].edges.add(new Edge(nodes[l], -d));
    }

    for (Node node : nodes) {
      if (!node.visited) {
        if (!dfs(node)) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }

  private static boolean dfs(Node node) {
    node.visited = true;
    for (Edge edge : node.edges) {
      Node a = edge.to;
      if (!a.visited) {
        a.pos = node.pos + edge.dist;
        if (!dfs(a)) return false;
      } else if (a.pos != node.pos + edge.dist) {
        return false;
      }
    }
    return true;
  }

  private static class Node {
    private int pos;
    private List<Edge> edges = new ArrayList<>();
    private boolean visited;
  }

  private static class Edge {
    private final Node to;
    private final int dist;

    private Edge(Node to, int dist) {
      this.to = to;
      this.dist = dist;
    }
  }
}
