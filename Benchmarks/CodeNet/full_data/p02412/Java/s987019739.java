import java.util.Scanner;

class Main {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		// ?????°??£?¨?
		int n = 0;
		int x = 0;
		int count = 0;

		while ( true ) {
			
			// ??\?????????
			n = sc.nextInt ();
			x = sc.nextInt ();

			if ( n == 0 && x == 0 ) {
				System.exit ( 0 );
			}

			// ???????????????
			for ( int i = 1; i <= n; i++ ) {
				for ( int j = i + 1; j <= n; j++ ) {
					for ( int k = j + 1; k <= n; k++ ) {
						if ( i + j + k == x ) {
							count++;
						}
					}
				}
			}
			System.out.println ( count );
			count = 0;
		}
	}
}