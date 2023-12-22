import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.equals("0")) {
        break;
      }
      int n = Integer.parseInt(line);
      int p1 = 0;
      int p2 = 0;
      for (int ii = n; ii > 1; ii--) {
        BigInteger a = new BigInteger(String.format("%d", ii));
        if (!a.isProbablePrime(1)) {
          continue;
        }
        p2 = p1;
        p1 = ii;
        if (p2 - p1 == 2) {
          System.out.println(p2 + " " + p1);
          break;
        }
      }
    }
  }
}