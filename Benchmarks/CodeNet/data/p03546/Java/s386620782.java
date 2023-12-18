import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[][] C = new int[10][10];
    for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) C[i][j] = scanner.nextInt();
    for (int k = 0; k < 10; k++) {
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          C[i][j] = Math.min(C[i][j], C[i][k] + C[k][j]);
        }
      }
    }

    long res = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int a = scanner.nextInt();
        if (a >= 0) {
          res += C[a][1];
        }
      }
    }
    System.out.println(res);
  }
}
