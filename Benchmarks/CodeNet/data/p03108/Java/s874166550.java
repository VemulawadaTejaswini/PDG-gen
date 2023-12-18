
import java.util.*;

public class Main {
  static int[] par;
  static int[] rank;
  static long[] size;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    par = new int[n];
    rank = new int[n];
    size = new long[n];
    int m = sc.nextInt();
    init(n);
    long[] ans = new long[m + 1];
    ans[m] = ((long)n * (long)(n - 1)) / 2;
    int[] a = new int[m];
    int[] b = new int[m];
    for(int i = 0; i < m; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
    }
    for(int i = m - 1; i >= 0; i--) {
      if(same(a[i], b[i])) {
        ans[i] = ans[i + 1];
      } else {
        ans[i] = ans[i + 1] - (size(a[i]) * size(b[i]));
      }
      unite(a[i], b[i]);
    }
    for(int i = 1; i <= m; i++) {
      System.out.println(ans[i]);
    }
  }
  static void init(int m) {
    for(int i = 0; i < m; i++) {
      par[i] = i;
      rank[i] = 1;
      size[i] = 1;
    }
  }
  static int find(int x) {
    if(par[x] == x) {
      return x;
    } else {
      return par[x] = find(par[x]);
    }
  }
  static void unite(int x, int y) {
    x = find(x);
    y = find(y);
    if(x != y) {
      if(rank[x] < rank[y]) {
        par[x] = y;
        rank[y] += rank[x];
        size[y] += size[x];
      } else {
        if(rank[x] == rank[y]) {
          if(x > y) {
            par[x] = y;
            rank[y] += rank[x];
            size[y] += size[x];
          } else {
            par[y] = x;
            rank[x] += rank[y];
            size[x] += size[y];
          }
        } else {
          par[y] = x;
          rank[x] += rank[y];
          size[x] += size[y];
        }
      }
    }
  }
  static boolean same(int x, int y) {
    return find(x) == find(y);
  }
  static long size(int x) {
    return size[find(x)];
  }
}