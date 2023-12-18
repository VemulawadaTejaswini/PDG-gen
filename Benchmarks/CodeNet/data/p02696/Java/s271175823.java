import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
//		long ma = 0;
//		long start = b;
//		for (long i = start; i<=n; i++) {
//			double x=0.0;
//			double y=0.0;
//			x=a*i/b;
//			y=i/b;
//			long s = (long) (Math.floor(x) - a*Math.floor(y)) ;
//			if (s > ma) {
//				ma = s;
//			}
//		}
		BigDecimal ab = BigDecimal.valueOf(a);
		BigDecimal bb = BigDecimal.valueOf(b);
		BigDecimal cb = BigDecimal.valueOf(n);
		
		System.out.println((long)Math.floor(ab.multiply(cb).divide(bb).doubleValue()));
 	
	
	}
}