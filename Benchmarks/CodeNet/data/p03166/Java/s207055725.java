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
      ans = Math.max(ans, count(memo, edge, xi));

    System.out.println(ans);
  }

  private static int count(int[] memo, Map<Integer, Set<Integer>> edge, int xi) {
    if (memo[xi] != -1) return memo[xi];

    Deque<int[]> q = new ArrayDeque<>();
    q.addLast(new int[] {xi, 0});

    while (!q.isEmpty()) {
      int[] d = q.pollLast();
/*
      if (d[1] < memo[d[0]]) {
        memo[xi] = Math.max(memo[xi], memo[d[0]] + 1);
        continue;
      }
*/
      Set<Integer> dest = edge.get(d[0]);
      if (dest == null) {
        memo[xi] = Math.max(memo[xi], d[1]);
        continue;
      }

      for (int yi : dest)
        q.addLast(new int[] {yi, d[1] + 1});
    }
    return memo[xi];
  }
}