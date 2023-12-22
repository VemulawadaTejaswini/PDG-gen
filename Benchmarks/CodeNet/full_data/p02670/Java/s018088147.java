import java.util.Scanner;

public class Main {

  static String isSolved = "No";
  static int N = 0;
  static int H = 0;
  static int W = 0;
  static char[][] maze;
  static boolean[][] reached;
  static int cnt = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    H = N;
    W = N;

    maze = new char[H][W];
    reached = new boolean[H][W];
    int[] start = new int[2];

    int num = 1;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        maze[i][j] = (char) num;
        num++;
      }
    }

    for (int k = 0; k < N * N; k++) {
      char P = (char) sc.nextInt();
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (P == maze[i][j]) {
            start[0] = i;
            start[1] = j;
          }
        }
      }
      isSolved = "No";
      maze[start[0]][start[1]] = 'a'; // aはすでに抜けた後
      solve(start[0], start[1], maze);

      if (isSolved.equals("No")) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }

  private static void solve(int y, int x, char[][] maze) {

    if (y < 0 || y >= H || x < 0 || x >= W) {
      isSolved = "Yes";
      return;
    }
    if (maze[y][x] != 'a') return;
    if (reached[y][x]) return;

    reached[y][x] = true;

    solve(y + 1, x, maze);
    solve(y - 1, x, maze);
    solve(y, x - 1, maze);
    solve(y, x + 1, maze);

    return;
  }
}
