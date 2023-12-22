import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

  private static int INF = 1000000000;

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final var N = scanner.nextInt();
    final var M = scanner.nextInt();
    final Map<Integer, Set<Integer>> graph = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      graph.put(i, new HashSet<>());
    }

    for (int i = 0; i < M; i++) {
      final var to = scanner.nextInt();
      final var from = scanner.nextInt();

      graph.get(to)
          .add(from);
      graph.get(from)
          .add(to);
    }

    final var route = dijkstra(N, graph);
    for (int i = 2; i <= N; i++) {
      if (route[i] == 0) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
    for (int i = 2; i <= N; i++) {
      System.out.println(route[i]);
    }
  }

  static int[] dijkstra(final int N, final Map<Integer, Set<Integer>> graph) {
    final int[] distance = new int[N + 1];
    for (int i = 2; i <= N; i++) {
      distance[i] = INF;
    }
    distance[1] = 0;

    final Queue<Pair> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.d));
    q.add(new Pair(1, 0));
    final var route = new int[N + 1];

    while (!q.isEmpty()) {
      final Pair point = q.poll();
      final var v = point.p;

      if (distance[v] < point.d) {
        continue;
      }

      for (final int i : graph.get(v)) {
        if (distance[i] > distance[v] + 1) {
          distance[i] = distance[v] + 1;
          q.add(new Pair(i, distance[i]));
          route[i] = v;
        }
      }
    }

    return route;
  }

  private static class Pair {

    public final int p;
    public final int d;

    public Pair(final int p, final int d) {
      this.p = p;
      this.d = d;
    }
  }
}
