import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			String str;
			StringBuilder cards = new StringBuilder( 200+1 );
			int m, shuffle;
	        while( null != ( str = kb.readLine() ) ) {
	        	if( str.equals( "-" ) ) { break; }
	        	
	        	m = Integer.parseInt( kb.readLine() );
	        	for( int i=0; i<m; i++ ) {
	        		shuffle = Integer.parseInt( kb.readLine() );
	        		cards.append( str.substring( shuffle ) );
	        		cards.append( str.substring( 0, shuffle ) );
	        		str = cards.toString();
	        		cards.setLength( 0 );
	        	}
	        	System.out.println( str );	
	        }
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}