import java.io.*;
 
class Main {
	
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
			String[] nums = kb.readLine().split( " " );
			int[] A = new int[n];
            int i, j;
            
            for( i=0; i<n; i++ ) {
            	A[i] = Integer.parseInt( nums[i] );
            }
            
            int cnt = 0;
			cnt = selectionSort( A );
			
            StringBuilder output = new StringBuilder( 200+1 );
            for( i=0; i<n; i++ ) {
            	output.append( A[i]  );
            	output.append( " "  );
            }
            output.deleteCharAt( output.lastIndexOf( " " ) );

            System.out.println( output );
            System.out.println( cnt );
			 
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }        
    }
    
    static int selectionSort( int[] A ) 
    {
    	int tmp;
    	int i, j, mini, cnt;
    	int n = A.length;
    	
    	cnt = 0;
   		for( i=0; i<n; i++ ) {
   			mini = i;
   			for( j=i; j<n; j++ ) {
   				if( A[j] < A[ mini ] ) {
   					mini = j;
   				}
   			}
   			if( mini != i ) {
		   		tmp = A[ mini ];
				A[ mini ] = A[ i ];
				A[ i ] = tmp;
				cnt++;
			}
   		}
   		return cnt;
    }
}