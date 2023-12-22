import java.util.*;
import java.math.*;

public class Main {
  private static final BigDecimal SEVEN = new BigDecimal(7);
  public static void main(String[] args) {
  	try (Scanner scan = new Scanner(System.in)) {
      long t = 7L;
      long k = scan.nextInt();
      
      for (long i = 0; i < k; i++) {
      	
        if (t % k == 0) {
          System.out.println(i+1);    
          return;
        }
        
        t = t * 10L + 7L;
      }

      System.out.println("-1");
    }
  }
}