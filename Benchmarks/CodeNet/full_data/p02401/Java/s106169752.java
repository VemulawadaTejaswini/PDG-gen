import java.util.Scanner;


class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		double a,b;
		String op;
		
		while( true ) {
			a=kb.nextDouble();
			op=kb.next();
			b=kb.nextDouble();
			
			if( "?".equals( op) ) { break; }
			
			switch( op ) {
				case "+":
					System.out.printf( "%.0f\n", a+b );
					break;
				case "-":
					System.out.printf( "%.0f\n", a-b );
					break;
				case "*":
					System.out.printf( "%.0f\n", a*b );
					break;
				case "/":
					System.out.printf( "%.0f\n", a/b );
					break;
			}
		}
			
	}
}