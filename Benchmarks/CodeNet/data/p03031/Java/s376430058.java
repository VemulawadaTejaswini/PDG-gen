import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    int[][] s = new int[M][];
    for (int k = 0; k < M; k++) {
      s[k] = new int[in.nextInt()];
      for (int i = 0; i < s[k].length; i++) {
        s[k][i] = in.nextInt() - 1;
      }
    }
    int[] p = new int[M];
    for (int i = 0; i < M; i++) {
      p[i] = in.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < Math.pow(2, N); i++) {
      int t = i;
      boolean[] on = new boolean[N];
      for (int j = 0; j < N; j++) {
        on[j] = t % 2 == 1;
        t /= 2;
      }
      boolean all = true;
      for (int k = 0; k < M; k++) {
        int cnt = 0;
        for (int j = 0; j < s[k].length; j++) {
          if (on[s[k][j]]) {
            cnt++;
          }
        }
        if (cnt % 2 != p[k]) {
          all = false;
        }
      }
      if (all) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}