import java.util.*;
import java.util.stream.*;

class Main {
  static String[][] field;
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int K = sc.nextInt();
    field = new String[H][W];
    sc.nextLine();
    for (int i = 0; i < H; i++) {
      field[i] = sc.nextLine().split("");
    }
    int ans = 0;
    for (int i = 0; i < (1<<H); i++) {
      for (int j = 0; j < (1<<W); j++) {
        int count = 0;
        for (int h = 0; h < H; h++) {
          for (int w = 0; w < W; w++) {
            if ((1&i >> h) == 1 && (1&j >> w) == 1) {
              if (field[h][w].equals("#")) count++;
            }
          }
        }
        if (count == K) ans++;
      }
    }
    System.out.println(ans);
  }
}