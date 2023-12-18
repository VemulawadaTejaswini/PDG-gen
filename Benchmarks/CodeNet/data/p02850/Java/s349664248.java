import java.util.*;

public class Main {
  private static void solve(int n, int[][] edges) {
    int[] counters = new int[n + 1];
    Map<Integer, Set<Integer>> usedColors = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      usedColors.put(i, new HashSet<Integer>());
    }
    String[] colors = new String[n - 1];
    int max = 0;
    for (int i = 0; i < n - 1; i++) {
      int[] edge = edges[i];
      counters[edge[0]]++;
      counters[edge[1]]++;
      int color = 1;
      while (usedColors.get(edge[0]).contains(color) || usedColors.get(edge[1]).contains(color)) {
        color++;
      }
      usedColors.get(edge[0]).add(color);
      usedColors.get(edge[1]).add(color);
      colors[i] = String.valueOf(color);
      max = Math.max(max, usedColors.get(edge[0]).size());
      max = Math.max(max, usedColors.get(edge[1]).size());
    }
    System.out.println(max);
    System.out.println(String.join("\n", colors));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[][] edges = new int[n - 1][2];
    for (int i = 0; i < n - 1; i++) {
      String[] edge = sc.nextLine().split(" ");
      edges[i][0] = Integer.parseInt(edge[0]);
      edges[i][1] = Integer.parseInt(edge[1]);
    }
    sc.close();
    solve(n, edges);
  }
}
