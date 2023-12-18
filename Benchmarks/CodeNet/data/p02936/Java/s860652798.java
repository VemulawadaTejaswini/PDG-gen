import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Q = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].neighbors.add(nodes[b]);
      nodes[b].neighbors.add(nodes[a]);
    }
    for (int i = 0; i < Q; i++) {
      int p = scanner.nextInt() - 1;
      int q = scanner.nextInt();
      nodes[p].offset += q;
    }
    dfs(null, nodes[0], 0);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(nodes[i].counter).append(' ');
    }
    System.out.println(sb.toString());
  }

  private static void dfs(Node parent, Node node, int sum) {
    sum += node.offset;
    node.counter = sum;
    for (Node a : node.neighbors) {
      if (a != parent) {
        dfs(node, a, sum);
      }
    }
  }

  private static class Node {
    private List<Node> neighbors = new ArrayList<>();
    private int offset;
    private int counter;
  }
}
