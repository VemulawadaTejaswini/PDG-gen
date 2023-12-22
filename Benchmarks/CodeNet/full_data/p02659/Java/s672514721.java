import java.util.*;
import java.math.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      BigInteger A = BigInteger.valueOf(a);
      BigDecimal AA = new BigDecimal(A);

      Double b = sc.nextDouble();
      BigDecimal B = BigDecimal.valueOf(b);

      BigDecimal res = AA.multiply(B);
    
      System.out.println(res.toBigInteger().toString());
  }
}