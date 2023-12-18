import java.util.*;

public class Main {
  static int[] par;
  static int[] rank;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    par = new int[n + 1];
    rank = new int[n + 1];

    int[] f = new int[n + 1];
    init(n + 1);
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      f[a]++;
      f[b]++;
      unite(a, b);
    }

    int[] ans = new int[n + 1];

    int[] num = new int[n + 1];

    for(int i = 1; i <= n; i++) {
      num[find(i)]++;
    }
    
    for(int i = 1; i <= n; i++) {
      ans[i] = num[find(i)] - f[i] - 1;
    }

    for(int i = 0; i < k; i++) {
      int c = sc.nextInt();
      int d = sc.nextInt();
      if(same(c, d)) {
        ans[c]--;
        ans[d]--;
      }
    }

    for(int i = 1; i < n + 1; i++) {
      System.out.print(ans[i]);
      System.out.print(" ");
    }
  }
  static void init(int m) {
      for(int i = 0; i < m; i++) {
        par[i] = i;
        rank[i] = 1;
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
        } else {
          if(rank[x] == rank[y]) {
            if(x > y) {
              par[x] = y;
              rank[y] += rank[x];
            } else {
              par[y] = x;
              rank[x] += rank[y];
            }
          } else {
            par[y] = x;
            rank[x] += rank[y];
          }
        }
      }
    }
  static boolean same(int x, int y) {
      return find(x) == find(y);
    }
}