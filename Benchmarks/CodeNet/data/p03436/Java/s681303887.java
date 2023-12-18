import java.util.*;

public class Main {

  public static int INF = 10000000;
  public static int H;
  public static int W;
  public static String[][] maze;
  public static int[][] d;
  public static int[] dx = {1, 0, -1, 0};
  public static int[] dy = {0, 1, 0, -1};

  public static class P {
    public int first;
    public int second;
    public P (int first, int second) {
      this.first = first;
      this.second = second;
    }
  }

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    H = sc.nextInt();
    W = sc.nextInt();

    maze = new String[H][W];

    for (int i = 0; i < H; i++) {
      String s_ = sc.next();
      maze[i] = s_.split("");
    }

    sc.close();

    d = new int[H][W];

    for (int i = 0; i < H; i++) {
      Arrays.fill(d[i], INF);
    }

    int result = bfs() + 1;

    int countBlack = 0;

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (maze[i][j].equals("#")) {
          countBlack++;
        }
      }
    }

    System.out.println(H*W - countBlack - result);

  }

  public static int bfs() {

    Queue<P> que = new ArrayDeque<>();

    que.add(new P(0, 0));
    d[0][0] = 0;

    while (!que.isEmpty()) {
      
      P p = que.poll();
      
      if ((p.first == H - 1) && (p.second == W - 1)) {
        break;
      }

      for (int i = 0; i < 4; i++) {
        
        int nFirst = p.first + dx[i];
        int nSecond = p.second + dy[i];

        if (0 <= nFirst && nFirst < H && 0 <= nSecond && nSecond < W && !(maze[nFirst][nSecond].equals("#")) && d[nFirst][nSecond] == INF) {
          que.add(new P(nFirst, nSecond));
          d[nFirst][nSecond] = d[p.first][p.second] + 1;
        }

      }

    }

    return d[H-1][W-1];

  }

}