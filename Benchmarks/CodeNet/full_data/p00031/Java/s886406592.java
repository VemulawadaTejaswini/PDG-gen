import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner( System.in );
	
	static int gram;
	
	public static void main(String[] args) {
		
		while( read() ) {
			solve();
		}
	}
	
	public static boolean read() {
		if ( !sc.hasNext() ) return false;
		
		gram = sc.nextInt();
		
		return true;
	}
	
	public static void solve() {
		
		String g = Integer.toString(gram, 2);
		char figure[] = g.toCharArray();
		
		for ( int i = 0; i < figure.length; i++ ) {
			if ( figure[i] == '1' ) {
				System.out.print( (int)Math.pow( 2.0, (double)i) );
				if ( i != figure.length-1 ) {
					System.out.print( " " );
				}
			}
		}
		System.out.println();
	}
}