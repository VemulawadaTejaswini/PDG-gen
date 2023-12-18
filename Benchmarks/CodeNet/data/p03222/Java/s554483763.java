import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int K = scanner.nextInt();
    final int M = 1_000_000_007;

    int[] fib = new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34};
    long[][] d = new long[H + 1][W + 1];
    d[0][1] = 1;
    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        d[i][j] =    d[i - 1][j]     * fib[j - 1] * fib[W - j] % M;
        if(j > 1) {
          d[i][j] += d[i - 1][j - 1] * fib[j - 2] * fib[W - j] % M;
          d[i][j] %= M;
        }
        if(j < W) {
          d[i][j] += d[i - 1][j + 1] * fib[j - 1] * fib[W - j - 1] % M;
          d[i][j] %= M;
        }
      }
    }
    System.out.println(d[H][K]);
  }
}
