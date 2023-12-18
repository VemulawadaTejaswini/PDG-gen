import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[][] c = new int[3][3];
    int maxind = 0;
    int max = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = sc.nextInt();
      }
    }

    while (true) {
      max = 0;
      maxind = 0;
      boolean ok = true;
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (max < c[i][j]) {
            max = c[i][j];
            maxind = i;
          }
        }
      }

      for (int j = 0; j < 3; j++) {
        c[maxind][j] = Math.max(c[maxind][j] - 1, 0);
      }

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (c[i][j] != 0) {
            ok = false;
            break;
          }
        }
      }

      if (ok) {
        System.out.println("No");
        return;
      }

      if (Arrays.equals(c[0], c[1]) && Arrays.equals(c[1], c[2])) {
        System.out.println("Yes");
        return;
      }

    }

  }
}