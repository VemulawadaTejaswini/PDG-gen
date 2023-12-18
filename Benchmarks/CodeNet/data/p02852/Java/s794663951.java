import java.util.Scanner;

public class Main {
  private static final int INF = 1_000_000_000;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    SegmentTree tree = new SegmentTree(N + 1);
    int[] next = new int[N + 1];
    tree.update(N, 0);
    for (int i = N - 1; i >= 0; i--) {
      if (s[i] == '0') {
        Cell min = tree.query(i + 1, i + 1 + M);
        tree.update(i, min.value + 1);
        next[i] = min.pos;
      }
    }
    if (tree.query(0, 1).value == INF) {
      System.out.println(-1);
    } else {
      StringBuilder sb = new StringBuilder();
      int p = 0;
      while (p < N) {
        int q = next[p];
        sb.append(q - p).append(' ');
        p = q;
      }
      sb.setLength(sb.length() - 1);
      System.out.println(sb.toString());
    }
  }

  private static class SegmentTree {
    private int n;
    private final Cell[] dat;

    private SegmentTree(int tmpn) {
      n = 1;
      while (n < tmpn) {
        n <<= 1;
      }
      dat = new Cell[n * 2 - 1];
      for (int i = 0; i < n * 2 - 1; i++) dat[i] = new Cell(-1, INF);
    }

    public Cell query(int left, int right) {
      return query(left, right, 0, 0, n);
    }

    private Cell query(int a, int b, int k, int l, int r) {
      if (r <= a || b <= l) return new Cell(-1, INF);
      if (a <= l && r <= b) return dat[k];
      Cell vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
      Cell vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
      if (vr.value < vl.value) return vr;
      return vl;
    }

    public void update(int k, int value) {
      int l = k + n - 1; // the number of non-leaf nodes is 2 * n - 1 - n = n - 1
      dat[l].pos = k;
      dat[l].value = value;
      while (l > 0) {
        l = (l - 1) / 2;
        Cell min = dat[l * 2 + 2].value < dat[l * 2 + 1].value ? dat[l * 2 + 2] : dat[l * 2 + 1];
        dat[l].pos = min.pos;
        dat[l].value = min.value;
      }
    }
  }

  private static class Cell {
    private int pos;
    private int value;

    private Cell(int pos, int value) {
      this.pos = pos;
      this.value = value;
    }
  }
}
