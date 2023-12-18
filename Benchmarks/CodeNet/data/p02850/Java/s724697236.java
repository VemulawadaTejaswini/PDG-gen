import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();
    Edge[] edges = new Edge[N - 1];
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      Edge e = new Edge(a ^ b);
      edges[i] = e;
      nodes[a].edges.add(e);
      nodes[b].edges.add(e);
    }
    int K = dfs(nodes, 0, -1, 0);
    System.out.println(K);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N - 1; i++) sb.append(edges[i].color).append('\n');
    System.out.print(sb.toString());
  }

  private static int dfs(Node[] nodes, int node, int from, int color) {
    int c = 1;
    int max = color;
    for (Edge e : nodes[node].edges) {
      if ((e.x ^ node) != from) {
        if (c == color) c++;
        e.color = c;
        max = Math.max(max, dfs(nodes, (e.x ^ node), node, c));
        c++;
      }
    }
    return max;
  }

  private static class Node {
    private final List<Edge> edges = new ArrayList<>();
  }

  private static class Edge {
    private final int x;
    private int color = -1;

    private Edge(int x) {
      this.x = x;
    }
  }
}
