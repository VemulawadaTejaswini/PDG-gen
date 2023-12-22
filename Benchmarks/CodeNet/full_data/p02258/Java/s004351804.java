import java.io.*;
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
			
			int[] nums = new int[n];
            int num, maxprofit, min;
            int i, j;
            
            min = 1000000000;
            maxprofit = 1-1000000000;
            for( i=0; i<n; i++ ) {
            	num = Integer.parseInt( kb.readLine() );
				maxprofit = Math.max( maxprofit, num-min );
				min = Math.min( min, num );
            }
            
            System.out.println( maxprofit  );
             
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}