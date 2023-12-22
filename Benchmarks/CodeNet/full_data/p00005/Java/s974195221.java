import java.util.Scanner;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      BigInteger bda = new BigInteger(sc.nextDouble());
      BigInteger bdb = new BigInteger(sc.nextDouble());
      BigInteger gcd = bda.gcd(bdb);
      BigInteger lcm = bda.multyply(bdb).divide(gcd);
      System.out.println(gcd+" "+lcm);
    }
  }
}