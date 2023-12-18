import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int N = sc.nextInt();
    int[][] ans = new int[H][W];
    int i = 0;
    int j = 0;
    boolean plus = true;
    for (int c = 1; c <= N; c++) {
      int a = sc .nextInt();
      while (a-- > 0) {
        ans[i][j] = c;
        // next
        if (plus) {
          if (j == W-1) {
            i++;
            plus = false;
          } else {
            j++;
          }
        } else {
          if (j == 0) {
            i++;
            plus = true;
          } else {
            j--;
          }
        }
      }
    }
    StringBuilder builder = new StringBuilder();
    for (int q = 0; q < H; q++) {
      for (int r = 0; r < W; r++) {
        builder.append(ans[q][r]);
        if (r == W-1) {
          builder.append('\n');
        } else {
          builder.append(' ');
        }
      }
    }
    System.out.println(builder.toString());
  }
}