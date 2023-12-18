package atcoder;

import java.util.Scanner;

/** https://atcoder.jp/contests/abc048/tasks/abc048_b */
public class Main {

  /**
   * メインメソッド
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int X = sc.nextInt();

    System.out.println(solve(a, b, X));
  }

  private static int solve(int a, int b, int x) {
    if (a != 0) {
      return b / x - (a - 1) / x;
    } else {
      return b / x;
    }
  }
}
