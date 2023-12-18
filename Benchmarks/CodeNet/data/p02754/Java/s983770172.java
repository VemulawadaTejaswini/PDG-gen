import java.util.Scanner;
import java.math.BigInteger;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = sc.nextBigInteger(); 
    BigInteger b = sc.nextBigInteger(); 
    BigInteger r = sc.nextBigInteger();
    sc.close();
    if(b.equals(new BigInteger("0"))) {
      System.out.println("0");
    } else {
      BigInteger den = b.add(r);
      BigInteger x = b.multiply(n.divide(den));
      BigInteger y = n.mod(den);
      BigInteger z = y.subtract(r);
      System.out.println(x.add(z));
    }
  }
}
