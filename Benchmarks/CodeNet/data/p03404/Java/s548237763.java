import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt() - 1;
    int B = scanner.nextInt() - 1;
    int H = 100;
    int W = 100;
    char[][] map = new char[H][W];
    for (int i = 0; i < H / 2; i++) Arrays.fill(map[i], '.');
    for (int i = H / 2; i < H; i++) Arrays.fill(map[i], '#');

    for (int i = 0; i < B; i++) {
      int x = i / (W / 2) * 2;
      int y = i % (W / 2) * 2;
      map[x][y] = '#';
    }
    for (int i = 0; i < A; i++) {
      int x = i / (W / 2) * 2 + H / 2 + 1;
      int y = i % (W / 2) * 2;
      map[x][y] = '.';
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) sb.append(map[i][j]);
      sb.append('\n');
    }
    System.out.printf("%d %d\n", H, W);
    System.out.print(sb.toString());
  }
}
