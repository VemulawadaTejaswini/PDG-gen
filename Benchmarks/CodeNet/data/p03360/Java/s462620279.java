import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int k = scanner.nextInt();
    solve(a, b, c, k);
  }

  static void solve(int a, int b, int c, int k) {
    int a1 = a;
    int b1 = b;
    int c1 = c;
    int res = 0;
    for (int i = 0; i < k; i++) {
      a1 *= 2;
    }
    res = Math.max(res, a1 + b1 + c1);
    a1 = a;
    b1 = b;
    c1 = c;
    for (int i = 0; i < k; i++) {
      b1 *= 2;
    }
    res = Math.max(res, a1 + b1 + c1);
    a1 = a;
    b1 = b;
    c1 = c;
    for (int i = 0; i < k; i++) {
      c1 *= 2;
    }
    res = Math.max(res, a1 + b1 + c1);
    System.out.println(res);
  }

}