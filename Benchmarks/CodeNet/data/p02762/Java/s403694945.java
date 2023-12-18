import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int K = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacent.add(nodes[b]);
      nodes[b].adjacent.add(nodes[a]);
    }
    int[][] block = new int[K][2];
    for (int i = 0; i < K; i++) {
      block[i][0] = scanner.nextInt() - 1;
      block[i][1] = scanner.nextInt() - 1;
    }
 
    int[] group = new int[N];
    Arrays.fill(group, -1);
    int gid = 0;
    for (int i = 0; i < N; i++) {
      if (group[i] < 0) {
        dfs(nodes[i], group, gid);
        gid++;
      }
    }
    int[] gsize = new int[gid];
    for (int i = 0; i < N; i++) {
      gsize[group[i]]++;
    }
    int[] res = new int[N];
    for (int i = 0; i < N; i++) {
      res[i] = gsize[group[i]] - nodes[i].adjacent.size() - 1;
    }
    for (int i = 0; i < K; i++) {
      int c = block[i][0];
      int d = block[i][1];
      if (group[c] == group[d]) {
        res[c]--;
        res[d]--;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(res[i]).append(' ');
    }
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }
 
  private static void dfs(Node node, int[] group, int gid) {
    group[node.id] = gid;
    for (Node n : node.adjacent) {
      if (group[n.id] < 0) dfs(n, group, gid);
    }
  }
 
  private static class Node {
    private final int id;
    private final List<Node> adjacent = new ArrayList<>();
 
    private Node(int id) {
      this.id = id;
    }
  }
}