import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();
    int l = in.nextInt();
    int[][] a = new int[n][m];
    int[][] b = new int[m][l];
    int[][] c = new int[n][l];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = in.nextInt();
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < l; j++) {
        b[i][j] = in.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < l; j++) {
        for (int k = 0; k < m; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(c[i][0]);
      for (int j = 1; j < l; j++) {
        System.out.print(" " + c[i][j]);
      }
      System.out.println();
    }
  }
}