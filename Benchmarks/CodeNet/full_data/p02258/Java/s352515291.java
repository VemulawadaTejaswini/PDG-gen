import java.io.*;
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
			
			int[] nums = new int[n];
            int num, maxprofit;
            int i, j;
            
            maxprofit = 1-1000000000;
            for( i=0; i<n; i++ ) {
            	num = Integer.parseInt( kb.readLine() );
            	nums[i] = num;
				for( j=0; j<i; j++ ) {
					maxprofit = Math.max( maxprofit, num-nums[j] );
				}
            }
            
            System.out.println( maxprofit  );
             
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}