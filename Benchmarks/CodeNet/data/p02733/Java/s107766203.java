// https://atcoder.jp/contests/abc159/submissions/11141024
// - Broute Force

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int K = sc.nextInt();
    String[] S = new String[H];
    for (int i = 0; i < H; i++) {
      S[i] = sc.next();
    }
    int ans = Integer.MAX_VALUE;
    // 1-split creates 2 groups.
    for (int div = 0; div < 1 << (H - 1); div++) {
      int grp = 0;
      int[] id = new int[H];
      for (int i = 0; i < H; i++) { // Assign each row to a group.
        id[i] = grp;
        if (((div >> i) & 1) == 1) {
          grp++;
        }
      }

      int[][] choco = new int[grp + 1][W]; // Group is [0, grp].
      // Count white-choco in each group per column.
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          choco[id[i]][j] += S[i].charAt(j) - '0';
        }
      }

      int num = grp;
      int[] now = new int[grp + 1];
      for (int col = 0; col < W; col++) {
        if (!add(col, now, choco, K)) {
          num++;
          now = new int[grp + 1];
          if (!add(col, now, choco, K)) {
            num = Integer.MAX_VALUE;
            break;
          }
        }
      }
      ans = Math.min(ans, num);
    }
    System.out.println(ans);
  }

  static boolean add(Integer col, int[] now, int[][] choco, int K) {
    for (int i = 0; i < now.length; i++) now[i] += choco[i][col];
    for (int i = 0; i < now.length; i++) if (now[i] > K) return false;
    return true;
  }
}
