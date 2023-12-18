import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    Node[] nodes = new Node[N * (N - 1) / 2];
    for (int i = 0; i < N * (N - 1) / 2; i++) nodes[i] = new Node();

    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt() - 1;
      for (int j = 1; j < N - 1; j++) {
        int b = scanner.nextInt() - 1;
        nodes[node(i, a, N)].adjs.add(nodes[node(i, b, N)]);
        a = b;
      }
    }

    try {
      int max = 0;
      for (int i = 0; i < N * (N - 1) / 2; i++) {
        max = Math.max(max, dfs(nodes[i]));
      }
      System.out.println(max);
    } catch (IllegalStateException e) {
      System.out.println(-1);
    }
  }

  private static int dfs(Node node) {
    if (node.maxPathLength > 0) return node.maxPathLength;
    if (node.visited) throw new IllegalStateException("loop");
    node.visited = true;
    int max = 0;
    for (Node a : node.adjs) {
      max = Math.max(max, dfs(a));
    }
    node.maxPathLength = max + 1;
    return node.maxPathLength;
  }

  private static int node(int i, int j, int N) {
    if (i > j) return node(j, i, N);
    int d = j - i;
    return (N - d) * (N - 1 - d) / 2 + i;
  }

  private static class Node {
    private final List<Node> adjs = new ArrayList<>();
    private int maxPathLength = -1;
    private boolean visited;
  }
}
