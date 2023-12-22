import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(N, scanner.nextInt());
    for (int i = 0; i < N - 1; i++) {
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      nodes[u].adjacent.add(nodes[v]);
      nodes[v].adjacent.add(nodes[u]);
    }
    dfs(N, nodes[0], null, 0);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      int j = upperBound(nodes[i].lis, N + 1);
      sb.append(j + 1).append('\n');
    }
    System.out.print(sb.toString());
  }

  private static void dfs(int N, Node node, Node from, int depth) {
    if (from != null) {
      System.arraycopy(from.lis, 0, node.lis, 0, N);
    }
    int i = upperBound(node.lis, node.a);
    node.lis[i + 1] = Math.min(node.lis[i + 1], node.a);
    for (Node a : node.adjacent) {
      if (a != from) {
        dfs(N, a, node, depth + 1);
      }
    }
  }

  private static class Node {
    private final List<Node> adjacent = new ArrayList<>();
    private final int[] lis;
    private final int a;

    public Node(int N, int a) {
      lis = new int[N];
      Arrays.fill(lis, N + 1);
      this.a = a;
    }
  }

  public static int upperBound(int[] a, int k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a[mid] < k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
