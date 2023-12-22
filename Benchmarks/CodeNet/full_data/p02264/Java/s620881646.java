import java.io.*;
import java.util.*;

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
             
            LinkedList<Ps> queue = new LinkedList<Ps>();
             
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                queue.offer( new Ps( str[0], Integer.parseInt( str[1] ) ) );
            }
 
            StringBuilder output = new  StringBuilder( );   
            Ps ps;         
            int time;
           	time = 0;
            while( null != ( ps = queue.poll() ) ) {
            	
                if( ps.t <= q ) {
                    output.append( ps.name );
                    output.append( " " );
                    time += ps.t;    
                    output.append(  time );
                    output.append( "\n" );
          
                } else {
                	ps.t -= q;
                    queue.offer( ps );
                    time += q;           
                }
            }
            System.out.print( output );
              
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}