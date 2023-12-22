import java.util.Scanner;
public class Main {
	private Scanner sc;
	private void run () {
		
		sc = new Scanner( System.in );
		while( true ) {
			int n = sc.nextInt();
			if( n == 0 ) { return; }
			int m = sc.nextInt();
			String s = sc.next();
			char[] cs = s.toCharArray();
			int[] ioib = new int[ m ];
			for( int i = 0; i < m; i++ ) {
				ioib[ i ] = -1;
			}
			int ioin = 0;
			for( int i = m - 1; i >= 0; i-- ) {
				if( cs[ i ] == 'I' ) {
					if( i != m - 1 &&cs[ i + 1 ] == 'O') {
						ioib[ i ] = ioin;
					} else {
						ioib[ i ] = 0;
						ioin = 0;
					}
				} else { // 'O'
					ioin++;
				}
			}
			int counter = 0;
			for( int i = 0; i < m; i++ ) {
				if( ioib[ i ] >= n ) {
					counter++;
				}
			}
			System.out.println( counter );			
		}
		
	}
	
	public static void main( String[] args ) {
		new Main().run();
	}
}