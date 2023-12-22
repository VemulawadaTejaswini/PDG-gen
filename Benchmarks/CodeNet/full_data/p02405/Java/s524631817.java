import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		
		int H = 0;
		int W = 0;
		boolean flg = true;

		while ( true ) {
			H = sc.nextInt ();
			W = sc.nextInt ();

			if ( H == 0 && W == 0 ) {
				break;
			}
			
			for ( int i = 1; i <= H; i++ ) {
				if ( i % 2 == 0 ) {
					flg = false;
				} else {
					flg = true;
				}
				
				for ( int j = 1; j <= W; j++ ) {
					if ( flg == true ) {
						System.out.print ( "#" );
						flg = false;
					} else {
						System.out.print ( "." );
						flg = true;
					}
				}
				System.out.println ();
			}
			System.out.println ();
		}
	}
}