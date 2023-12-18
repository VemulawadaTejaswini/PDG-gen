import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      System.out.println(solve(a, b));
    }
  }

  private static long solve(double a, double b) {
    if (a > b) return solve(b, a);

    long i = (long) Math.floor(Math.sqrt(a * b - 1));
    long j = (long) Math.floor((a * b - 1) / i);

    long res = i * 2;
    if (i == j) res--;
    if (i >= a) res--;

    return res;
  }
}
