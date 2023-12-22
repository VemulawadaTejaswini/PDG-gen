import java.util.Scanner;

class Main {
  public static final int INF = 999999999;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int time = sc.nextInt();
    int[] p = new int[time+1];
    p[0] = sc.nextInt();
    for (int i = 1; i < time; i++) {
      p[i] = sc.nextInt();
      sc.nextInt();
    }
    p[time] = sc.nextInt();
    System.out.println(matrixChainOrder(p));
  }

  public static int matrixChainOrder(int[] p) {
    int n = p.length - 1;
    int[][] m = new int[n+1][n+1];

    for (int i = 1; i <= n; i++) {
      m[i][i] = 0;
    }

    for (int l = 2; l <= n; l++) {
      for (int i = 1; i <= n - l + 1; i++) {
        int j = i + l - 1;
        m[i][j] = INF;

        for (int k = i; k <= j - 1; k++) {
          int q = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j];
          if (q < m[i][j]) {
            m[i][j] = q;
          }
        }
      }
    }

    return m[1][n];
  }
}

