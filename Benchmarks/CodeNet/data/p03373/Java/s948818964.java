import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    System.out.println(solve(a, b, c, x, y));
  }

  private static long solve(int a, int b, int c, int x, int y) {
    if (a + b < c * 2) {
      return x * a + y * b;
    }
    long res;
    if (x < y) {
      res = x * c * 2;
      y = y - x;
      x = 0;
    } else {
      res = y * c * 2;
      x = x - y;
      y = 0;
    }
    if (x == 0) {
      return res + y * Math.min(b, c * 2);
    }
    return res + x * Math.min(a, c *2);
  }
}
