import java.util.*;
import java.math.BigInteger;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    long limit = (long) Math.pow(10,18);
    boolean smaller = true;
    
    BigInteger product = new BigInteger("1");
    
    for (int i = 1; i <= N; i++) {
      long A_i = scan.nextLong();
      
      if (A_i == 0) {
        System.out.println("0");
        return;
      }
      
      if (product.compareTo(BigInteger.valueOf(limit)) > 0) {
        smaller = false;
      }
      
      else {
        product = product.multiply(BigInteger.valueOf(A_i));
      }
    }
    
    if (smaller == false) {
      System.out.println("-1");
    }
    
    System.out.println(product);
  }
}
