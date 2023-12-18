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


    int[] fc = new int[N + 1];
    Map<Integer, Set<Integer>> g = new HashMap<>();
    for (int i = 0; i < M; i++) {
      Integer a = Integer.valueOf(A[i]);
      Integer b = Integer.valueOf(B[i]);
      if (!g.containsKey(a) && !g.containsKey(b)) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        g.put(a, set);
        g.put(b, set);
      } else if (!g.containsKey(a)) {
        Set<Integer> set = g.get(b);
        set.add(a);
        g.put(a, set);
      } else if (!g.containsKey(b)) {
        Set<Integer> set = g.get(a);
        set.add(b);
        g.put(b, set);
      } else {
        Set<Integer> set = new HashSet<>();
        set.addAll(g.get(a));
        set.addAll(g.get(b));
        for (Integer c : set)
          g.put(c, set);
      }
      fc[a]++;
      fc[b]++;
    }

    int[] bc = new int[N + 1];
    for (int i = 0; i < K; i++) {
      Integer c = Integer.valueOf(C[i]);
      Integer d = Integer.valueOf(D[i]);
      if (g.get(c) == g.get(d)) {
        bc[c]++;
        bc[d]++;
      }
    }

    int[] ans = new int[N + 1];
    for (int i = 1; i < N + 1; i++)
      if (g.get(i) != null)
        ans[i] = g.get(i).size() - 1 - fc[i] - bc[i];

    for (int i = 1; i < N + 1; i++)
      System.out.print(ans[i] + " ");
    System.out.println();
  }
}