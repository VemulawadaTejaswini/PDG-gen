import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		int H = 0;
		int W = 0;

		H = sc.nextInt ();
		W = sc.nextInt ();
		
		while ( true ) {
			if ( H == 0 && W == 0 ) {
				break;
			}

			for ( int i = 0; i < H; i++ ) {
				for ( int j = 0; j < W; j++ ) {
					System.out.print ( "#" );
				}
				System.out.print ( "\n" );
			}
		}
	}
}