import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    int[][] color = new int[H][W];
    int c = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int k = j;
        if (i % 2 != 0) k = W - j - 1;
        if (a[c] == 0) c++;
        color[i][k] = c + 1;
        a[c]--;
      }
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(color[i][j]);
      }
      System.out.println();
    }
  }
}
