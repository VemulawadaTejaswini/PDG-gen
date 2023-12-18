import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    long K = scanner.nextLong();
    long[][] a = new long[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    long[][] b = matpow(a, K, M);
    long res = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        res += b[i][j];
        if (res > M) res -= M;
      }
    }
    System.out.println(res);
  }

  private static long[][] matpow(long[][] a, long n, long M) {
    if (n == 1) return a;
    if (n % 2 == 1) {
      return matmult(matpow(a, n - 1, M), a, M);
    } else {
      long[][] b = matpow(a, n / 2, M);
      return matmult(b, b, M);
    }
  }

  private static long[][] matmult(long[][] a, long[][] b, long M) {
    int n = a.length;
    long[][] res = new long[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          res[i][j] += (a[i][k] * b[k][j]) % M;
          if (res[i][j] > M) res[i][j] -= M;
        }
      }
    }
    return res;
  }
}
