import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
  final static int INF = 1 << 28;
  final static long LNF = 1L << 60;
  final static long MOD = 1_000_000_007;
  final static double EPS = 1e-9;
  final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  class Iku {
    int dist;
    int cost;
  }

  int cal(int n, List<List<Iku>> adj, List<List<Integer>> t) {
    UnionFind uf = new UnionFind(n + 1);
    HashSet<Integer> added = new HashSet<>(n * 2);
    ArrayList<Integer> list = new ArrayList<>();
    int max = -1;
    int index = 0;
    for (List<Integer> comer : t) {
      list.addAll(comer);
      added.addAll(comer);
      for (; ; ) {
        int a = -1;
        int b = -1;
        int c = INF;
        for (Integer ite : list) {
          for (Iku iku : adj.get(ite)) {
            if (!added.contains(iku.dist)) {
              continue;
            }
            if (uf.same(ite, iku.dist)) {
              continue;
            }
            if (c > iku.cost) {
              c = iku.cost;
              a = ite;
              b = iku.dist;
            }
          }
        }
        if (a == -1) {
          break;
        }
        uf.union(a, b);
      }
      boolean flag = true;
      for (Integer a : list) {
        flag &= uf.same(list.get(0), a);
      }
      if (!flag) {
        max = index;
      }
      ++index;
    }
    return max + 1;
  }

  void run() {
    for (; ; ) {
      int n = ni();
      int m = ni();
      if (n == 0) {
        break;
      }
      int[] h = new int[n];
      TreeSet<Integer> set = new TreeSet<>();
      for (int i = 0; i < n; ++i) {
        h[i] = ni();
        set.add(h[i]);
      }
      TreeMap<Integer, Integer> map = new TreeMap<>();
      {
        int index = 0;
        for (Integer v : set.descendingSet()) {
          map.put(v, index++);
        }
      }
      List<List<Integer>> t = new ArrayList<>();
      for (int i = 0; i < set.size(); ++i) {
        t.add(new LinkedList<>());
      }
      for (int i = 0; i < n; ++i) {
        t.get(map.get(h[i])).add(i + 1);
      }
      List<List<Iku>> adj = new ArrayList<>();
      for (int i = 0; i <= n; ++i) {
        adj.add(new LinkedList<>());
      }
      for (int i = 0; i < m; ++i) {
        int a = ni();
        int b = ni();
        if (a > b) {
          int tmp = a;
          a = b;
          b = tmp;
        }
        int c = ni();
        Iku iku = new Iku();
        iku.dist = b;
        iku.cost = c;
        adj.get(a).add(iku);
      }
      int s = cal(n, adj, t);
      UnionFind uf = new UnionFind(n + 1);
      HashSet<Integer> added = new HashSet<>(n * 2);
      ArrayList<Integer> list = new ArrayList<>();
      int sum = 0;
      for (int i = 0; i < s; ++i) {
        List<Integer> comer = t.get(i);
        list.addAll(comer);
        added.addAll(comer);
      }
      for (int i = s; i < t.size(); ++i) {
        List<Integer> comer = t.get(i);
        list.addAll(comer);
        added.addAll(comer);
        for (; ; ) {
          int a = -1;
          int b = -1;
          int c = INF;
          for (Integer ite : list) {
            for (Iku iku : adj.get(ite)) {
              if (!added.contains(iku.dist)) {
                continue;
              }
              if (uf.same(ite, iku.dist)) {
                continue;
              }
              if (c > iku.cost) {
                c = iku.cost;
                a = ite;
                b = iku.dist;
              }
            }
          }
          if (a == -1) {
            break;
          }
          uf.union(a, b);
          sum += c;
        }
      }
      System.out.println(sum);
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

  class UnionFind {
    int[] par;

    UnionFind(int n) {
      par = new int[n];
      for (int i = 0; i < n; ++i) {
        par[i] = i;
      }
    }

    int find(int x) {
      if (par[x] == x) {
        return x;
      }
      return par[x] = find(par[x]);
    }

    boolean same(int x, int y) {
      return find(x) == find(y);
    }

    void union(int x, int y) {
      x = find(x);
      y = find(y);
      if (x == y) {
        return;
      }
      par[x] = y;
    }
  }
}