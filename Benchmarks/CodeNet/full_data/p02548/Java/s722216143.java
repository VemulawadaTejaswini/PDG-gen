import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

//		long startime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf ( sc.nextLine().trim() ) ;
		long x =0 ;
		for ( long a=1 ; a<n ; a++ ) {
			for ( long b=1 ; b<n ; b++ ) {
				long v = a * b ; 
				if ( v >= n ) break ; 
				long c = n - v ;
				x++;

			}
		}
		System.out.println( x ) ;

	}
}