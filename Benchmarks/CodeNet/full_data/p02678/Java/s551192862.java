import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());

    Edges edgesArray[] = new Edges[n + 1];
    Queue<Node> bfsQueue = new LinkedList<>();
    Map<Integer, Node> nodeMap = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      nodeMap.put(i, new Node(i));
      edgesArray[i] = new Edges(i);
    }
    for (int i = 0; i < m; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      Edge edge = new Edge(a, b);
      Edge inv = new Edge(b, a);
      edgesArray[edge.from].add(edge);
      edgesArray[inv.from].add(inv);
    }
    bfsQueue.add(nodeMap.get(1));
    while (!bfsQueue.isEmpty()) {
      Node node = bfsQueue.poll();
      Edges edges = edgesArray[node.n];
      for (Edge edge : edges.edges) {
        Node to = nodeMap.get(edge.to);
        if (to.next > 0) {
          continue; // already visited
        }
        to.next = node.n;
        bfsQueue.add(to);
      }
    }
    nodeMap.remove(1);
    if (nodeMap.values().stream().mapToInt(node -> node.next).allMatch(i -> i > 0)) {
      pw.println("Yes");
      for (int i = 2; i <= n; i++) {
        pw.println(nodeMap.get(i).next);
      }
    } else {
      pw.println("No");
    }
  }

  static class Node {

    int n;
    int next = -1;

    public Node(int n) {
      this.n = n;
    }
  }

  static class Edges {

    int from;
    private List<Edge> edges = new ArrayList<>();

    public Edges(int from) {
      this.from = from;
    }

    private void add(Edge edge) {
      edges.add(edge);
    }
  }

  static class Edge {

    int from;
    int to;

    private Edge(int from, int to) {
      this.from = from;
      this.to = to;
    }
  }
}
