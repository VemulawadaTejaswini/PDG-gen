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

  class Node {
    int x;
    int y;
    int d;
  }

  static int[][] ofs = {
      {1, 0},
      {0, 1},
      {-1, 0},
      {0, -1}
  };

  void run() {
    for (; ; ) {
      int w, h;
      w = ni();
      h = ni();
      if ((w | h) == 0) {
        break;
      }
      int[][] s = new int[h + 2][w + 2];
      for (int i = 0; i <= h + 1; ++i) Arrays.fill(s[i], -1);
      for (int i = 1; i <= h; ++i) {
        for (int j = 1; j <= w; ++j) {
          s[i][j] = ni();
        }
      }
      int[] c = new int[4];
      for (int i = 0; i < 4; ++i) {
        c[i] = ni();
      }

      int[][][] dp = new int[h + 2][w + 2][4];
      for (int i = 0; i < h + 2; ++i) {
        for (int j = 0; j < w + 2; ++j) {
          for (int k = 0; k < 4; ++k) {
            dp[i][j][k] = 1 << 28;
          }
        }
      }
      Node start = new Node();
      start.x = 1;
      start.y = 1;
      start.d = 0;
      dp[1][1][0] = 0;

      Queue<Node> meu = new PriorityQueue<>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
          if (dp[o2.y][o2.x][o2.d] == dp[o1.y][o1.x][o1.d]) {
            return h - o2.y + w - o2.x + o1.y - h + o1.x - w;
          } else {
            return dp[o1.y][o1.x][o1.d] - dp[o2.y][o2.x][o2.d];
          }
        }
      });
      meu.add(start);
      while (meu.size() > 0) {
        Node node = meu.poll();
//        debug(node.x, node.y, node.d, dp[node.y][node.x][node.d]);
        if (node.x == w && node.y == h) {
          break;
        }
        for (int i = 0; i < 4; ++i) {
          int addi = i == s[node.y][node.x] ? 0 : c[i];
          Node next = new Node();
          next.d = (node.d + i) % 4;
          next.x = node.x + ofs[next.d][0];
          next.y = node.y + ofs[next.d][1];
          if (s[next.y][next.x] == -1) {
            continue;
          }
          if (dp[next.y][next.x][next.d] > dp[node.y][node.x][node.d] + addi) {
            dp[next.y][next.x][next.d] = dp[node.y][node.x][node.d] + addi;
            meu.add(next);
          }
        }
      }

      int ans = 1 << 28;
      for (int i = 0; i < 4; ++i) {
        ans = Math.min(ans, dp[h][w][i]);
      }
      System.out.println(ans);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}