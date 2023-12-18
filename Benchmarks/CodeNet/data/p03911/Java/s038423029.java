import java.util.*;

public class Main {
  static int[] par;
  static int[] rank;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    par = new int[n];
    rank = new int[n];
    ArrayList[] list = new ArrayList[m];
    for(int i = 0; i < m; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < n; i++) {
      int k = sc.nextInt();
      for(int j = 0; j < k; j++) {
        int l = sc.nextInt() - 1;
        list[l].add(i);
      }
    }
    init(n);
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < list[i].size() - 1; j++) {
        unite(list[i].get(j), list[i].get(j + 1));
      }
    }
    String ans = "NO";
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < n; i++) {
      set.add(find(i));
    }
    if(set.size() == 1) ans = "YES";
    System.out.println(ans);
  }
  static void init(int m) {
      for(int i = 0; i < m; i++) {
        par[i] = i;
        rank[i] = 0;
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
        } else {
          par[y] = x;
          if(rank[x] == rank[y]) {
            rank[x]++;
          }
        }
      }
    }
  static boolean same(int x, int y) {
      return find(x) == find(y);
    }
}