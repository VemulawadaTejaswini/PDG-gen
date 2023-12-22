import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in );

		String str = kb.nextLine();
		int n = Integer.parseInt( str );

		str = kb.nextLine();
		String[] arr = str.split( " " );
			
		for( int i=n-1; 0<=i; i-- ) {
			System.out.print( arr[i] );
			if( 0 != i ) {
				System.out.print( " " );
			} else {
				System.out.print( "\n" );
			}
		}
	}
}