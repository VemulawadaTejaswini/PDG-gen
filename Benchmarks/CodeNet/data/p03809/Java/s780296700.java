import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int N;
  static int[] A;
  static Node[] nodes;

  public static void main(String[] args) {
    N = sc.nextInt();
    A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    if (N == 2) {
      System.out.println(A[0] == A[1] ? "YES" : "NO");
      return;
    }
    nodes = new Node[N];
    for (int i = 0; i < N; i++) {
      nodes[i] = new Node(i);
    }
    for (int i = 0; i < N - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      nodes[a].next.add(nodes[b]);
      nodes[b].next.add(nodes[a]);
    }
    int root = 0;
    for (int i = 0; i < N; i++) {
      if (nodes[i].next.size() > 1) {
        root = i;
        break;
      }
    }
    int[] order = new int[N];
    order[0] = root;
    int pos = 1;
    for (int i = 0; i < N; i++) {
      Node cur = nodes[order[i]];
      for (Node c : cur.next) {
        if (c.idx == cur.parent) continue;
        c.parent = cur.idx;
        order[pos++] = c.idx;
      }
    }
    boolean ok = true;
    for (int i = N - 1; i >= 0; i--) {
      long sum = 0;
      long max = 0;
      Node n = nodes[order[i]];
      boolean hasChild = false;
      for (Node c : n.next) {
        if (c.idx == n.parent) continue;
        sum += c.v;
        max = Math.max(max, c.v);
        hasChild = true;
      }
      if (!hasChild) continue;
      if (sum < A[n.idx]) {
        ok = false;
        break;
      }
      long dec = sum - A[n.idx];
//      System.out.println(order[i] + " " + sum + " " + max + " " + dec);
      if (max > sum - max) {
        long c = max - (sum - max);
        if (c < dec) {
          ok = false;
          break;
        }
      }
      n.v = sum - dec * 2;
      if (n.v < 0) {
        ok = false;
        break;
      }

    }
    System.out.println(ok && nodes[root].v == 0 ? "YES" : "NO");
  }


  static class Node {
    int idx;
    long v;
    int parent = -1;
    ArrayList<Node> next = new ArrayList<>();

    public Node(int idx) {
      this.idx = idx;
      this.v = A[idx];
    }
  }
}
