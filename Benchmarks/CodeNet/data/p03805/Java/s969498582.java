public class Main {
  public static void main(String...args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt(), ans = 0;
    boolean[][] a = new boolean[n][n];
    for (int i = 0; i < m; i++) {
      int x = in.nextInt() - 1, y = in.nextInt() - 1;
      a[x][y] = a[y][x] = true;
    }
    Permutation perm = new Permutation(n);
    outer:
    for (int[] p : perm) {
      if (p[0] != 0) continue;
      for (int i = 1; i < n; i++) {
        if (!a[p[i - 1]][p[i]]) continue outer;
      }
      ans++;
    }
    System.out.println(ans);
  }
}
class Permutation implements java.util.Iterator<int[]>, Iterable<int[]> {
    private int[] next;

    public Permutation(int n) {
        next = java.util.stream.IntStream.range(0, n).toArray();
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public int[] next() {
        int[] r = next.clone();
        next = nextPermutation(next);
        return r;
    }

    @Override
    public java.util.Iterator<int[]> iterator() {
        return this;
    }

    public static int[] nextPermutation(int[] a) {
        if (a == null || a.length < 2)
            return null;
        int p = 0;
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] >= a[i + 1])
                continue;
            p = i;
            break;
        }
        int q = 0;
        for (int i = a.length - 1; i > p; i--) {
            if (a[i] <= a[p])
                continue;
            q = i;
            break;
        }
        if (p == 0 && q == 0)
            return null;
        int temp = a[p];
        a[p] = a[q];
        a[q] = temp;
        int l = p, r = a.length;
        while (++l < --r) {
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return a;
    }
}
