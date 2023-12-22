import java.util.*;
 
public class Main {
	
	public static final int A = 0;
	public static final int B = 1;
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double C = scan.nextDouble();
		
		// S
		double S = a * b * Math.sin( Math.toRadians( C ) ) / 2;
		
		// L
		double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos( Math.toRadians( C ) ) );
		
		// h
		double h = b * Math.sin( Math.toRadians( C ) );
		
		System.out.print(S + "\n" + L + "\n" + h + "\n");
		
	}
	
}