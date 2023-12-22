import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			int n;
			String str;
			double[] s = new double[ 1000+1 ];
			int i;
			double ave = 0, sum = 0, a = 0;
			while( true ) {
				n = Integer.parseInt( kb.readLine() );
				if( 0 == n ) { break; }
				sum = i = 0;
				for( String nums: kb.readLine().split( " ", 0 ) ) {
					s[i] = Double.parseDouble( nums );
					sum += s[i++];
				}
				ave = sum/n;
				sum = 0;
				for( i=0; i<n; i++ ) {
					sum += Math.pow( s[i]-ave, 2 );
				}
				a = Math.sqrt( sum/n );
				System.out.print( a + "\n" );
			}
			
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}