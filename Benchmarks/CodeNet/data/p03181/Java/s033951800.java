import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);

    for (int i = 0; i < N - 1; i++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      nodes[x].adjacent.add(nodes[y]);
      nodes[y].adjacent.add(nodes[x]);
    }

    long[] dp = new long[N];
    dfs1(nodes[0], dp, M);
    for (int i = 0; i < N; i++) nodes[i].visited = false;
    dfs2(nodes[0], null, dp, M);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) sb.append(dp[i]).append('\n');
    System.out.println(sb.toString());
  }

  private static void dfs2(Node node, Node parent, long[] dp, long M) {
    node.visited = true;
    if (parent != null) {
      long d = dp[parent.id] / (dp[node.id] + 1);
      d %= M;
      d += 1;
      if (d > M) d -= M;
      d *= dp[node.id];
      d %= M;
      dp[node.id] = d;
    }
    for (Node a : node.adjacent) {
      if (!a.visited) dfs2(a, node, dp, M);
    }
  }

  private static void dfs1(Node node, long[] dp, long M) {
    node.visited = true;
    dp[node.id] = 1;
    for (Node a : node.adjacent) {
      if (!a.visited) {
        dfs1(a, dp, M);
        dp[node.id] *= (dp[a.id] + 1) % M;
        dp[node.id] %= M;
      }
    }
  }

  private static class Node {
    public final int id;
    public boolean visited;
    public List<Node> adjacent = new ArrayList<>();

    private Node(int id) {
      this.id = id;
    }
  }
}
