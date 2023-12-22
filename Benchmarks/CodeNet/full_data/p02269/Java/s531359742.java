import java.io.*;
import java.util.*;

class Main {
	public static final int M = 48828125;
	public static boolean[] H = new boolean[M];	
    public static void main( String[] args ) {
        try {
 	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );

        	int n = Integer.parseInt( kb.readLine( ) );
			String[] str = new String[3];
			for( int i=0; i<n; i++ ) {
				str = kb.readLine( ).split( " " );
				if( "insert".equals( str[0] ) ) {
					insert( str[1] );
				} else if( "find".equals( str[0] ) ) {
					if( find( str[1] ) ) {
						System.out.println( "yes" );
					} else {
						System.out.println( "no" );
					}
				}
			}
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
    
   public static int getChar( char ch )
   {
		if( ch == 'A') {
			return 1;
		} else if( ch == 'C') {
			return 2;
		} else if( ch == 'G') {
			return 3;
		} else if( ch == 'T') {
			return 4;
		}
		return 0;
	}
	public static int getKey( String str )
	{
		int i;
		int key = 0, base = 1;
		char[] str2 = str.toCharArray() ;
		for ( i=0; i<str.length( ); i++ ) {
			key += base*( getChar( str2[i] ) );
			base *= 5;
		}
		return key;
	}
	
	public static boolean find( String str )
	{
		if( true == H[ getKey( str ) ] ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void insert( String str )
	{
		H[ getKey( str ) ] = true;
		return;
	}	
}