import java.util.Scanner;

public class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		
		int m = 0;
		int f = 0;
		int r = 0;
		
		while ( true ) {
			m = sc.nextInt ();
			f = sc.nextInt ();
			r = sc.nextInt ();
			
			if ( m < 0 && f < 0 && r < 0 ) {
				break;
			}
			
			int sum = m + f;
			
			if ( m == -1 || f == -1 ) {
				System.out.println ( "F" );
			} else if ( 80 <= sum ) {
				System.out.println ( "A" );
			} else if ( 65 <= sum && sum < 80 ) {
				System.out.println ( "B" );
			} else if ( 50 <= sum && sum < 65 ) {
				System.out.println ( "C" );
			} else if ( 30 <= sum && sum < 50 ) {
				if ( 50 <= r ) {
					System.out.println ( "C" );
				} else {
					System.out.println ( "D" );
				}
			} else if ( 0 <= sum && sum < 30 ) {
				System.out.println ( "F" );
			}
		}
	}
}