import java.util.*;

public class Main {
  static int n;
  static int m;
  static int q;
  static int[] a;
  static int[] b;
  static int[] c;
  static int[] d;
  static int ans;
  static int[] t;
  static int k;
  static int l;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    q = sc.nextInt();
    a = new int[q];
    b = new int[q];
    c = new int[q];
    d = new int[q];
    t = new int[n + m - 1];
    k = n;
    l = m - 1;
    for(int i = 0; i < q; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      c[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }
    dfs(0);
    System.out.println(ans);
  }

  public static void dfs(int p) {
    if(p == (n + m - 1)) {
      int[] r = new int[n];
      int c1 = 0;
      int c2 = 0;
      for(int i = 0; i < (n + m - 1); i++) {
        if(t[i] == 1) {
          r[c1] = (c2 + 1);
          c1++;
        } else {
          c2++;
        }
      }
      int w = 0;
      for(int i = 0; i < q; i++) {
        if((r[b[i]] - r[a[i]]) == c[i]) w += d[i];
      }
      ans = Math.max(ans, w);
    } else {
      if(k > 0) {
        if(l > 0) {
          t[p] = 1;
          k--;
          dfs(p + 1);
          k++;
          t[p] = 2;
          l--;
          dfs(p + 1);
          l++;
        } else {
          t[p] = 1;
          k--;
          dfs(p + 1);
          k++;
        }
      } else {
        t[p] = 2;
        l--;
        dfs(p + 1);
        l++;
      }
    }
  }
}