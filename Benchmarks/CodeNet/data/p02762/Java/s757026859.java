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

    boolean[][] f = new boolean[N + 1][N + 1];
    for (int i = 0; i < M; i++) {
      f[A[i]][B[i]] = true;
      f[B[i]][A[i]] = true;
    }
    boolean[][] b = new boolean[N + 1][N + 1];
    for (int i = 0; i < K; i++) {
      b[C[i]][D[i]] = true;
      b[D[i]][C[i]] = true;
    }

    int[] ans = new int[N + 1];
    for (int i = 1; i < N + 1; i++) {
      for (int j = 1; j < f[i].length; j++) {
        if (j == i) continue;
        if (f[i][j] || b[i][j]) continue;
        if (fD(f, i, j)) ans[i]++;
      }
    }

    StringBuilder buf = new StringBuilder();
    for (int i = 1; i < N + 1; i++)
      buf.append(ans[i]).append(" ");
    buf.setLength(buf.length() - 1);
    System.out.println(buf);
  }

  private static boolean fD(boolean[][] f, int a, int b) {
    Deque<int[]> q = new ArrayDeque<>();
    q.addLast(new int[] {a, 1});

    while (!q.isEmpty()) {
      int[] i = q.pollFirst();
      boolean[] fn = f[i[0]];

      if (fn[b])
        return true;

      for (int j = 1; j < fn.length; j++)
        if (fn[j] && i[1] < fn.length) q.addLast(new int[] {j, i[1] + 1});
    }
    return false;
  }
}