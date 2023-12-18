import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    // dp1[i][j]は左からi個までで和をjに出来るかどうかを表す。
    boolean[][] dp1 = new boolean[N + 1][K + 1];
    dp1[0][0] = true;
    for(int i = 1; i < N + 1; i++) {
      for(int j = 0; j < K + 1; j++) {
        if(a[i - 1] <= j) {
          dp1[i][j] = dp1[i - 1][j] || dp1[i - 1][j - a[i - 1]];
        } else {
          dp1[i][j] = dp1[i - 1][j];
        }
      }
    }
    // dp2[i][j]は右からi個までで和をjに出来るかどうかを表す。
    boolean[][] dp2 = new boolean[N + 1][K + 1];
    dp2[0][0] = true;
    // sum[i][j]は右からi個までで和を0～jの内何個作れるかを表す。
    int[][] sum = new int[N + 1][K + 1];
    for(int j = 0; j < K + 1; j++) {
      sum[0][j] = 1;
    }
    for(int i = 1; i < N + 1; i++) {
      for(int j = 0; j < K + 1; j++) {
        if(a[N - i] <= j) {
          dp2[i][j] = dp2[i - 1][j] || dp2[i - 1][j - a[N - i]];
        } else {
          dp2[i][j] = dp2[i - 1][j];
        }
        sum[i][0] = 1;
        if(j > 0) {
          if(dp2[i][j]) {
            sum[i][j] = sum[i][j - 1] + 1;
          } else {
            sum[i][j] = sum[i][j - 1];
          }
        }
      }
    }
    int ans = 0;
    for(int i = 0; i < N; i++) {
      int count = 0;
      for(int j = 0; j < K; j++) {
        if(K - a[i] - j - 1 >= 0) {
          if(dp1[i][j] && (sum[N - 1 - i][K - j - 1] > sum[N - 1 - i][K - a[i] - j - 1])) {
            count++;
            break;
          }
        } else {
          if(dp1[i][j] && (sum[N - 1 - i][K - j - 1] > 0)) {
            count++;
            break;
          }
        }
      }
      if(count > 0) ans++;
    }
    System.out.println(N - ans);
  }
}