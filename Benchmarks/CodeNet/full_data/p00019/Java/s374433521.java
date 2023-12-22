import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(fact(n));
  }

  private static int fact (int n) {
    if (n == 1) {
      return 1;
    }
    return n * fact (n - 1);
  }
}