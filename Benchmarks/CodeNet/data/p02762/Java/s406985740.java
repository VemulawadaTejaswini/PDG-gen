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
    for (Integer a : f.keySet()) {
      if (!l.containsKey(a)) l.put(a, new HashSet<>());

      Set<Integer> la = l.get(a);
      la.add(a);
      la.addAll(f.get(a));

      for (Integer li : la)
        l.put(li,  la);
    }

    int[] ans = new int[N + 1];
    for (int i = 1; i < N + 1; i++) {
      Integer a = Integer.valueOf(i);
      if (!l.containsKey(a)) continue;

      Set<Integer> ba = b.getOrDefault(a, Collections.emptySet());
      Set<Integer> fa = f.getOrDefault(a, Collections.emptySet());
      for (Integer li : l.get(a)) {
        if (a.equals(li)) continue;
        if (ba.contains(li)) continue;
        if (fa.contains(li)) continue;
        ans[i]++;
      }
    }

    StringBuilder buf = new StringBuilder();
    for (int i = 1; i < N + 1; i++)
      buf.append(ans[i]).append(" ");
    buf.setLength(buf.length() - 1);
    System.out.println(buf);
  }
}