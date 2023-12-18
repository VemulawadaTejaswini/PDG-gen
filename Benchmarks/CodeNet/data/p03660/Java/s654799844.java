import java.util.*;
class Main {
  static int N;
  static boolean[][] neighbors;

  static int saiki(int turn, int[] locations, int color, int[] masu) {
    int[] loc = (int[])locations.clone();
    int here = locations[color];
    int maxturn = turn;
    turn++;
    for (int i = 0; i < N; i++) {
      if (neighbors[here][i] && masu[i] == -1) {
        loc[color] = i;
        int[] cur = (int[])masu.clone();
        cur[i] = color;
        maxturn = Math.max(maxturn, saiki(turn, loc, 1-color, cur));
      }
    }
    return maxturn;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    neighbors = new boolean[N][N];
    for (int i = 0; i < N-1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      neighbors[a][b] = true;
      neighbors[b][a] = true;
    }

    int[] masu = new int[N];
    Arrays.fill(masu, -1);
    masu[0]   = 0;
    masu[N-1] = 1;

    if (saiki(0, new int[]{0,N-1}, 0, masu) % 2 == 0)
      System.out.println("Snuke");
    else
      System.out.println("Fennec");
  }
}