import java.util.Scanner;

public class Main{
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		
		while ( sc.hasNext() ){
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		
		double x = a * b ;
		double s = x / 3.305785 ;
		
		BigDecimal bix = new BigDecimal (String.valueOf(s));
		s =bix.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
				
		System.out.println( s );
	
		}

	}

}