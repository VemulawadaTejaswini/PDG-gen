import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		BigDecimal ans1 = b1.multiply(a1);
		BigDecimal ans2 = ans1.setScale(0, BigDecimal.ROUND_DOWN);
		System.out.println(ans2);
	 }
}