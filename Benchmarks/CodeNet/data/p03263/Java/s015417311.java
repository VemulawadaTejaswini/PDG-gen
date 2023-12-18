import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[][] a = new int[H][W];
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) a[i][j] = scanner.nextInt();

    final StringBuilder sb = new StringBuilder();
    int size = 0;

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (a[i][j] % 2 == 1) {
          if (j + 1 < W && a[i][j + 1] % 2 == 1) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i, j, i, j + 1));
            a[i][j]--;
            a[i][j + 1]++;
          } else if (i + 1 < H && a[i + 1][j] % 2 == 1) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i, j, i + 1, j));
            a[i][j]--;
            a[i + 1][j]++;
          } else if (j + 1 < W) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i, j, i, j + 1));
            a[i][j]--;
            a[i][j + 1]++;
          } else if (i + 1 < H) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i, j, i + 1, j));
            a[i][j]--;
            a[i + 1][j]++;
          }
        }
      }
    }

    for (int i = 0; i < H * W - 1; i++) {
      int y = i / W;
      int x = y % 2 == 0 ? i - y * W : (y + 1) * W - i - 1;
      if (a[y][x] % 2 == 1) {
        int ny = (i + 1) / W;
        int nx = ny % 2 == 0 ? (i + 1) - ny * W : (ny + 1) * W - i - 2;
        a[ny][nx]++;
      }
    }

    System.out.println(size);
    System.out.print(sb.toString());
  }
}
