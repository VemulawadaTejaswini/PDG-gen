import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    char[][] f = new char[N * 2][N * 2];
    for (int i = 0; i < N; i++) {
      char[] row = sc.next().toCharArray();
      for (int j = 0; j < N; j++) {
        f[i][j] = f[i + N][j] = f[i][j + N] = f[i + N][j + N] = row[j];
      }
    }
    boolean[][] a = new boolean[2 * N][2 * N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        boolean ok = true;
        for (int k = 1; k < N; k++) {
          ok &= f[i][j + k] == f[i + k][j];
        }
        a[i][j] = a[i][j + N] = a[i + N][j] = a[i + N][j + N] = ok;
      }
    }
    int ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        boolean ok = true;
        for (int k = 0; k < N; k++) {
          ok &= a[i + k][j + k];
        }
        if (ok) ++ans;
      }
    }
    System.out.println(ans);
  }

}
