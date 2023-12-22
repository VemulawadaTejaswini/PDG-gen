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
    int diff;
    int diffdiff;
    int enc;
    int index;
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

  int encode(int[][] field) {
    int sum = 0;
    int shift = 0;
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        sum |= field[i][j] << shift;
        shift += 2;
      }
    }
    return sum;
  }

  int[][] decode(int bits) {
    int[][] field = new int[4][4];
    int shift = 0;
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        int v = (bits >> shift) & 0b11;
        field[i][j] = v;
        shift += 2;
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

  boolean apply(int h, int w, int c, int[][] f, int x, int y, int[][] ans) {
    boolean flag = false;
    for (int i = 0; i < h; ++i) {
      for (int j = 0; j < w; ++j) {
        int nx = x + i;
        int ny = y + j;
        if (nx < 0 || 4 <= nx || ny < 0 || 4 <= ny) {
          continue;
        }
        if (f[ny][nx] == c) {
          continue;
        }
        if (ans[ny][nx] == f[ny][nx]) {
          return false;
        }
        f[ny][nx] = c;
        flag |= ans[ny][nx] == c;
      }
    }
    return flag;
  }

  class Rect {
    int h, w;
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
    long encodedAns = encode(ans);
    Board atom = new Board();
    atom.cost = 0;
    atom.enc = 0;
    atom.diff = diff(ans, new int[4][4]);
    atom.diffdiff = 0;
    atom.index = 0;
    PriorityQueue<Board> queue = new PriorityQueue<>((a, b) -> {
      if (a.diff != b.diff) {
        return a.diff - b.diff;
      }
      if (a.diffdiff != b.diffdiff) {
        return a.diffdiff - b.diffdiff;
      }
      return -(a.index - b.index);
    });
    queue.add(atom);
    HashSet<Integer> set = new HashSet<>();
    int min = INF;
    int cnt = 0;
    while (queue.size() > 0) {
      Board board = queue.poll();
      int[][] bf = decode(board.enc);
      if (encodedAns == board.enc) {
        min = Math.min(min, board.cost);
        break;
      }
      if (set.contains(board.enc)) {
        continue;
      }
      set.add(board.enc);
      for (int i = board.index; i < n; ++i) {
        for (int y = -3; y <= 3; ++y) {
          for (int x = -3; x <= 3; ++x) {
            for (int c = 1; c <= 3; ++c) {
              int[][] field = copy(bf);
              boolean flag = apply(h[i], w[i], c, field, x, y, ans);
              if (!flag) {
                field = null;
                continue;
              }
              Board next = new Board();
              next.enc = encode(field);
              next.cost = board.cost + 1;
              next.diff = diff(ans, field);
              next.diffdiff = next.diff - board.diff;
              next.index = i;
              queue.add(next);
              field = null;
            }
          }
        }
      }
      bf = null;
      if (++cnt % 10000 == 0) {
        System.gc();
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