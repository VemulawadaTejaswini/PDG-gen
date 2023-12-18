import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  private static List<List<Integer>> friend = new ArrayList<>();
  private static List<List<Integer>> block = new ArrayList<>();
  private static List<List<Integer>> connectedGraph = new ArrayList<>();
  private static int[] graphID;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();
    graphID = new int[n];
    Arrays.fill(graphID, -1);
    for (int i = 0; i < n; i++) {
      friend.add(new ArrayList<>());
      block.add(new ArrayList<>());
    }
    for (int i = 0; i < m; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      friend.get(a - 1)
          .add(b - 1);
      friend.get(b - 1)
          .add(a - 1);
    }
    for (int i = 0; i < k; i++) {
      int c = scanner.nextInt();
      int d = scanner.nextInt();
      block.get(c - 1)
          .add(d - 1);
      block.get(d - 1)
          .add(c - 1);
    }

    for (int i = 0; i < n; i++) {
      if (graphID[i] == -1) {
        connectedGraph.add(new ArrayList<>());
        constructConnectedGraph(i);
      }
    }

    for (int i = 0; i < n; i++) {
      final int finalI = i;
      System.out.print(connectedGraph.get(graphID[i])
          .size() - connectedGraph.get(graphID[i])
          .stream()
          .filter(e -> friend.get(finalI)
              .contains(e) || block.get(finalI)
              .contains(e))
          .count()
          - 1 + " ");
    }
  }

  private static void constructConnectedGraph(final int p) {
    connectedGraph.get(connectedGraph.size() - 1)
        .add(p);
    graphID[p] = connectedGraph.size() - 1;
    for (int i : friend.get(p)) {
      if (graphID[i] == -1) {
        constructConnectedGraph(i);
      }
    }
  }
}


