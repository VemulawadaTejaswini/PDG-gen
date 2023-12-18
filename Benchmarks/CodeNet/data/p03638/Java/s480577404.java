import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[][] color = new int[H][W];
    int N = scanner.nextInt();
    int i = 0;
    for (int c = 1; c <= N; c++) {
      int a = scanner.nextInt();
      for (int j = 0; j < a; j++) {
        int y = i / W;
        int r = i % W;
        int x = y % 2 == 0 ? r : W - r - 1;
        color[y][x] = c;
        i++;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int y = 0; y < H; y++) {
      for (int x = 0; x < W; x++) {
        sb.append(color[y][x]);
        if (x < W - 1) sb.append(' ');
      }
      sb.append('\n');
    }
    System.out.println(sb.toString());
  }
}
