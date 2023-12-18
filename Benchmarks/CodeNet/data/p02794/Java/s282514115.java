import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  private static List<int[]> path(List<Integer>[] tree, int p, int s, int e) {
    List<int[]> path = new ArrayList<>();

    List<Integer> leaf = tree[s];
    if (leaf == null) return path;

    for (int l : leaf) {
      if (l == p) continue;
      if (l == e) {
        int[] a = new int[] {s, l};
        Arrays.sort(a);
        path.add(a);
        break;
      }
      List<int[]> next = path(tree, s, l, e);
      if (!next.isEmpty()) {
        int[] a = new int[] {s, l};
        Arrays.sort(a);
        path.add(a);
        path.addAll(next);
      }
    }
    return path;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N - 1];
    int[] b = new int[N - 1];
    for (int i = 0; i < N - 1; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    int M = sc.nextInt();
    int[] u = new int[M];
    int[] v = new int[M];
    for (int i = 0; i < M; i++) {
      u[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    sc.close();

    @SuppressWarnings("unchecked")
    List<Integer>[] tree = new List[N + 1];
    for (int i = 0; i < N - 1; i++) {
      int ai = a[i];
      int bi = b[i];
      if (tree[ai] == null) tree[ai] = new ArrayList<>();
      tree[ai].add(bi);
      if (tree[bi] == null) tree[bi] = new ArrayList<>();
      tree[bi].add(ai);
    }

    @SuppressWarnings("unchecked")
    List<int[]>[] path = new List[M];
    for (int i = 0; i < M; i++) {
      int ui = u[i];
      int vi = v[i];
      path[i] = path(tree, 0, ui, vi);

//      path[i].forEach(ary ->
//      System.out.print(Arrays.toString(ary)));
//      System.out.println();
    }

    int[][] edge = new int[N + 1][N + 1];
    for (int i = 0; i < N - 1; i++) {
      int l = Math.min(a[i], b[i]);
      int r = Math.max(a[i], b[i]);
      edge[l][r] = i;
    }

    long[] path_l = new long[M];
    for (int i = 0; i < M; i++) {
      List<int[]> p = path[i];
      for (int[] lr : p) {
        int n = edge[lr[0]][lr[1]];
        path_l[i] |= (1 << n);
      }
    }
//    Arrays.stream(path_l).forEach(l ->
//    System.out.println(Long.toBinaryString(l)));

    long ans = 0;
    long cmax = (long) Math.pow(2, N - 1) - 1;
    for (long c = cmax; 0 < c; c--) {
      boolean allBlack = true;
      for (long l : path_l) {
        if ((c & l) == 0) {
          allBlack = false;
          break;
        }
      }
      if (allBlack) ans++;
    }
    System.out.println(ans);
  }
}