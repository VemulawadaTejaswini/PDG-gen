import java.math.BigDecimal;
import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		BigDecimal x = new BigDecimal(1);
		BigDecimal one = new BigDecimal(1);
		long N = sc.nextLong();
		long result =  0L;
		for (int i = 1; i<=10000;i++ ) {
        	long check = A.multiply(x).divide(B,0,BigDecimal.ROUND_DOWN).subtract(x.divide(B, 0, BigDecimal.ROUND_DOWN).multiply(A)).longValue();
			if (result<check) {
				result = check;
			}
			x =x.add(one);
		}
		System.out.println(result);

      	sc.close();
    }
		
		
}
