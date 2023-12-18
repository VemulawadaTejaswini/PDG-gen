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
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      int z = scanner.nextInt();
      nodes[x].neighbors.add(nodes[y]);
      nodes[y].neighbors.add(nodes[x]);
    }

    int cost = 0;
    for (int i = 0; i < N; i++) {
      if (!nodes[i].visited) {
        dfs(nodes[i]);
        cost++;
      }
    }
    System.out.println(cost);
  }

  private static void dfs(Node node) {
    node.visited = true;
    for (Node n : node.neighbors) {
      if (!n.visited) dfs(n);
    }
  }

  private static class Node {
    List<Node> neighbors = new ArrayList<>();
    boolean visited;
  }
}
