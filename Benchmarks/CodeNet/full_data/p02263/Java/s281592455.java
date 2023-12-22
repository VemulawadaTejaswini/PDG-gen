import java.io.*;

class Main {
	public static void main(String[] args) {
	    BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
	    try {
			int[] stack = new int[ 100+1 ];
			int i, a, b;
		    String str = kb.readLine();
		    
		    i = 0;
		    for( String wd: str.split( " " ) ) {
			    if( "+".equals( wd ) ) {
			    	b = stack[ --i ];
			    	a = stack[ --i ];
			    	stack[ i++ ] = a + b;			    
			    } else if( "-".equals( wd ) ) {
			    	b = stack[ --i ];
			    	a = stack[ --i ];
			    	stack[ i++ ] = a - b;			    
			    } else if( "*".equals( wd ) ) {
			    	b = stack[ --i ];
			    	a = stack[ --i ];
			    	stack[ i++ ] = a * b;			    
			    } else {
			    	stack[i++] = Integer.parseInt( wd );
			    }
		    }

            System.out.println( stack[ --i ] );
	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
}