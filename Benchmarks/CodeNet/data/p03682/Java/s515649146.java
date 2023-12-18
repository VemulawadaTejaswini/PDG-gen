import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) {
      nodes[i] = new Node(i, scanner.nextInt(), scanner.nextInt());
    }

    Arrays.sort(nodes, Comparator.comparingInt(o -> o.x));
    for (int i = 0; i < N - 1; i++) {
      Node a = nodes[i];
      Node b = nodes[i + 1];
      int d = b.x - a.x;
      a.edges.add(new Edge(a, b, d));
      b.edges.add(new Edge(b, a, d));
    }
    Arrays.sort(nodes, Comparator.comparingInt(o -> o.y));
    for (int i = 0; i < N - 1; i++) {
      Node a = nodes[i];
      Node b = nodes[i + 1];
      int d = b.y - a.y;
      a.edges.add(new Edge(a, b, d));
      b.edges.add(new Edge(b, a, d));
    }

    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.dist));
    Node a = nodes[0];
    queue.addAll(a.edges);
    a.visited = true;

    long d = 0;
    while (!queue.isEmpty()) {
      Edge e = queue.poll();

      if (!e.to.visited) {
        d += e.dist;
        e.to.visited = true;
        queue.addAll(e.to.edges);
      }
    }
    System.out.println(d);
  }

  private static class Node {
    final int id;
    final int x;
    final int y;
    final List<Edge> edges = new ArrayList<>();
    boolean visited;

    private Node(int id, int x, int y) {
      this.id = id;
      this.x = x;
      this.y = y;
    }
  }

  private static class Edge {
    final Node from;
    final Node to;
    final int dist;

    private Edge(Node from, Node to, int dist) {
      this.from = from;
      this.to = to;
      this.dist = dist;
    }
  }
}
