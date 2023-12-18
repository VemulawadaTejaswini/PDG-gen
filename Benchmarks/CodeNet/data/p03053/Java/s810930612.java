import java.util.Scanner;

class Main {

  public static final Integer[] di = { 1, -1, 0, 0 };
  public static final Integer[] dj = { 0, 0, 1, -1 };

  public static boolean isOK(boolean[][] isBlack, int H, int W) {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (!isBlack[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void fill(boolean[][] isBlack, int H, int W) {
    boolean[][] sub = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      sub[i] = isBlack[i].clone();
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (sub[i][j]) {
          for (int k = 0; k < 4; k++) {
            int ci = i + di[k];
            int cj = j + dj[k];
            if (0 <= ci && ci < H && 0 <= cj && cj < W) {
              isBlack[ci][cj] = true;
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    boolean[][] isBlack = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      String ooooooooo = scanner.next();
      for (int j = 0; j < W; j++) {
        isBlack[i][j] = ooooooooo.charAt(j) == '#';
      }
    }
    int ans = 0;
    while (!isOK(isBlack, H, W)) {
      ans++;
      fill(isBlack, H, W);
    }
    System.out.println(ans);
  }

}
