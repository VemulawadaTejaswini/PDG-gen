import java.io.*;
  
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
             
            int num;
			int cnt = n;
            int i, j;
            for( i=0; i<n; i++ ) {
                num = Integer.parseInt( kb.readLine() );
				if( 2 == num ) { continue; }
				if( 0 == num%2 ) {
					cnt--;
					continue;
				}
                for( j=3; j*j<=num; j+=2 ) {
                    if( 0 == num%j ) {
                        cnt--;
						break;
                    }
                }
            }
             
            System.out.println( cnt  );
              
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}