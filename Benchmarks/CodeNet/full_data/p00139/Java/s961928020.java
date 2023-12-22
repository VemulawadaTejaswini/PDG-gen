import java.util.Scanner;
public class Main {
	Scanner sc;
	private void run () {
		sc = new Scanner( System.in );
		int n = sc.nextInt();
		for( int i = 0; i < n; i++ ) {
			String line = sc.next();
			if( line.matches( "^\\>\\'(\\=+)\\#\\1~$" ) ) {
				System.out.println( "A" );
			} else if( line.matches( "^\\>\\^(Q=)+(~~)$" ) ) {
				System.out.println( "B" );
			} else {
				System.out.println( "NA" );
			}
		}
	}
	public static void main( String[] args ) {
		new Main().run();
	}
}