import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      int p = 0;
      for (int ii = 1; ii <= n; ii++) {
        if (isPrime(ii)) {
          p++;
        }
      }
      out += p + "\n";
    }
    System.out.print(out);
  }

  private static boolean isPrime (int n) {
    if (n == 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    if (n % 2 == 0) {
      return false;
    }
    for (int ii = 3; ii * ii <= n; ii += 2) {
      if (n % ii == 0) {
        return false;
      }
    }
    return true;
  }
}