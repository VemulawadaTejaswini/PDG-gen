import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		int a[] = new int[ 3 ];

		for ( int i = 0; i < 3; i++ ) {
			a[ i ] = sc.nextInt ();
		}

		for ( int j = 2; 0 < j; j-- ) {
			if ( a[ j ] < a [j - 1] ) {
				int tmp = a[ j ];
				a[ j ] = a [ j - 1 ];
				a[ j - 1 ] = tmp;
			}
		}

		System.out.println ( a[ 0 ] + " " + a[ 1 ] + " " + a[ 2 ] );
	}
}