import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  private static List<int[]> root(List<Integer>[] tree, int p, int s, int e) {
    List<int[]> root = new ArrayList<>();

    List<Integer> leaf = tree[s];
    if (leaf == null) return root;

    for (int l : leaf) {
      if (l == p) continue;
      if (l == e) {
        int[] a = new int[] {s, l};
        Arrays.sort(a);
        root.add(a);
        break;
      }
      List<int[]> next = root(tree, s, l, e);
      if (!next.isEmpty()) {
        int[] a = new int[] {s, l};
        Arrays.sort(a);
        root.add(a);
        root.addAll(next);
      }
    }
    return root;
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
      int n = Math.min(a[i], b[i]);
      int l = Math.max(a[i], b[i]);
      if (tree[n] == null) tree[n] = new ArrayList<>();
      tree[n].add(l);

      if (tree[l] == null) tree[l] = new ArrayList<>();
      tree[l].add(n);
    }
//    System.out.println(Arrays.toString(tree));

    List<int[]> pear = new ArrayList<>();
    for (int i = 0; i < N - 1; i++) {
      int n = Math.min(a[i], b[i]);
      int l = Math.max(a[i], b[i]);
      pear.add(new int[] { n, l });
    }
//    pear.forEach(ary ->
//    System.out.println(Arrays.toString(ary)));


    @SuppressWarnings("unchecked")
    List<int[]>[] root = new List[M];
    for (int i = 0; i < M; i++) {
      int s = Math.min(u[i], v[i]);
      int e = Math.max(u[i], v[i]);
      root[i] = root(tree, 0, s, e);

//      root[i].forEach(ary ->
//      System.out.print(Arrays.toString(ary)));
//      System.out.println();
    }

//    Set<Long> br = new HashSet<>();
    long ans = 0;
    long cmax = (long) Math.pow(2, pear.size()) - 1;
    for (long c = cmax; 0 < c; c--) {
      List<int[]> blackPear = new ArrayList<>();
      for (int i = 0; i < pear.size(); i++)
        if (((c >> i) & 1) == 1) blackPear.add(pear.get(i));
//      System.out.println(c);
//      blackPear.forEach(ary ->
//      System.out.print(Arrays.toString(ary) + " "));
//      System.out.println();

      boolean allblack = true;
      for (int i = 0; i < root.length; i++) {
        List<int[]> r = root[i];
        if (r.isEmpty()) continue;

        boolean black = false;
        for (int[] rp : r) {
          for (int[] bp : blackPear) {
            if (Arrays.equals(bp, rp)) {
              black = true;
              break;
            }
          }
          if (black) break;
        }
        allblack &= black;
        if (!allblack) break;
      }
      if (allblack) {
//        br.add(c);
        ans++;
      }
    }

//    System.out.println(br);
    System.out.println(ans);
  }
}