import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] f = new char[H][W];
    for (int i = 0; i < H; i++) {
      f[i] = sc.next().toCharArray();
    }
    int cr = 0;
    int cc = 0;
    while (true) {
      boolean right = cc < W - 1 && f[cr][cc + 1] == '#';
      boolean bottom = cr < H - 1 && f[cr + 1][cc] == '#';
      boolean left = cc > 0 && f[cr][cc - 1] == '#';
      boolean up = cr > 0 && f[cr - 1][cc] == '#';
      if (right == bottom || left || up) {
        System.out.println("Impossible");
        return;
      }
      if (cr == H - 1 && cc == W - 1) break;
      f[cr][cc] = '.';
      if (right) {
        ++cc;
      } else {
        ++cr;
      }
    }
    System.out.println("Possible");
  }

}
