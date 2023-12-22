import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		BigDecimal ans = new BigDecimal(a);
		ans.multiply(BigDecimal.valueOf(b));
		System.out.println(ans.longValue());
	 }
}