import java.util.*;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  class Info {
    int y;
    int d;
    int c;

    Info(int y, int d, int c) {
      this.y = y;
      this.d = d;
      this.c = c;
    }
  }

  class Data {
    int x;
    int dist;
    int cost;
    int comp;
    int prec;
  }

  void run() {
    for (; ; ) {
      int n, m, c, s, g;
      n = ni();
      m = ni();
      c = ni();
      s = ni();
      g = ni();
      if (n == 0) {
        break;
      }

      ArrayList<LinkedList<Info>> list = new ArrayList<>();
      for (int i = 0; i <= n; ++i) {
        list.add(new LinkedList<>());
      }
      for (int i = 0; i < m; ++i) {
        int x, y, d, ci;
        x = ni();
        y = ni();
        d = ni();
        ci = ni();
        list.get(x).add(new Info(y, d, ci));
      }

      int[][] LUT = new int[c + 1][20001];
      int[] p = new int[c + 1];
      for (int i = 1; i <= c; ++i) {
        p[i] = ni();
      }
      for (int i = 1; i <= c; ++i) {
        int[] q = new int[p[i]];
        for (int j = 0; j < p[i] - 1; ++j) {
          q[j] = ni();
        }
        q[p[i] - 1] = 1 << 28;
        int[] r = new int[p[i]];
        for (int j = 0; j < p[i]; ++j) {
          r[j] = ni();
        }
        int idx = 0;
        for (int j = 1; j <= 20000; ++j) {
          if (j > q[idx]) {
            ++idx;
          }
          LUT[i][j] = LUT[i][j - 1] + r[idx];
        }
//        debug(LUT[i]);
      }

      Data dat = new Data();
      dat.x = s;
      dat.dist = 0;
      dat.cost = 0;
      dat.comp = 0;
      dat.prec = 0;
      PriorityQueue<Data> queue = new PriorityQueue<>((a, b) -> a.dist - b.dist);
      queue.add(dat);
      int[] memo = new int[n + 1];
      Arrays.fill(memo, 1 << 28);
      memo[s] = 0;
      while (queue.size() > 0) {
        Data e = queue.poll();
//        debug(e.x, e.cost, e.dist, e.comp, e.prec);
//        if (e.cost > memo[e.x]) {
//          continue;
//        }

        for (Info info : list.get(e.x)) {
          Data next = new Data();
          next.x = info.y;
          if (info.c == e.comp) {
            next.dist = e.dist + info.d;
//            debug("\t", info.y, next.dist, e.dist, info.d, LUT[info.c][next.dist]);
            next.cost = LUT[info.c][next.dist] + e.prec;
          } else {
            next.dist = info.d;
            next.prec = e.cost;
            next.cost = e.cost + LUT[info.c][next.dist];
          }
          next.comp = info.c;
          queue.add(next);
          memo[next.x] = Math.min(memo[next.x], next.cost);
        }
      }

      System.out.println(memo[g] == 1 << 28 ? -1 : memo[g]);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}