import java.util.Scanner;
import java.math.BigDecimal;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      BigDecimal bda = new BigDecimal(sc.nextDouble());
      BigDecimal bdb = new BigDecimal(sc.nextDouble());
      BigDecimal gcd = bda.gcd(bdb);
      BigDecimal lcm = bda.multyply(bdb).divide(gcd);
      System.out.println(gcd+" "+lcm);
    }
  }
}