import java.util.*;

public class Main {
  public static int H;
  public static int W;
  public static char[][] S;
  public static boolean[][] visit;
  public static ArrayList<String> list = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    S = new char[H][W];
    visit = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      S[i] = sc.next().toCharArray();
      Arrays.fill(visit[i], false);
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (S[i][j] == '#') {
          dfs(i, j, i, j, true, 0);
        }
        for (int k = 0; k < H; k++) {
          Arrays.fill(visit[k], false);
        }
      }
    }
    System.out.println(list.size() + 1);
  }

  public static void dfs(int sy, int sx, int dy, int dx, boolean black, int count) {
    for (int y = -1; y <= 1; y++) {
      for (int x = -1; x <= 1; x++) {
        if (0 <= y + dy && 0 <= x + dx && dy + y < H && dx + x < W && !visit[dy + y][dx + x]) {
          visit[dy + y][dx + x] = true;
          if (black && S[y + dy][x + dx] == '.') {
            String s = "" + sy + ":" + sx + ":" + (y + dy) + ":" + (x + dx);
            if (!list.contains(s)) {
              list.add(s);
            }
            dfs(sy, sx, y + dy, x + dx, false, count + 1);
          } else if (!black && S[y + dy][x + dx] == '#') {
            dfs(sy, sx, y + dy, x + dx, true, count + 1);
          } else {
            return;
          }
        }
      }
    }
  }
}