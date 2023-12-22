import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		while ( sc.hasNext() ){
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int n = sc.nextInt();
		
		double x = a / b ;
		double ans = 0 ;
		int s = 0 ;
		
		for ( int i = 1 ; i <= n ; i++){
			
			double y = x  ;
			
			for ( int j = 1 ; j <= i ; j++){
				y = y * 10;
			}
			
			ans = y % 10 ;
			
			BigDecimal big = new BigDecimal (String.valueOf(ans));
			ans =big.setScale(0, BigDecimal.ROUND_DOWN).doubleValue();
			
			s = s + (int)ans ;	
		}
		
		System.out.println(s);
	}
	}

}