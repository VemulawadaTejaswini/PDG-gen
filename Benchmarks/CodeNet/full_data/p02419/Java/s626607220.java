import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
	        String word = kb.readLine();
	        word = word.toUpperCase();
	        
	        String str;
	        int cnt = 0;
	       	boolean endoftext = false;
	        while( null != ( str = kb.readLine() ) ) {
	        	for( String wd: str.split( " ", 0 ) ) {
		        	wd = wd.toUpperCase();
		        	if( wd.equals( word ) ) {
		        		cnt++;
		        	} else if( wd.equals( "END_OF_TEXT" ) ) {
		        		endoftext = true;
		        		break;
		        	}
	        	}
	        	if( endoftext ) { break; }
	        }
			System.out.println( cnt );
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}