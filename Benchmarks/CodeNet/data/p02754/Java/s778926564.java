import java.util.Scanner;
import java.math.BigInteger; 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(sc.nextChar());
    BigInteger b = new BigInteger(sc.nextChar());
    BigInteger r = new BigInteger(sc.nextChar());
    BigInteger x = new BigInteger("0");
    if(b == 0) {
      System.out.println(x);
    } else {
      x = n-r;
      System.out.println(x);
    }
  }
}
