import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int h = sc.nextInt();
    int w = sc.nextInt();

    boolean[][] blocked = new boolean[h][w];

    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        if (s.charAt(j) == '#') blocked[i][j] = true;
      }
    }


    int[][] vertConnected = new int[h][w];
    int[][] hrznConnected = new int[h][w];
    // count continuous non-blocked
    for (int i = 0; i < h; i++) {
      int start = 0;
      while (start < w) {
        if (blocked[i][start]) {
          start++;
          continue;
        }
        int end = start + 1;
        while (end < w && !blocked[i][end]) end++;
        for (int j = start; j < end; j++) {
          vertConnected[i][j] = Math.max(vertConnected[i][j], end - start);
        }
        start = end + 1;
      }
    }

    // count continuous non-blocked
    for (int j = 0; j < w; j++) {
      int start = 0;
      while (start < h) {
        if (blocked[start][j]) {
          start++;
          continue;
        }
        int end = start + 1;
        while (end < h && !blocked[end][j]) end++;
        for (int i = start; i < end; i++) {
          hrznConnected[i][j] = Math.max(hrznConnected[i][j], end - start);
        }
        start = end + 1;
      }
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        max = Math.max(max, (vertConnected[i][j] + hrznConnected[i][j]) - 1);
      }
    }
    os.println(max);
  }
}