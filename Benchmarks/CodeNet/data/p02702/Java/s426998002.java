import java.io.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {
		
		InputStreamReader s = new InputStreamReader(System.in) ; 

		long[] arr = new long[2019] ;
		long t = 0 ;
		while ( true ) {
			int v = s.read();
			if (  ! (v >= 49 && v <=57 ))
				break ;
			v = v -49 +1 ;

			long[] arr2 = new long[2019] ;
			arr2[v] += 1 ;
			for ( int k=0 ; k<arr.length ; k++ ) {
				if ( arr[k] == 0 ) continue ;
				arr2[ ( k * 10 + v ) % 2019 ] += arr[k] ;
			}
			
			arr = arr2 ;
			t += arr[0] ;

		}
		System.out.println ( t ) ;

	 }
}