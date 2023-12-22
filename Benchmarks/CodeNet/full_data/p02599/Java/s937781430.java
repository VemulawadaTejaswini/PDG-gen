import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {


		InputStreamReader s = new InputStreamReader(System.in) ; 

		int[] arr = getdata ( 2 , s ) ;
		int N = arr[0] ; 
		int Q = arr[1] ;

		arr = getdata ( N , s ) ;
		List<Map<Integer,Integer>> list = new ArrayList<>() ; 
		list.add ( new HashMap<>() ) ;
		for ( int j=0 ; j<arr.length ; j++ ) {
			int r = arr[j] ;
			Map<Integer,Integer> map2 = new HashMap<>( list.get(list.size()-1) ) ; 
			map2.put( r  , map2.getOrDefault( r , 0 ) + 1 ) ;
			list.add ( map2 ) ;
		}

		for ( int j=0 ; j<Q  ;j++ ) {
			arr = getdata ( 2 , s ) ;
			int l = arr[0] ;
			int r = arr[1] ;

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

	public static int[] getdata ( int c , InputStreamReader s ) throws Exception { 
		int[] arr = new int[c] ;
		int idx= 0 ;
		int d  = 0 ;

		while ( true ) {
			int v = s.read();

			if ( v == 32 ) {
				if ( d != 0 ) {
					arr[idx] = d ; 
					d = 0 ; 
					idx++ ;
				}

			} else if ( v <=15 ) {
				break ;
			} else {
				d = d * 10 + ( v - 49 + 1 ) ;
			}
		}
		arr[idx] = d ;
		return arr ;
	}
}