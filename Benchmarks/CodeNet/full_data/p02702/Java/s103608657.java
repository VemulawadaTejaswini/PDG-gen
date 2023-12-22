import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine() ;
		long[] arr = new long[2019] ;
	
		long t = 0 ;
		for ( int j=0 ; j<S.length() ; j++ ) {
			int  v = (int)( S.charAt(j)-49 +1) ; 

			long[] arr2 = new long[2019] ;

			arr2[v] += 1 ;
			for ( int k=0 ; k<arr.length ; k++ ) {
				if ( arr[k] == 0 ) continue ;
				arr2[ ( k * 10 + v ) % 2019 ] += arr[k] ;
			}
			
			arr = arr2 ;
			t += arr[0] ;
		}
		System.out.println( t ) ;

	 }
}