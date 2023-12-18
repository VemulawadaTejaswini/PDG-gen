import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int C = scanner.nextInt();
    int[][] D = new int[C][C];
    for (int i = 0; i < C; i++) {
      for (int j = 0; j < C; j++) {
        D[i][j] = scanner.nextInt();
      }
    }

    int[][] c  = new int[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) c[i][j] = scanner.nextInt() - 1;

    int[][] sum = new int[3][C];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < C; j++) {
        for (int x = 0; x < N; x++) {
          for (int y = 0; y < N; y++) {
            if ((x + y) % 3 == i) {
              sum[i][j] += D[c[x][y]][j];
            }
          }
        }
      }
    }

    int min = 1_000_000_000;
    for (int i = 0; i < C; i++) {
      for (int j = 0; j < C; j++) {
        for (int k = 0; k < C; k++) {
          if (i == j || j == k || i == k) continue;
          min = Math.min(min, sum[0][i] + sum[1][j] + sum[2][k]);
        }
      }
    }
    System.out.println(min);
  }
}
