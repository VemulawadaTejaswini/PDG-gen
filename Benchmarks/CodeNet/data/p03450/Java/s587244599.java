import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();
    int M = scanner.nextInt();
    for (int i = 0; i < M; i++) {
      int l = scanner.nextInt() - 1;
      int r = scanner.nextInt() - 1;
      int d = scanner.nextInt();
      nodes[l].adjacent.add(new Edge(nodes[r], d));
      nodes[r].adjacent.add(new Edge(nodes[l], -d));
    }

    for (int i = 0; i < N; i++) {
      if (!nodes[i].visited) {
        nodes[i].pos = 0;
        if (dfs(nodes[i])) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }

  private static boolean dfs(Node node) {
    node.visited = true;
    for (Edge a : node.adjacent) {
      if (!a.to.visited) {
        a.to.pos = node.pos + a.dist;
        if (dfs(a.to)) {
          return true;
        }
      } else if (a.to.pos != node.pos + a.dist) {
        return true;
      }
    }
    return false;
  }

  private static class Node {
    private final List<Edge> adjacent = new ArrayList<>();
    private int pos;
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
