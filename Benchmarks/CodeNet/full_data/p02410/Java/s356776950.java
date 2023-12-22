import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int[][] A = new int[n][m];
    for(int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        A[i][j] = s.nextInt();
      }
    }
    int[] b = new int[m];
    for(int j = 0; j < m; j++) {
      b[j] = s.nextInt();
    }
    for(int i = 0; i < n; i++) {
      int c = 0;
      for (int j = 0; j < m; j++) {
        c += A[i][j] * b[j];
      }
      System.out.println(c);
    }
  }
}
