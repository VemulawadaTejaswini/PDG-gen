import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger ans = BigInteger.ONE;
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      BigInteger next = sc.nextBigInteger();

      if (!ans.equals(BigInteger.valueOf(-1))) {
        if (ans.multiply(next).compareTo(BigInteger.valueOf(1000000000000000000L)) > 0) {
          ans = BigInteger.valueOf(-1);
        } else {
          ans = ans.multiply(next);
        }
      } else {
        if (next.equals(BigInteger.ZERO)) {
          ans = BigInteger.ZERO;
          break;
        }
      }
    }

    System.out.println(ans);
  }
}

