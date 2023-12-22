import java.io.*;

class Ps {
	String name;
	Integer t;
	
	public Ps( String name, Integer t )
	{
		this.name = name;
		this.t = t;
	}
}
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
 
            String[] str = kb.readLine().split( " " );
            int n = Integer.parseInt( str[0] );
            int q = Integer.parseInt( str[1] );
			
			
			final int LEN = 100005;
			Ps[] queue = new Ps[LEN];
			int head = 0, tail = n-1;				
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                queue[i] = new Ps( str[0], Integer.parseInt( str[1] ) );
            }

            StringBuilder output = new	StringBuilder( );
			String name;
            int time, t;
           	time = 0;
            while( 0 != n ) {
	           	name = queue[ head ].name;
            	t = queue[ head ].t;
            	if( t <= q ) {
            		queue[ head ] = null;
            		n--;
            		output.append( name );
            		output.append( " " );
            		output.append(  time + t );
            		output.append( "\n" );
            		time += t;          		
            	} else {
            		tail++;
            		if( LEN == tail ) { tail = 0; }
	           		queue[tail] = new Ps( name, t - q );
	                time += q;        
            	}
          		head++;
          		if( LEN == head ) { head = 0; }
            }
            System.out.print( output );
             
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}