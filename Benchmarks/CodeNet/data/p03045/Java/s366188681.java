import java.util.*;

public class Main {
  static int[] par;
  static int[] rank;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    par = new int[n];
    rank = new int[n];

    int M = sc.nextInt();
    init(n);
    
    for(int i = 0; i < M; i++) {
      int x = sc.nextInt() - 1;
      int y = sc.nextInt() - 1;
      int z = sc.nextInt();
      unite(x, y);
    }
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < n; i++) {
      set.add(find(i));
    }
    System.out.println(set.size());
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
      if(x == y) return;

      if(rank[x] < rank[y]) {
        par[x] = y;
      } else {
        par[y] = x;
        if(rank[x] == rank[y]) rank[x]++;
      }
  }
  static boolean same(int x, int y) {
      return find(x) == find(y);
  }
}