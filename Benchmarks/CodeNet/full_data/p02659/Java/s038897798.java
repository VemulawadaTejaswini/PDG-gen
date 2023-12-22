import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		BigDecimal a1 = new BigDecimal(a);
		BigDecimal ans = a1.multiply(BigDecimal.valueOf(b));
		System.out.println(ans.longValue());
	 }
}