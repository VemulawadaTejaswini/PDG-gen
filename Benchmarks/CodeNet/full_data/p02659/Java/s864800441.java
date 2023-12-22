import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      BigDecimal A = new BigDecimal(sc.nextDouble());
      BigDecimal B = new BigDecimal(sc.nextDouble());
      BigDecimal ans = A.multiply(B);
      System.out.println(ans.longValue());
    } 
}
