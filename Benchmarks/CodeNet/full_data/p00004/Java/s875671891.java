import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		
		while ( sc.hasNext() ){
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		double x = ( c*e - b*f ) / ( a*e - b*d );
		double y = ( a*f - c*d ) / ( a*e - b*d );
		
		BigDecimal bix = new BigDecimal (String.valueOf(x));
		BigDecimal biy = new BigDecimal (String.valueOf(y));
		x =bix.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
		y =biy.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
		
		DecimalFormat df = new DecimalFormat ("0.000") ;
				
		System.out.println( df.format(x) +  " " + df.format(y));
	
		}

	}

}