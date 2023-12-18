import java.math.BigDecimal;
import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		long N = sc.nextLong();
		long result =  0L;
		for (int i = 1; i<=N;i++ ) {
			BigDecimal x = new BigDecimal(i);
			BigDecimal first = A.multiply(x).divide(B,0,BigDecimal.ROUND_DOWN);
			BigDecimal second = x.divide(B, 0, BigDecimal.ROUND_DOWN).multiply(A);
			first = first.subtract(second);
        
			if (result<first.longValue()) {
				result = first.longValue();
			}
		}
		System.out.println(result);



      	sc.close();
    }
		
		
}
