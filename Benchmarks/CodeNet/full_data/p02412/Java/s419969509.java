import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x;

    for (int i = 0;; i++) {
      n = sc.nextInt();
      x = sc.nextInt();
      if (n == 0 && x == 0) break;
      func(n, x);
    }

    sc.close();
  }

  private static void func(int n, int x) {// 1~n から3つ足して x を作るパターン数
    int ans = 0;
    if (x > 5 && x < 3*n - 2) {// x_min = 1+2+3 = 6, x_max = n+(n-1)+(n-2) = 3n-3
      for (int i = 1; i <= n; i++) {
        for (int j = i + 1; j <= n; j++) {
          for (int k = j + 1; k <= n; k++) {
            if (i + j + k == x) {
              ans++;
              break;
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
}

