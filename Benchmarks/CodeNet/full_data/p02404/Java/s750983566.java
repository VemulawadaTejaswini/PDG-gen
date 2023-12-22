import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		int H = 0;
		int W = 0;
		
		while ( true ) {
			H = sc.nextInt ();
			W = sc.nextInt ();
			
			if ( H == 0 && W == 0 ) {
				break;
			}

			for ( int i = 1; i <= H; i++ ) {
				for ( int j = 1; j <= W; j++ ) {
					if ( j == 1 || j == W ) {
						System.out.print ( "#" );
					} else if ( i == 1 || i == H ) {
						System.out.print ( "#" );
					} else {
						System.out.print ( "." );
					}
				}
				System.out.println ();
			}
			System.out.println ();
		}
	}
}