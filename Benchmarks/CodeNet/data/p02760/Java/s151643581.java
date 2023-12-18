import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);

  private void run() {
    int[][] card = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        card[i][j] = Integer.parseInt(sc.next());
      }
    }

    int N = Integer.parseInt(sc.next());
    boolean[][] bingo = new boolean[3][3];
    for (int i = 0; i < N; i++) {
      int number = Integer.parseInt(sc.next());
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (card[j][k] == number) {
            bingo[j][k] = true;
          }
        }
      }
    }

    if (bingo[0][0] && bingo[0][1] && bingo[0][2]) {
      System.out.println("Yes");
    } else if (bingo[1][0] && bingo[1][1] && bingo[1][2]) {
      System.out.println("Yes");
    } else if (bingo[2][0] && bingo[2][1] && bingo[2][2]) {
      System.out.println("Yes");
    } else if (bingo[0][0] && bingo[1][0] && bingo[2][0]) {
      System.out.println("Yes");
    } else if (bingo[0][1] && bingo[1][1] && bingo[2][1]) {
      System.out.println("Yes");
    } else if (bingo[0][2] && bingo[1][2] && bingo[2][2]) {
      System.out.println("Yes");
    } else if (bingo[0][0] && bingo[1][1] && bingo[2][2]) {
      System.out.println("Yes");
    } else if (bingo[0][2] && bingo[1][1] && bingo[2][0]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
