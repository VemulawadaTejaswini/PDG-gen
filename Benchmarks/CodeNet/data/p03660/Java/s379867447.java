import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].edges.add(nodes[b]);
      nodes[b].edges.add(nodes[a]);
    }

    List<Node> path = dfs(N, null, nodes[0]);
    Collections.reverse(path);
    Node endBlack = path.get((path.size() - 1) / 2);
    Node endWhite = path.get((path.size() - 1) / 2 + 1);

    int countBlack = dfs2(null, nodes[0], endWhite);
    int countWhite = dfs2(null, nodes[N - 1], endBlack);

    if (countBlack > countWhite) {
      System.out.println("Fennec");
    } else {
      System.out.println("Snuke");
    }
  }

  private static List<Node> dfs(int N, Node from, Node node) {
    if (node.id == N - 1) {
      List<Node> path = new ArrayList<>();
      path.add(node);
      return path;
    }
    for (Node e : node.edges) {
      if (e != from) {
        List<Node> found = dfs(N, node, e);
        if (found != null) {
          found.add(node);
          return found;
        }
      }
    }
    return null;
  }

  private static int dfs2(Node from, Node node, Node end) {
    int count = 1;
    for (Node e : node.edges) {
      if (e != from && e != end) count += dfs2(node, e, end);
    }
    return count;
  }

  static class Node {
    final int id;
    List<Node> edges = new ArrayList<>();

    Node(int id) {
      this.id = id;
    }
  }
}
