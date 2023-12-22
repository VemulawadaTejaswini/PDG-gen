import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger sum = BigInteger.ONE;
    BigInteger max = BigInteger.valueOf(1000000000000000000L);

    for (int i = 0; i < n; i++) {
      BigInteger a = BigInteger.valueOf(sc.nextLong());
      if (a.equals(BigInteger.ZERO)) {
        sum = BigInteger.ZERO;
        break;
      }
      sum = sum.multiply(a);
    }
    if (sum.compareTo(max) > 0) {
      sum = BigInteger.valueOf(-1);
    }
    System.out.println(sum.compareTo(max) < 0 ? sum : -1);
  }
}