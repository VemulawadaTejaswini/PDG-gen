import java.util.*;
import java.math.*;

public class Main {
  
  	private static final BigInteger MAX 
      = new BigInteger("1000000000000000000");
  
	public static void main (String[] args) throws Exception {
		final Scanner in = new Scanner(System.in);
      	final int N = in.nextInt();
      	BigInteger product = BigInteger.ONE;
      
      	for (int i = 0; i < N; ++i) {
          	final BigInteger next = in.nextBigInteger();
          	product = product.multiply(next);
          	if (product.compareTo(MAX) > 0) {
              System.out.println(-1);
              return;
            }
        }
      
      	System.out.println(product);
		
	}
}