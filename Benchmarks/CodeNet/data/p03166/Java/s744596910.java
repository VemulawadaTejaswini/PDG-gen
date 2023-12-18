import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] x = new int[M];
    int[] y = new int[M];
    for (int i = 0; i < M; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    sc.close();

    Map<Integer, Set<Integer>> edge = new HashMap<>();
    for (int i = 0; i < M; i++) {
      Integer key = Integer.valueOf(x[i]);
      if (!edge.containsKey(key)) {
        edge.put(key, new HashSet<>());
      }
      edge.get(key).add(y[i]);
    }

    int[] memo = new int[N + 1];
    Arrays.fill(memo, -1);

    int ans = 0;
    for (int xi = 1; xi < N + 1; xi++)
      ans = Math.max(ans, count(edge, memo, xi));

    System.out.println(ans);
  }

  private static int count(Map<Integer, Set<Integer>> edge, int[] memo, int xi) {
//    if (memo[xi] != -1) return memo[xi];
    int count = 0;
    Set<Integer> dest = edge.get(xi);
    if (dest != null)
      for (int yi : dest)
        count = Math.max(count, (memo[yi] != -1 ? memo[yi] : count(edge, memo, yi)) + 1);
    memo[xi] = count;
    return count;
  }
}