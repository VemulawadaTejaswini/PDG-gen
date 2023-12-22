import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int m = scan.nextInt();
    int[] H = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      H[i] = scan.nextInt();
    }

    Map<Integer, List<Integer>> graph = new HashMap<>();

    for (int i = 0; i < m; i++) {
      int d1 = scan.nextInt();
      int d2 = scan.nextInt();
      add(graph, d1, d2);
      add(graph, d2, d1);
    }

    int numGood = 0;
    for (int node = 1; node <= n; node++) {
      boolean good = true;
      if (graph.containsKey(node)) {
        for (int neighbor: graph.get(node)) {
          if (H[neighbor] >= H[node]) {
            good = false;
            break;
          }
        }
      }

      if (good) {
        numGood++;
        // System.out.println(node);
      }
    }

    // System.out.println(graph.get(1));
    System.out.println(numGood);
  }

  private static void add(Map<Integer, List<Integer>> graph, int d1, int d2) {
    if (graph.containsKey(d1)) {
      graph.get(d1).add(d2);
    }
    else {
      List<Integer> newList = new ArrayList<>();
      newList.add(d2);
      graph.put(d1, newList);
      // System.out.println("herte" + d1 + " " + d2 + " " + graph.get(d1));
    }

  }
}