import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int K = sc.nextInt();
    sc.close();

    int L = N.length();

    int[][] dp0 = new int[L + 1][K + 1];
    int[][] dp1 = new int[L + 1][K + 1];
    dp0[0][0] = 1;

    for (int i = 0; i < L; i++) {
      int d = N.charAt(i) - '0';
      for (int j = 0; j <= i && j < K + 1; j++) {
        if (d == 0) {
          dp0[i + 1][j] += dp0[i][j];
        }
        if (j < K) {
          dp0[i + 1][j + 1] += dp0[i][j] * 1;
        }

        if (d != 0) {
          dp1[i + 1][j] += dp0[i][j];
        }
        dp1[i + 1][j] += dp1[i][j];
        if (j < K) {
          dp1[i + 1][j + 1] += dp0[i][j] * (d - 1);
          dp1[i + 1][j + 1] += dp1[i][j] * 9;
        }
      }
    }

    long ans = dp0[L][K] + dp1[L][K];
    System.out.println(ans);
  }
}
