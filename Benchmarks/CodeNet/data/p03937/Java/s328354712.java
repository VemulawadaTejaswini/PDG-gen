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
    while (cr < H - 1 || cc < W - 1) {
      boolean right = cc < W - 1 && f[cr][cc + 1] == '#';
      boolean bottom = cr < H - 1 && f[cr + 1][cc] == '#';
      if (right == bottom) {
        System.out.println("Impossible");
        return;
      }
      if (right) {
        ++cc;
      } else {
        ++cr;
      }
    }
    System.out.println("Possible");
  }

}
