import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node(i);
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacent.add(nodes[b]);
    }

    List<Node> minLoop = null;
    for (int i = 0; i < N; i++) {
      Node src = nodes[i];
      int[] prev = new int[N];
      Arrays.fill(prev, -1);
      Queue<Node> queue = new LinkedList<>();
      for (Node n : src.adjacent) {
        prev[n.id] = src.id;
        queue.add(n);
      }
      while (!queue.isEmpty()) {
        Node n = queue.poll();
        if (n.id == src.id) {
          List<Node> path = restorePath(n, nodes, prev);
          if (minLoop == null || minLoop.size() > path.size()) minLoop = path;
          break;
        }
        for (Node a : n.adjacent) {
          if (prev[a.id] < 0) {
            prev[a.id] = n.id;
            queue.add(a);
          }
        }
      }
    }
    if (minLoop == null) {
      System.out.println(-1);
    } else {
      System.out.println(minLoop.size());
      for (Node n : minLoop) System.out.println(n.id + 1);
    }
  }

  private static List<Node> restorePath(Node node, Node[] nodes, int[] prev) {
    List<Node> res = new ArrayList<>();
    int src = node.id;
    do {
      res.add(node);
      node = nodes[prev[node.id]];
    } while (node.id != src);
    return res;
  }

  private static class Node {
    private final int id;
    private final List<Node> adjacent = new ArrayList<>();

    private Node(int id) {
      this.id = id;
    }
  }
}
