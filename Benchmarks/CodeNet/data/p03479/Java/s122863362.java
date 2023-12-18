import java.util.*;
import java.math.*;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigDecimal X = sc.nextBigDecimal();
    BigDecimal Y = sc.nextBigDecimal();
    int i =1;
    while (true) {
      X = X.multiply(BigDecimal.valueOf(2));
      if (X.compareTo(Y) > 0) {
        System.out.println(i);
        return;
      } else {
        i++;
      }
    }
  }
}