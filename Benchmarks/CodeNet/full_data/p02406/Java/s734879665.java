import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	

		int n = kb.nextInt();
		int i = 1;
		do {
			int x=i;
			
			if( 0 == x%3 ) {
				System.out.print( " "+i );
			} else {
				do {
					if( 3 == x%10 ) {
						System.out.print( " "+i );
						break;
					}
					x /= 10;
				} while( 0!=x );
			}
			
		} while ( ++i <= n );
		
		System.out.print( "\n" );
	}
}