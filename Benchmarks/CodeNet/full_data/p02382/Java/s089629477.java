import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			int n;
			String str;
			double[] xi = new double[ 100+1 ];
			double[] yi = new double[ 100+1 ];
			double[] absxy = new double[ 100+1 ];
			int i;
			double Dxy = 0, max = 0;
			
			n = Integer.parseInt( kb.readLine() );
			i = 0;
			for( String nums: kb.readLine().split( " ", 0 ) ) {
				xi[i++] = Double.parseDouble( nums );
			}
			i = 0;
			for( String nums: kb.readLine().split( " ", 0 ) ) {
				yi[i++] = Double.parseDouble( nums );
			}
			Dxy = 0;
			for( i=0; i<n; i++ ) {
				absxy[i] = Math.abs( xi[i]-yi[i] );
				if( max < absxy[i] ) {
					max = absxy[i];
				}
				Dxy += absxy[i];
			}
			System.out.print( Dxy + "\n" );

			Dxy = 0;
			for( i=0; i<n; i++ ) {
				Dxy += Math.pow( absxy[i], 2 );
			}
			System.out.print( Math.sqrt( Dxy ) + "\n" );
			
			Dxy = 0;
			for( i=0; i<n; i++ ) {
				Dxy += Math.pow( absxy[i], 3 );
			}			
			System.out.print( Math.cbrt( Dxy ) + "\n" );
			
			System.out.print( max + "\n" );

		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}