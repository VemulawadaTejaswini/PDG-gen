import java.io.*;

class Main {
	static int fieldlen = 0;
	static int fieldstart = 0;
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
			
			char[] field = kb.readLine().toCharArray();
			fieldlen = field.length;
			int[] areas = new int[10000];
			int cnt, found, total;

			cnt = total = found  = 0;
            for( int i=0; i<fieldlen; i++ ) {
            	if( '\\' == field[i] ) {
	            	found = getArea( field, i );
	            	if( 0 < found ) {
	            		areas[cnt] = found;
	            		total += areas [cnt++];
	            		found = 0;
	            		i = fieldstart;
	            	}
            	}
            }
            
            StringBuilder output = new  StringBuilder( );
            output.append( total ).append( "\n" );
            output.append( cnt ).append( " " );
           	for( int i=0; i<cnt; i++ ) {
           		output.append( areas[i] ).append( " " );
         	}
         	output.deleteCharAt( output.lastIndexOf( " " ) );
         	System.out.println( output );

	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
	public static int getArea( char[] field, int start )
	{
		int i, area, cnt, s, t;
		area = cnt = s = t = 0;
		for( i=start; i<fieldlen; i++ ) {
            if( '\\'== field[i] ) {
            	cnt++;
            	t++;
            	area += cnt;
            } else if( 0 < cnt && '/' == field[i] ) {
            	area += cnt;
            	cnt--;
            	if( 0 == cnt ) { break; }
            } else if( '_' == field[i]  ) {
            	s += cnt;
            }
		}
		if( fieldlen == i ) { 
			area = 0;
		} else {
			area = ( area - t + s );
			fieldstart = i;
		}
		return area;
	}
}