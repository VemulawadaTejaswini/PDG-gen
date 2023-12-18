import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();

    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      nodes[a].edges.add(new Edge(nodes[b], c));
      nodes[b].edges.add(new Edge(nodes[a], c));
    }

    int Q = scanner.nextInt();
    int K = scanner.nextInt() - 1;
    dfs(nodes[K], null, 0);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      sb.append(nodes[x].depth + nodes[y].depth).append('\n');
    }
    System.out.print(sb.toString());
  }

  private static void dfs(Node node, Node from, long depth) {
    node.depth = depth;
    for (Edge e : node.edges) {
      if (e.to != from) dfs(e.to, node, node.depth + e.d);
    }
  }

  private static class Node {
    private List<Edge> edges = new ArrayList<>();
    private long depth = -1;
  }

  private static class Edge {
    private final Node to;
    private final int d;

    private Edge(Node to, int d) {
      this.to = to;
      this.d = d;
    }
  }
}
