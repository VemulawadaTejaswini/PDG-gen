import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine() ;

		Map<Integer,Long> map = new HashMap<>() ;
	
		long t = 0 ;
		for ( int j=0 ; j<S.length() ; j++ ) {
			int  v = (int)( S.charAt(j)-49 +1) ; 

			Map<Integer,Long> map2 = new HashMap<>() ;
			map2.put ( v , 1L ) ;	
			
			for ( int k : map.keySet() ) {
				int k2 = ( k * 10 + v ) % 2019 ;
				map2.put( k2 , map2.getOrDefault( k2 , 0L ) + map.get(k).longValue() ) ;
			}
			map = map2 ;	
			if ( map.containsKey( 0 ) )
			t += map.get(0).longValue() ;
		}
		System.out.println( t ) ;

	 }
}