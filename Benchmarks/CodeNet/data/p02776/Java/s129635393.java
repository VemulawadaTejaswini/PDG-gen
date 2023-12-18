import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // #bomb
    int M = sc.nextInt(); // #code

    List<int[]> ab = new ArrayList<>(N); // [idx bomb, state]
    for (int i = 0; i < N; i++) {
      ab.add(new int[] {sc.nextInt(), sc.nextInt()});
    }
    ab.sort(Comparator.comparingInt(c -> c[0]));

    // Compress coordinate O(A=10^9 -> N=10^5).
    int[] x = new int[N + 1];
    x[0] = /*ab.get(-1)[1] ^ */ ab.get(0)[1]; // diff [-1:0] , -1 is sentinel.
    for (int i = 1; i <= N - 1; i++) {
      x[i] = ab.get(i - 1)[1] ^ ab.get(i)[1];
    }
    x[N] = ab.get(N - 1)[1]; /* ^ ab.get(N)[1] */ // diff[N-1:N], N is sentinel.

    // Range operation of toggling bomb as a graph on compressed coordinate.
    Map<Integer, List<int[]>> g = new HashMap<>(N);
    for (int idxCode = 1; idxCode <= M; idxCode++) {
      int[] l = new int[] {sc.nextInt(), 0}; // [idx, state:off]
      int[] r = new int[] {sc.nextInt(), 1}; // [idx, state:on]
      int from = lowerBound(ab, l); // idx of key以上の要素 from leftG , toggle-from
      int to = upperBound(ab, r); // idx of keyより大きい要素 from right., toggle-before-this.
      if (from > to) continue;
      g.computeIfAbsent(from, k -> new LinkedList<>()).add(new int[] {to, idxCode});
      g.computeIfAbsent(to, k -> new LinkedList<>()).add(new int[] {from, idxCode});
    }

    boolean[] isUsed = new boolean[N + 1];
    List<Integer> ans = new LinkedList<>();
    for (int i = 0; i <= N; i++) {
      if (isUsed[i]) continue;
      if (dfs(i, isUsed, x, g, ans) == 1) {
        System.out.println(-1);
        return;
      }
    }
    System.out.println(ans.size());
    ans.sort(Comparator.naturalOrder());
    for (Integer a : ans) {
      System.out.print(a + " ");
    }
  }
  // - Check if all elements of diff-sum seq 'x[]' can be 0.
  // If this can be, then return 0.
  // - DFS each connected sub-graph starting with 'idxFrom'.
  // Return compressed bom state at and under this 'idxFrom'.
  private static int dfs(
      int idxFrom, boolean[] isUsed, int[] x, Map<Integer, List<int[]>> graph, List<Integer> ans) {
    isUsed[idxFrom] = true;
    int res = x[idxFrom];
    List<int[]> g = graph.get(idxFrom);
    if (g == null) return res;
    for (int[] e : g) {
      int idxTo = e[0], idxCode = e[1];
      if (isUsed[idxTo]) continue;
      int r = dfs(idxTo, isUsed, x, graph, ans);
      if (r == 1) ans.add(idxCode); // If leaf is 1, then it need to be flipped.
      res ^= r;
    }
    return res;
  }

  static int lowerBound(List<int[]> bombStates, int[] bombState) {
    int idx = // Java's binarySearch can be used because no duplicate key exists in this problem.
        Collections.binarySearch(
            bombStates,
            bombState,
            (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
    return idx >= 0 ? idx : ~idx;
  }

  static int upperBound(List<int[]> bombStates, int[] bombState) {
    int l = -1, r = bombStates.size();
    while (l + 1 < r) { // l:ok, r:ng
      int m = (l + r) / 2;
      int[] mm = bombStates.get(m);
      // if (mm < bombState) then m is ok.
      if (mm[0] == bombState[0]
          ? mm[1] <= bombState[1]
          : mm[0] <= bombState[0]) {
        l = m;
      } else {
        r = m;
      }
    }
    return r;
  }
}
