import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().trim().split(" ") ;
		int N = Integer.valueOf ( ss[0] ) ;
		int K = Integer.valueOf ( ss[1] ) ;
		
		List<Integer> set = new ArrayList<>() ;
		for ( int j=0 ; j<K ; j++ ) {
			 ss = sc.nextLine().trim().split(" ") ;
			int L = Integer.valueOf ( ss[0] )  ;
			int R = Integer.valueOf ( ss[1] ) ;
			for ( int r=L ; r<=R ; r++ )
				set.add (r ) ;
		}
		Collections.sort( set ) ;

		long[] arr = new long[N+1]  ;
		arr[1] = 1 ; 
		long mod = 998244353 ;

		for ( int x=1 ; x<=N ; x++ ) {
			for ( int v: set ) {
				if ( x-v <= 0 ) 
					break ; 
				arr[x] += arr[x-v] ;
			}
			arr[x] %= mod ;
		}
		System.out.println( arr[N] ) ;
	}
}