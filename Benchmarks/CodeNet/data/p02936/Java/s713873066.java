import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    int[] count = new int[n + 1];
    Edge[] to = new Edge[n + 1];
    for (int i = 1; i <= n; i++) {
      to[i] = new Edge();
    }
    for (int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      to[a].add(b);
      to[b].add(a);
    }
    for (int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      count[p] += x;
    }
    propagateCount(1, count, to);
    pw.println(
      Arrays.stream(count, 1, n + 1)
        .mapToObj(c -> String.valueOf(c))
        .collect(Collectors.joining(" ")));
  }

  static void propagateCount(int nodeId, int[] count, Edge[] to) {
    boolean[] exclude = new boolean[count.length + 1];
    exclude[nodeId] = true;
    propagateCountRecursively(count[nodeId], nodeId, count, to, exclude);
  }

  static void propagateCountRecursively(int parentCount, int nodeId, int[] count, Edge[] to,
    boolean[] exclude) {
    for (int child : to[nodeId].edge) {
      if (exclude[child]) {
        continue;
      }
      exclude[child] = true;
      count[child] += parentCount;
      propagateCountRecursively(count[child], child, count, to, exclude);
    }
  }

  static class Edge {

    private List<Integer> edge = new ArrayList<>();

    void add(int node) {
      edge.add(node);
    }
  }
}
