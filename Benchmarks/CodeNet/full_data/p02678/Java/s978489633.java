import java.util.*;

public class Main {

  static class Node {
    int n;
    int parent;
    List<Integer> neighbors;

    public Node(int n) {
      this.n = n;
      this.parent = 0;
      this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(int n) {
      this.neighbors.add(n);
    }
  }

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int m = scan.nextInt();

    Node[] nodes = new Node[n + 1];
    for (int i = 0; i < n; i++) {
      nodes[i + 1] = new Node(i + 1);
    }

    for (int i = 0; i < m; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();

      nodes[a].addNeighbor(b);
      nodes[b].addNeighbor(a);
    }

    Queue<Node> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();
    visited.add(1);
    queue.offer(nodes[1]);

    while (queue.size() > 0) {
      Node node = queue.poll();
      for (int neighbor: node.neighbors) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          nodes[neighbor].parent = node.n;
          queue.add(nodes[neighbor]);
        }
      }
    }

    StringBuffer ans = new StringBuffer();

    for (int i = 2; i <= n; i++) {
      if (nodes[i].parent == 0) {
        System.out.println("No");
        return;
      }

      ans.append(nodes[i].parent + "\n");
    }

    System.out.println(ans);
  }
}