import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] s00 = sc.nextLine().trim().split(" ") ; 

		int N = Integer.valueOf( s00[0]  ) ;
		int K = Integer.valueOf( s00[1]  ) ;

		s00 = sc.nextLine().trim().split(" ") ; 
		List<Integer> list1 = new ArrayList<>() ; 
		List<Integer> list2 = new ArrayList<>() ; 
		for ( String ss : s00 )   {
			int x = Integer.valueOf ( ss ) ;
			if ( x < 0 )  {
				list2.add ( x ) ;
			} else {
				list1.add ( x ) ;
			}
		}

		Collections.sort ( list1 ) ;
		Collections.reverse( list1 ) ;

		Collections.sort ( list2 ) ;


		long mod = 1000000007 ;
		if ( list1.size() == 0 ) {
			long t = 1 ; 
			Collections.reverse( list2 ) ;
			for ( int j=0 ; j<K ; j++ ) {
				t *= list2.get(j).intValue() ; 
				t %= mod ;
			}
			t %= mod ;
			System.out.println ( (t+mod)%mod ) ;	
		} else {
			long t = 1 ;
			if ( K %2 != 0 ) {
				t *= list1.remove( 0 ) ;
				K -= 1 ;
			}

			while ( K > 0 ) {

				long v1 = 0 ;
				if ( list1.size() >=2 ) 
					v1 = list1.get(0).longValue() * list1.get(1).longValue() ;

				long v2 = 0 ;
				if ( list2.size() >=2 ) 
					v2 = list2.get(0).longValue() * list2.get(1).longValue() ;

				
				if ( v1 >= v2 ) {
					t *= v1%mod ; 
					t %= mod ;
					list1.remove(0) ;
					list1.remove(0) ;
				} else {
					t *= v2%mod ; 
					t %= mod ;
					list2.remove(0) ;
					list2.remove(0) ;
				}
				K -= 2 ;
			}
			t %= mod ;
			System.out.println ( ( t + mod ) % mod ) ; 

		}	
	}
}