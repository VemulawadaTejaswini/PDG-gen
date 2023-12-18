import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[][] a = new int[H][W];
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) a[i][j] = scanner.nextInt();

    List<int[]> operations = new ArrayList<>();

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (a[i][j] % 2 == 1) {
          if (j + 1 < W && a[i][j + 1] % 2 == 1) {
            operations.add(new int[] {i, j, i, j + 1});
            a[i][j]--;
            a[i][j + 1]++;
          } else if (i + 1 < H && a[i + 1][j] % 2 == 1) {
            operations.add(new int[] {i, j, i + 1, j});
            a[i][j]--;
            a[i + 1][j]++;
          } else if (j + 1 < W) {
            operations.add(new int[] {i, j, i, j + 1});
            a[i][j]--;
            a[i][j + 1]++;
          } else if (i + 1 < H) {
            operations.add(new int[] {i, j, i + 1, j});
            a[i][j]--;
            a[i + 1][j]++;
          }
        }
      }
    }

    System.out.println(operations.size());
    for (int[] o : operations)
      System.out.printf("%d %d %d %d\n", o[0] + 1, o[1] + 1, o[2] + 1, o[3] + 1);
  }
}
