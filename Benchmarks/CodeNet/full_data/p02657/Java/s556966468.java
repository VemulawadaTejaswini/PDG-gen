import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;
public class Main {
  public static void main(String[] args){
    new Main().run();
  }
  void run() {
    Scanner sc = new Scanner(System.in);
    BigDecimal A = new BigDecimal(sc.nextDouble());
    BigDecimal B = new BigDecimal(sc.nextDouble());
    String ans = A.multiply(B).toPlainString();
    System.out.println(ans.replaceFirst("\\..*$", ""));
  }
}
