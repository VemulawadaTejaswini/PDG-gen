import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    long d = sc.nextInt();

    BigInteger ac = BigInteger.valueOf(a * c);
    BigInteger ad = BigInteger.valueOf(a * d);
    BigInteger bc = BigInteger.valueOf(b * c);
    BigInteger bd = BigInteger.valueOf(b * d);

    System.out.println(ac.max(ad).max(bc).max(bd));
  }
}
