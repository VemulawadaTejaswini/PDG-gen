import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int r = in.nextInt();
    int c = in.nextInt();
    int[][] spread = new int[r + 1][c + 1];

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        spread[i][j] = in.nextInt();
        spread[i][c] += spread[i][j];
      }
    }
    for (int i = 0; i < c + 1; i++) {
      for (int j = 0; j < r; j++) {
        spread[r][i] += spread[j][i];
      }
    }
    for (int i = 0; i < r + 1; i++) {
      System.out.print(spread[i][0]);
      for (int j = 1; j < c + 1; j++) {
        System.out.print(" " + spread[i][j]);
      }
      System.out.println();
    }
  }
}