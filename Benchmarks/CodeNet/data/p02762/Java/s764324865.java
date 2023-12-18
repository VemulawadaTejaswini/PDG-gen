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
    List<Integer>[] g = new List[N + 1];
    for (int i = 0; i < M; i++) {
      int a = A[i];
      int b = B[i];
      fc[a]++;
      fc[b]++;
      if (g[a] == null && g[b] == null) {
        List<Integer> set = new ArrayList<>();
        set.add(a);
        set.add(b);
        g[a] = set;
        g[b] = set;
      } else if (g[a] == null) {
        List<Integer> set = g[b];
        set.add(a);
        g[a] = set;
      } else if (g[b] == null) {
        List<Integer> set = g[a];
        set.add(b);
        g[b] = set;
      } else if (g[a] != g[b]) {
        List<Integer> setL = g[a];
        List<Integer> setS = g[b];
        if (setL.size() < setS.size()) {
          List<Integer> temp = setL;
          setL = setS;
          setS = temp;
        }
        setL.addAll(setS);
        for (int c : setS) g[c] = setL;
      }
    }

    int[] bc = new int[N + 1];
    for (int i = 0; i < K; i++) {
      int c = C[i];
      int d = D[i];
      if (g[c] == g[d]) {
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