import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int u = scanner.nextInt() - 1;
    int v = scanner.nextInt() - 1;

    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacent.add(nodes[b]);
      nodes[b].adjacent.add(nodes[a]);
    }

    dfs1(nodes[v], null);
    dfs2(nodes[v], null);

    Node a = nodes[u];
    int l = 0;
    while (a != nodes[v]) {
      a = a.prev;
      l++;
    }
    int res = l - 1;
    a = nodes[u].prev;
    for (int i = 1; i <= (l - 1) / 2; i++) {
      res = Math.max(res, a.depth + l - i - 1);
      a = a.prev;
    }
    System.out.println(res);
  }

  private static void dfs1(Node node, Node parent) {
    node.depth = 0;
    for (Node a : node.adjacent) {
      if (a != parent) {
        dfs1(a, node);
        node.depth = Math.max(node.depth, a.depth + 1);
      }
    }
  }

  private static void dfs2(Node node, Node parent) {
    node.prev = parent;
    for (Node a : node.adjacent) {
      if (a != parent) dfs2(a, node);
    }
  }

  private static class Node {
    private final int id;
    private Node prev;
    private int depth = -1;

    public Node(int id) {
      this.id = id;
    }
    private final List<Node> adjacent = new ArrayList<>();
  }
}
