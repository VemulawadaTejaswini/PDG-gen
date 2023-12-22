import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] s00 = sc.nextLine().trim().split(" ") ; 

		int N = Integer.valueOf( s00[0]  ) ;
		int Q = Integer.valueOf( s00[1]  ) ;

		s00 = sc.nextLine().trim().split(" ") ; 
		
		List<Map<Integer,Integer>> list = new ArrayList<>() ; 
		list.add ( new HashMap<>() ) ;
		for ( int j=0 ; j<s00.length ; j++ ) {
			int r = Integer.valueOf( s00[j] ) ;
			Map<Integer,Integer> map2 = new HashMap<>( list.get(list.size()-1) ) ; 
			map2.put( r  , map2.getOrDefault( r , 0 ) + 1 ) ;
			list.add ( map2 ) ;
		}

		for ( int j=0 ; j<Q  ;j++ ) {
			s00 = sc.nextLine().trim().split(" ") ; 
			int l = Integer.valueOf( s00[0]  ) ;
			int r = Integer.valueOf( s00[1]  ) ;
			

			int c = 0 ;

			for ( int k : list.get(r).keySet() ) {
				if ( ! list.get(l-1).containsKey( k ) ) {
					c ++ ;
				} 
				else if ( list.get(r).get(k).intValue() > list.get(l-1).getOrDefault( k , 0 ) ) {
					c ++ ;
				}
			}
			System.out.println( c ) ;



		}
	}
}