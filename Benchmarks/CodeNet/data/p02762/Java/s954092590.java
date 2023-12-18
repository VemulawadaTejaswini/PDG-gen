import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    int[] C = new int[K];
    int[] D = new int[K];
    for (int i = 0; i < K; i++) {
      C[i] = sc.nextInt();
      D[i] = sc.nextInt();
    }
    sc.close();

    Map<Integer, Set<Integer>> f = new HashMap<>();
    for (int i = 0; i < M; i++) {
      Integer a = Integer.valueOf(A[i]);
      Integer b = Integer.valueOf(B[i]);
      if (!f.containsKey(a)) f.put(a, new HashSet<>());
      f.get(a).add(b);
      if (!f.containsKey(b)) f.put(b, new HashSet<>());
      f.get(b).add(a);
    }

    Map<Integer, Set<Integer>> b = new HashMap<>();
    for (int i = 0; i < K; i++) {
      Integer c = Integer.valueOf(C[i]);
      Integer d = Integer.valueOf(D[i]);
      if (!b.containsKey(c)) b.put(c, new HashSet<>());
      b.get(c).add(d);
      if (!b.containsKey(d)) b.put(d, new HashSet<>());
      b.get(d).add(c);
    }

    Map<Integer, Set<Integer>> l = new HashMap<>();
    for (int i = 1; i < N + 1; i++) {
      Integer a = Integer.valueOf(i);
      if (l.containsKey(a)) continue;

      l.put(a, new HashSet<>());
      Set<Integer> la = l.get(a);

      Deque<Set<Integer>> q = new ArrayDeque<>();
      q.addLast(f.get(a));
      while (!q.isEmpty()) {
        Set<Integer> fa = q.pollLast();
        if (la.addAll(fa))
          for (Integer fab : fa)
            q.addLast(f.get(fab));
      }
    }

    int[] ans = new int[N + 1];
    for (int i = 1; i < N + 1; i++) {
      Integer a = Integer.valueOf(i);
      Set<Integer> la = new HashSet<>(l.get(a));
      la.remove(a);
      la.removeAll(b.getOrDefault(a, Collections.emptySet()));
      la.removeAll(f.getOrDefault(a, Collections.emptySet()));
      ans[i] = la.size();
    }

    StringBuilder buf = new StringBuilder();
    for (int i = 1; i < N + 1; i++)
      buf.append(ans[i]).append(" ");
    buf.setLength(buf.length() - 1);
    System.out.println(buf);
  }
}