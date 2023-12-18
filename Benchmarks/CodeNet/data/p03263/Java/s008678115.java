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

    for (int i = 0; i < H * W - 1; i++) {
      int y = i / W;
      int x = y % 2 == 0 ? i - y * W : (y + 1) * W - i - 1;
      if (a[y][x] % 2 == 1) {
        int ny = (i + 1) / W;
        int nx = ny % 2 == 0 ? (i + 1) - ny * W : (ny + 1) * W - i - 2;
        a[ny][nx]++;
        operations.add(new int[]{y + 1, x + 1, ny + 1, nx + 1});
      }
    }

    System.out.println(operations.size());
    for (int[] o : operations) {
      System.out.printf("%d %d %d %d\n", o[0], o[1], o[2], o[3]);
    }
  }
}
