import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    try {

      // 標準入力受け取り
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> strs = new ArrayList<Integer>();

      while (scan.hasNext()) {
        strs.add(scan.nextInt());
      }

      // 変数へ代入
      int[][] bingo = new int[3][3]; // ビンゴ表

      String jadge = "No"; // 判定

      for (int x = 0; x < 9; x++) {
        for (int y = 10; y < strs.size(); y++) {
          bingo[x / 3][x % 3] = 0;
          // 穴が開いた場合
          if (strs.get(x) == strs.get(y)) {
            bingo[x / 3][x % 3] = 1;
            break;
          }
        }
      }

      int[] verticalSum = new int[3]; // 縦のチェック値
      int sideSum = 0; // 横のチェック値
      int upperRight = 0; // 斜め(左下から右上)のチェック値
      int lowerRight = 0; // 斜め(左上から右下)のチェック値

      // ビンゴ有無チェック
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

          verticalSum[j] += bingo[i][j];
          sideSum += bingo[i][j];
          // 縦・横のビンゴチェック
          if (sideSum == 3 || verticalSum[j] == 3) {

            jadge = "Yes";
            System.out.println(jadge);
            return;
          }
        }

        upperRight += bingo[i][i];
        lowerRight += bingo[i][2 - i];
        // 斜めのビンゴチェック
        if (upperRight == 3 || lowerRight == 3) {

          jadge = "Yes";
          System.out.println(jadge);
          return;
        }
        // 横のチェック値をリセット
        sideSum = 0;
      }

      System.out.println(jadge);
    } catch (Exception e) {

      System.out.println("error");
    }
  }
}