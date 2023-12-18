import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(sc.nextInt().toString());
    BigInteger b = new BigInteger(sc.nextInt().toString());
    BigInteger r = new BigInteger(sc.nextInt().toString());
    BigInteger x = new BigInteger("0");
    if(b == 0) {
      System.out.println(x);
    } else {
      x = n-r;
      System.out.println(x);
    }
  }
}
