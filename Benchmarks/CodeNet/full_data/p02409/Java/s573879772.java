import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		Scanner sc2 = new Scanner ( System.in );
		int n = 0;
		int b = 0;
		int f = 0;
		int r = 0;
		int v = 0;
		
		n = sc.nextInt ();
		
		int [][][] human = new int[ 4 ][ 3 ][ 10 ];
		
		// ???????????§?????????
		for ( int i = 0; i < 4; i++ ) {
			for ( int j = 0; j < 3; j++ ) {
				for ( int k = 0; k < 10; k++ ) {
					human[ i ][ j ][ k ] = 0;
				}
			}
		}
		
		// ??\?????????
		for ( int i = 0; i < n; i++ ) {
			String inputNum = sc2.nextLine ();
			b = ( Integer.parseInt ( String.valueOf ( inputNum.charAt ( 0 ) ) ) ) - 1;
			f = ( Integer.parseInt ( String.valueOf ( inputNum.charAt ( 2 ) ) ) ) - 1;
			r = ( Integer.parseInt ( String.valueOf ( inputNum.charAt ( 4 ) ) ) ) - 1;
		
			int inputNumLength = inputNum.length();

			if ( 7 < inputNumLength  ) {
				String str = String.valueOf ( inputNum.charAt ( 6 ) );
				String str2 = String.valueOf ( inputNum.charAt ( 7 ) );
				if ( str.equals ( "-" ) ) {
					v = Integer.parseInt ( String.valueOf ( inputNum.charAt ( 7 ) ) );
					human[ b ][ f ][ r ] -= v;
					if ( human[ b ][ f ][ r ] < 0 ) {
						human[ b ][ f ][ r ] = 0;
					}
				} else if ( str.equals ( "1" ) && str2.equals ( "0" ) ) {
					human[ b ][ f ][ r ] = 10;
				} else {
					v = Integer.parseInt ( String.valueOf ( inputNum.charAt ( 6 ) ) );
					human[ b ][ f ][ r ] += v;
					if ( 9 < human[ b ][ f ][ r ] ) {
						human[ b ][ f ][ r ] = 9;
					}
				}
			}
		}
		
		for ( int i = 0; i < 4; i++ ) {
			for ( int j = 0; j < 3; j++ ) {
				for ( int k = 0; k < 10; k++ ) {
					System.out.print ( human[ i ][ j ][ k ] + " " );
				}
				System.out.println ();
			}
			if ( i != 3 ) {
				System.out.println ( "####################" + "\n" );
			}
		}
	}
}