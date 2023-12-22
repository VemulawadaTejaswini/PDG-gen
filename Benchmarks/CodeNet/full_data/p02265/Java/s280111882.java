import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
			int n = Integer.parseInt( kb.readLine() );
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			String[] str;
			int res;
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                if( "insert".equals( str[0] ) ) {
                	list.add( 0, Integer.parseInt( str[1] ) );
                } else if( "deleteFirst".equals( str[0] ) ) {
                	list.remove( 0 );
                } else if( "deleteLast".equals( str[0] ) ) {
                	list.remove( list.size()-1 );
                } else {
                	res = list.indexOf( Integer.parseInt( str[1] ) );
                	if(  -1 !=  res  ) {
                		list.remove( res );
                	}
                }
            }
            
			StringBuilder output = new  StringBuilder( );
			int len = list.size();
            for( int i=0; i<len; i++ ) {
				output.append( list.get( i ) ).append( " " );
 			}
 			output.deleteCharAt( output.lastIndexOf( " " ) );
			System.out.println( output );

	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
}