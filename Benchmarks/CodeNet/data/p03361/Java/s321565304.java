import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int s[][] = new int[H + 2][W + 2];
    for (int i = 1; i < H; i++) {
      String line = sc.next();
      for (int j = 1; j < W; j++) {
        if (line.charAt(j) == '.')
          s[i][j] = 0;
        else
          s[i][j] = 1;
      }
    }
    for (int i = 1; i < H; i++) {
      for (int j = 1; j < W; j++) {
        if (s[i][j] != 1) {
          continue;
        } else {
          if (s[i][j - 1] == 1 || s[i][j + 1] == 1 || s[i - 1][j] == 1 || s[i + 1][j] == 1) {
            continue;
          } else {
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
  }
}