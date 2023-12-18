
import java.math.BigInteger;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BigInteger n = new BigInteger(scan.next());
    BigInteger a = new BigInteger(scan.next());
    BigInteger b = new BigInteger(scan.next());

    if(a.equals(b)){
      System.out.println(0);
      return;
    }
    BigInteger x = (b.subtract(a)).abs().divide(new BigInteger("2"));
    if(x.equals(BigInteger.ZERO)){
        x = n;
    }
    BigInteger y = (a.subtract(BigInteger.ONE)).max(b.subtract(BigInteger.ONE));
    BigInteger z = (n.subtract(a)).max(n.subtract(b));
    System.out.println(x.min(y.min(z)).toString());
  }
}
