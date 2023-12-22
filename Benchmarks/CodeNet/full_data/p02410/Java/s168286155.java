import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int m = stdin.nextInt();

    int[][] A = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        A[i][j] = stdin.nextInt();
      }
    }

    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = stdin.nextInt();
    }

    for (int i = 0; i < n; i++) {
      int c = 0;
      for (int j = 0; j < m; j++) {
        c += A[i][j] * b[j];
      }
      System.out.println(c);
    }
  }

}