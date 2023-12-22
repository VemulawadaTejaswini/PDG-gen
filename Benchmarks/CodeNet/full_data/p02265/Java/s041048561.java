import java.util.*;
import java.io.*;

class Main {

    public static void main( String[] args ) {
        try {
	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
			int n = Integer.parseInt( kb.readLine( ) );        
			Deque<Integer> dq = new LinkedList<Integer>( );
            String[] str;
            int res;
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                if( "insert".equals( str[0] ) ) {
                    dq.addFirst( Integer.parseInt( str[1] ) );
                } else if( "deleteFirst".equals( str[0] ) ) {
                    dq.removeFirst( );
                } else if( "deleteLast".equals( str[0] ) ) {
                    dq.removeLast(  );
                } else if( "delete".equals( str[0] ) ) {
                    dq.removeFirstOccurrence( Integer.parseInt( str[1] ) );
                }
            }
        	
			StringBuilder output = new  StringBuilder( );
            int len = dq.size();
            for( Iterator itr = dq.iterator( ); itr.hasNext( ); ) {
                output.append( itr.next( ) ).append( " " );
            }
            output.deleteCharAt( output.lastIndexOf( " " ) );
            System.out.println( output );
            
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}