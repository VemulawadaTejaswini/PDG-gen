import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
  final static int INF = 1 << 28;
  final static long MOD = 1_000_000_007;
  final static double EPS = 1e-9;
  final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  class Board {
    int cost;
    int enc;
  }

  int diff(int[][] ans, int[][] field) {
    int cnt = 0;
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        if (ans[i][j] != field[i][j]) {
          ++cnt;
        }
      }
    }
    return cnt;
  }

  int diff(int ans, int field) {
    int cnt = 0;
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        int l = get(j, i, ans);
        int r = get(j, i, field);
        if (l != r) {
          ++cnt;
        }
      }
    }
    return cnt;
  }

  int encode(int[][] field) {
    int sum = 0;
    int shift = 0;
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        sum |= field[i][j] << shift;
//        shift += 2;
        ++shift;
      }
    }
    return sum;
  }

  int[][] decode(int bits) {
    int[][] field = new int[4][4];
    int shift = 0;
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
//        int v = (bits >> shift) & 0b11;
        int v = (bits >> shift) & 0b1;
        field[i][j] = v;
//        shift += 2;
        shift += 1;
      }
    }
    return field;
  }

  int[][] copy(int[][] f) {
    int[][] g = new int[4][4];
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        g[i][j] = f[i][j];
      }
    }
    return g;
  }

  int get(int x, int y, int bits) {
//    return (bits >> (y * 4 * 2 + x * 2)) & 0b11;
    return (bits >> (y * 4 + x)) & 1;
  }

  int next(int x, int y, int c, int f) {
//    f &= ~(0b11 << (y * 4 * 2 + x * 2));
//    f |= c << (y * 4 * 2 + x * 2);
//    return f;
    f &= ~(1 << (y * 4 + x));
    f |= c << (y * 4 + x);
    return f;
  }

  int apply(int h, int w, int c, int f, int x, int y, int[][] ans) {
//    boolean flag = false;
    for (int i = 0; i < h; ++i) {
      for (int j = 0; j < w; ++j) {
        int nx = x + j;
        int ny = y + i;
        if (nx < 0 || 4 <= nx || ny < 0 || 4 <= ny) {
          continue;
        }
        int v = ans[ny][nx] == c ? 1 : 0;
        f = next(nx, ny, v, f);
//        flag |= get(nx, ny, ans) == c;
      }
    }
//    if (!flag) {
//      return 0;
//    }
    return f;
  }

  class Rect {
    int h, w;
  }

  void debugField(int v) {
    int[][] bf = decode(v);
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        System.err.print(bf[i][j]);
      }
      System.err.println();
    }
  }

  void run() {
    int n = ni();
    int[] h = new int[n];
    int[] w = new int[n];
    ArrayList<Rect> list = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      h[i] = ni();
      w[i] = ni();
      Rect r = new Rect();
      r.h = h[i];
      r.w = w[i];
      list.add(r);
    }
    list.sort(Comparator.comparingInt((Rect r) -> r.h * r.w).reversed());
    for (int i = 0; i < n; ++i) {
      Rect r = list.get(i);
      h[i] = r.h;
      w[i] = r.w;
    }
    int[] map = new int[256];
    map['R'] = 1;
    map['G'] = 2;
    map['B'] = 3;
    int[][] ans = new int[4][4];
    for (int i = 0; i < 4; ++i) {
      String str = sc.next();
      for (int j = 0; j < 4; ++j) {
        ans[i][j] = map[str.charAt(j)];
      }
    }
    int encodedAns = encode(ans);
    Board atom = new Board();
    atom.cost = 0;
    atom.enc = 0;
//    atom.diff = diff(encodedAns, 0);
    Queue<Board> queue = new LinkedList<>();
    queue.add(atom);
    HashSet<Integer> set = new HashSet<>();
    int min = INF;
    while (queue.size() > 0) {
      Board board = queue.poll();
//      debug(board.cost, board.diff);
//      debugField(board.enc);
      if (board.enc == (1 << 16) - 1) {
        min = Math.min(min, board.cost);
//        debug(min);
        break;
      }
      if (set.contains(board.enc)) {
        continue;
      }
      set.add(board.enc);
      for (int i = 0; i < n; ++i) {
        for (int y = -3; y <= 3; ++y) {
          for (int x = -3; x <= 3; ++x) {
            for (int c = 1; c <= 3; ++c) {
              int enc = apply(h[i], w[i], c, board.enc, x, y, ans);
              Board next = new Board();
              next.enc = enc;
              next.cost = board.cost + 1;
              queue.add(next);
            }
          }
        }
      }
    }
    System.out.println(min);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}