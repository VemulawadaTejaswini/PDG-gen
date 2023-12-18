import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] p = new int[n];
    int ans = 0;

    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }

    for (int i = 0; i < (n - 2); i++) {
      if (p[i + 1] == med(p[i], p[i + 1], p[i + 2])) {
        ans++;
      }
    }

    System.out.println(ans);

  }

  // 3数の中央値を求めるメソッド
  static int med(int a, int b, int c) {
    if (a >= b) {
      if (b >= c) {
        return b;
      } else if (a <= c) {
        return a;
      } else {
        return c;
      }
    } else if (a > c) {
      return a;
    } else if (b > c) {
      return c;
    } else {
      return b;
    }
  }

}