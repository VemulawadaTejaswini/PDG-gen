import java.math.BigDecimal;
import java.util.Scanner;

public class SimultaneousEquation {
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
		x =bix.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		y =biy.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		String xx = String.format("%.3f",x);
		String yy = String.format("%.3f",y);
		
		System.out.println( xx +  " " + yy );
		
		}

	}

}