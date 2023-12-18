import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Main {
  private static class Node {
    public long val = 0;
    public boolean checked = false;
    public List<Node> children = new ArrayList<>();
  }
  private static void solve(int n, int q, int[][] edges, int[][] operations) {
    Node[] nodes = new Node[n];
    for (int i = 0; i < n; i++) {
      nodes[i] = new Node();
    }
    for (int i = 0; i < n - 1; i++) {
      int edge1 = edges[i][0] - 1;
      int edge2 = edges[i][1] - 1;
      nodes[edge1].children.add(nodes[edge2]);
      nodes[edge2].children.add(nodes[edge1]);
    }
    for (int i = 0; i < q; i++) {
      int p = operations[i][0];
      int x = operations[i][1];
      nodes[p - 1].val += x;
    }
    Deque<Node> queue = new ArrayDeque<>();
    queue.offer(nodes[0]);
    nodes[0].checked = true;
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      for (Node child : node.children) {
        if (child.checked) continue;
        child.val += node.val;
        child.checked = true;
        queue.add(child);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i > 0) sb.append(" ");
      sb.append(nodes[i].val);
    }
    System.out.println(sb.toString());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int q = Integer.parseInt(nums[1]);
    int[][] edges = new int[n - 1][2];
    for (int i = 0; i < n - 1; i++) {
      String[] edge = sc.nextLine().split(" ");
      edges[i][0] = Integer.parseInt(edge[0]);
      edges[i][1] = Integer.parseInt(edge[1]);
    }
    int[][] operations = new int[q][2];
    for (int i = 0; i < q; i++) {
      String[] operation = sc.nextLine().split(" ");
      operations[i][0] = Integer.parseInt(operation[0]);
      operations[i][1] = Integer.parseInt(operation[1]);
    }
    sc.close();
    solve(n, q, edges, operations);
  }
}