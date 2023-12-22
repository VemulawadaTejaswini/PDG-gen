import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int n = Integer.parseInt(head[0]);
    int m = Integer.parseInt(head[1]);
    UnionFind uf = new UnionFind(n);
    for(int i = 0; i < m; i++){
      String[] data = br.readLine().split(" ");
      int ai = Integer.parseInt(data[0]) - 1;
      int bi = Integer.parseInt(data[1]) - 1;
      uf.unite(ai, bi);
    }
    br.close();
    Set<Integer> set = new TreeSet<>();
    for(int i = 0; i < n; i++){
      if(set.contains(uf.parent[i])){
      } else {
        set.add(uf.parent[i]);
      }
    }
    System.out.println(set.size() - 1);
  }
}

class UnionFind {
  private final int N;
  int[] parent;
  int[] rank;
  int[] size;

  UnionFind(int n) {
    N = n;
    parent = new int[N];
    Arrays.setAll(parent, i -> i);
    size = new int[N];
    Arrays.fill(size, 1);
    rank = new int[N];
  }

  boolean isRoot(int x) {
    return x == parent[x];
  }

  int root(int x) {
    return isRoot(x) ? x : (parent[x] = root(parent[x]));
  }

  boolean same(int x, int y){
    return root(x) == root(y);
  }

  int size(int x) {
    return size[root(x)];
  }

  void unite(int x, int y){
    x = root(x);
    y = root(y);
    if (x != y) {
      if (rank[x] < rank[y]) {
        parent[x] = y;
        size[y] += size[x];
      } else {
        parent[y] = x;
        size[x] += size[y];
        if (rank[x] == rank[y]) {
          rank[x]++;
        }
      }
    }
  }
}