import java.math.BigDecimal;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r, pi = 3.141592653589;
    r = sc.nextDouble();
    BigDecimal br = new BigDecimal(r);
    BigDecimal bpi = new BigDecimal(pi);
    BigDecimal bs = bpi.multiply(br.multiply(br));
    BigDecimal bl = bpi.multiply(br.multiply(2.0));
    System.out.println(bs + " " + bl);
  }
}