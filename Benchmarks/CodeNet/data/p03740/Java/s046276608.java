import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long X = scanner.nextLong();
    long Y = scanner.nextLong();

    if(solve(X, Y)) {
      System.out.println("Alice");
    } else {
      System.out.println("Brown");
    }
  }

  private static boolean solve(long x, long y) {
    if (x > y) return solve(y, x);
    if ((y - x) % 3 == 0) {
      return (y - x) != 0;
    }
    return (y - x) != 1;
  }
}
