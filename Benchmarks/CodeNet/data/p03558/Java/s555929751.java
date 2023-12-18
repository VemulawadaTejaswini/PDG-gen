import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int INF = 100_000;
    int K = scanner.nextInt();
    List<int[]>[] edges = new List[K];
    for (int i = 0; i < K; i++) {
      edges[i] = new ArrayList<>();
      edges[i].add(new int[] {(i + 1) % K, 1});
      if ((i * 10) % K != i) edges[i].add(new int[] {(i * 10) % K, 0});
    }

    int[] dist = new int[K];
    for (int i = 0; i < K; i++) dist[i] = INF;
    dist[1] = 0;

    PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparing(node -> node.dist));
    queue.add(new Node(1, 0));

    while (!queue.isEmpty()) {
      Node node = queue.remove();
      for(int[] e : edges[node.id]) {
        int i = e[0];
        int c = e[1];
        int newCost = dist[node.id] + c;
        if (dist[i] > newCost) {
          dist[i] = newCost;
          queue.remove(new Node(i, INF));
          queue.add(new Node(i, newCost));
        }
      }
    }

    System.out.println(dist[0] + 1);
  }

  static class Node {
    public final int id;
    public final int dist;

    Node(int id, int dist) {
      this.id = id;
      this.dist = dist;
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Node node = (Node) o;
      return id == node.id;
    }

    @Override public int hashCode() {
      return Objects.hash(id);
    }
  }
}
