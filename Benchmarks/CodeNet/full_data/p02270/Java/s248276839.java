import java.io.*;

class Main {

    public static void main( String[] args ) {
        try {
	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
			String[] str = kb.readLine( ).split( " " );
        	int n = Integer.parseInt( str[0] );
        	int k = Integer.parseInt( str[1] );
        	int[] w = new int[n];
        	int i;
        	int maxW = 0, sumW = 0;
        	for( i=0; i<n; i++ ) {
        		w[i] = Integer.parseInt( kb.readLine( ) );
        		sumW += w[i];
        		maxW = Math.max( maxW, w[i] );
        	}
        	
        	int left, right, middle;
        	int loadings, P;
        	int truckCnt;
        	
        	P = 0;
        	if( n == k ) {
        		P = maxW;
        	} else if( 1 == k ) {
        		P = sumW;
        	} else {
        		left = Math.max( maxW, sumW/k );
	        	right = 10000*100000;
	        	loadings = 0;
	    		while( left <= right ) {
		        	middle = ( left+right )/2;
					truckCnt = 0;
					loadings = 0;
					for( i=0; i<n; i++ ) {
						loadings += w[i];
						if( middle < loadings ) {
							truckCnt++;
							if( k < truckCnt+1 ) { break; }
							i--;
							loadings = 0;
						}
					}
					if( k == truckCnt+1 ) { 
						P = middle;
					}
					if( k < truckCnt+1 ) {
						left = middle + 1;
					} else {
						right = middle - 1;
					}
	    		}
    		}
    		
			System.out.println( P );
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}