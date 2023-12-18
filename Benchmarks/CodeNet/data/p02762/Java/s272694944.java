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
    @SuppressWarnings("unchecked")
    Set<Integer>[] g = new Set[N + 1];
    for (int i = 0; i < M; i++) {
      int a = A[i];
      int b = B[i];
      fc[a]++;
      fc[b]++;
      if (g[a] == null && g[b] == null) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        g[a] = set;
        g[b] = set;
      } else if (g[a] == null) {
        Set<Integer> set = g[b];
        set.add(a);
        g[a] = set;
      } else if (g[b] == null) {
        Set<Integer> set = g[a];
        set.add(b);
        g[b] = set;
      } else if (!g[a].equals(g[b])) {
        Set<Integer> setA = g[a];
        Set<Integer> setB = g[b];
        setA.addAll(g[b]);
        setB.addAll(g[a]);
        /*
        List<Integer> setL = g[a];
        List<Integer> setS = g[b];
        if (setL.size() < setS.size()) {
          List<Integer> temp = setL;
          setL = setS;
          setS = temp;
        }
        setL.addAll(setS);
        for (int s : setS) g[s] = setL;
        */

      }
    }

    int[] bc = new int[N + 1];
    for (int i = 0; i < K; i++) {
      int c = C[i];
      int d = D[i];
      if (g[c].equals(g[d])) {
        bc[c]++;
        bc[d]++;
      }
    }

    int[] ans = new int[N + 1];
    for (int i = 1; i < N + 1; i++)
      if (g[i] != null)
        ans[i] = g[i].size() - 1 - fc[i] - bc[i];

    StringBuilder buf = new StringBuilder();
    for (int i = 1; i < N + 1; i++)
      buf.append(ans[i]).append(' ');
    System.out.println(buf);
  }
}