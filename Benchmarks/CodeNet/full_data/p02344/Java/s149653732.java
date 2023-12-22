import java.util.*;

class Main {
  static int[] rank;
  static int[] par;
  static int[] weight;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();

    rank = new int[n];
    par = new int[n];
    weight = new int[n];

    for(int i = 0 ; i < n ; i++) {
      par[i] = i;
    }

    int com, x, y, z;
    for(int i = 0 ; i < q ; i++) {
      com = sc.nextInt();
      x = sc.nextInt();
      y = sc.nextInt();
      if(com == 0) {
        z = sc.nextInt();
        realte(x, y, z);
      } else same(x,y);
    }
  }

  static int find(int x) {
    if(x == par[x]) return x;
    else {
      int r = find(par[x]);
      weight[x] += weight[par[x]];
      return par[x] = r;
    }
  }

  static int weight(int x) {
    find(x);
    return weight[x];
  }

  static void realte(int x, int y, int z) {
    z += weight(x);
    z -= weight(y);
    x = find(x);
    y = find(y);
    if(x == y) return;
    if(rank[x] < rank[y]) {
      int swap = x;
      x = y;
      y = swap;
      z = -z;
    }
    if(rank[x] == rank[y]) {
      ++rank[x];
    }
    par[y] = x;
    weight[y] = z;
  }

  static void diff(int x, int y) {
    System.out.println(weight(y) - weight(x));
  }

  static void same(int x, int y) {
    if(find(x) == find(y)) {
      diff(x,y);
    } else {
      System.out.println("?");
    }
  }
}

