import java.io.*;

public class Main {
	public static void main( String[] args ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ABC = br.readLine().split( " " );
		boolean flgNG = false;
		Integer cntFive = 0;
		Integer cntSeven = 0;
		for( Integer cnt = 0; cnt < 3; cnt++){
			Integer i = Integer.valueOf( ABC[cnt] );
			if( i == 5 ) {
				if( cntFive > 2 ) {
					flgNG = true;
					break;
				}
			} else if( i == 7 ) {
				if( cntSeven > 1 ) {
					flgNG = true;
					break;
				}
			} else {
				flgNG = true;
				break;
			}
		}
		if( flgNG ) {
			System.out.println( "NO" );
		} else {
			System.out.println( "YES" );
		}
	}
}
