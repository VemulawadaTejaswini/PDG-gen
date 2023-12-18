import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    int[] ans = new int[N + 1];
    Map<Integer, Set<Integer>> fr = new HashMap<>();
    Map<Integer, Set<Integer>> bl = new HashMap<>();
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      fr.computeIfAbsent(a, k -> new HashSet<>()).add(b);
      fr.computeIfAbsent(b, k -> new HashSet<>()).add(a);
    }
    for (int i = 0; i < K; i++) {
      int c = sc.nextInt();
      int d = sc.nextInt();
      bl.computeIfAbsent(c, k -> new HashSet<>()).add(d);
      bl.computeIfAbsent(d, k -> new HashSet<>()).add(c);
    }

    for (int me = 1; me <= N; me++) {
      collect(ans, me, me, fr, bl, new boolean[N + 1]);
    }

    for (int i = 1; i <= N; i++) {
      System.out.print(ans[i] + " ");
    }
  }

  static void collect(
      int[] ans,
      int me,
      int cur,
      Map<Integer, Set<Integer>> fr,
      Map<Integer, Set<Integer>> bl,
      boolean[] isVisited) {
    isVisited[cur] = true;
    if (me != cur
      // no-friend
      // no-block
      && !bl.getOrDefault(cur, Collections.emptySet()).contains(me)
      && !fr.getOrDefault(cur, Collections.emptySet()).contains(me)) {
      ans[me]++;
//      System.out.println(me + " add " + cur);
    }
    for (int f : fr.getOrDefault(cur, Collections.emptySet())) {
      if (!isVisited[f]) {
        collect(ans, me, f, fr, bl, isVisited);
      }
    }
  }
}
