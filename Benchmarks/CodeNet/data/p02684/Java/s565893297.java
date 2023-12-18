import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {

  private static int position = -1;

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int N = scanner.nextInt();
    final long K = scanner.nextLong();
    final int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = scanner.nextInt();
    }

    if (A[1] == 1) {
      System.out.println(1);
      return;
    }

    // 閉路を見つける
    final boolean[] seen = new boolean[N + 1];
    final boolean[] finished = new boolean[N + 1];
    final Stack<Integer> history = new Stack<>();
    position = -1;
    dfs(A, 1, 0, seen, finished, history);

    // 閉路を復元
    Set<Integer> cycle = new LinkedHashSet<>();
    while (!history.empty()) {
      final int t = history.pop();
      cycle.add(t);
      if (t == position) {
        break;
      }
    }

    if (cycle.contains(1)) {
      final long q = K % cycle.size();
      int ans = 1;
      for (long i = 0; i < q; i++) {
        ans = A[ans];
      }
      System.out.println(ans);
    } else {
      final long q = K % cycle.size();
      int ans = 1;
      int cnt = 0;

      while (!cycle.contains(ans)) {
        ans = A[ans];
        cnt++;
      }

      for (long i = cnt; i < q; i++) {
        ans = A[ans];
      }

      System.out.println(ans);
    }
  }

  private static void dfs(final int[] A, final int v, final int previousV,
      final boolean[] seen, final boolean[] finished, final Stack<Integer> history) {

    seen[v] = true;
    history.push(v);

    final int nextV = A[v];

    if (v == previousV) {
      return;
    }

    // 完全終了した頂点はスルー
    if (finished[nextV]) {
      return;
    }

    // サイクルを検出
    if (seen[nextV] && !finished[nextV]) {
      position = nextV;
      return;
    }

    // 再帰的に探索
    dfs(A, nextV, v, seen, finished, history);

    // サイクル検出したならば真っ直ぐに抜けていく
    if (position != -1) {
      return;
    }

    history.pop();
    finished[v] = true;
  }
}
