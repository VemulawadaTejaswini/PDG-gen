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
    long a = sc.nextLong();
    long b = sc.nextLong();
    long X = sc.nextLong();

    System.out.println(solve(a, b, X));
  }

  private static long solve(long a, long b, long x) {
    if (a > 0) {
      return b / x - (a - 1) / x;
    } else {
      return b / x + 1;
    }
  }
}
