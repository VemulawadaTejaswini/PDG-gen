import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), K = sc.nextInt();
    int[] H = new int[N+2];
    for (int i = 0; i < N; i++) {
      H[i+1] = sc.nextInt();
    }
    H[0] = H[N+1] = 0;
    long INF = 300*(long)1e9;
    long[][] DP = new long[N+2][K+1];
    for (int k = 0; k <= K; k++) {
      DP[0][k] = 0;
    }
    for (int i = 1; i <= N+1; ++i) {
      for (int k = 0; k <= K; k++) {
        DP[i][k] = INF;
        for (int j = 0; j <= Math.min(i - 1, k); j++) {
          DP[i][k] = Math.min(DP[i][k], DP[i - j - 1][k - j] + Math.max(0, H[i] - H[i - j - 1]));
        }
      }
    }
    System.out.println(DP[N+1][K]);
  }
}
