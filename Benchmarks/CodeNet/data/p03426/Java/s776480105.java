import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();
    int D = sc.nextInt();
    int[] x = new int[H*W+1];
    int[] y = new int[H*W+1];

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int tmp = sc.nextInt();
        x[tmp] = i;
        y[tmp] = j;
      }
    }

    int Q = sc.nextInt();
    int[] L = new int[Q];
    int[] R = new int[Q];

    for (int i = 0; i < Q; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }

    for (int i = 0; i < Q; i++) {
      int l = L[i];
      int r = R[i];
      int ans = 0;
      int prev_x = x[l];
      int prev_y = y[l];

      for (int j = l; j <= r; j = j+D) {
        ans += Math.abs(x[j] - prev_x) + Math.abs(y[j] - prev_y);
        prev_x = x[j];
        prev_y = y[j];
      }

      System.out.println(ans);
    }
  }
}
