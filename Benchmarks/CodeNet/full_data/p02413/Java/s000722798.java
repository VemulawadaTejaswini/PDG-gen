import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r, c;

    r = sc.nextInt();
    c = sc.nextInt();

    int[][] ans = new int[r + 1][c + 1];
    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++)
        ans[i][j] = sc.nextInt();

    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++)
        ans[i][c] += ans[i][j];

    for (int i = 0; i < c; i++) {
      for (int j = 0; j < r; j++) {
        ans[r][i] += ans[j][i];
      }
      ans[r][c] += ans[r][i];
    }

    System.out.println();
    for (int i = 0; i < r + 1; i++) {
      for (int j = 0; j < c + 1; j++) {
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }
  }
}