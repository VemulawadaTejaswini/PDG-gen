import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().trim().split(" ") ;
		int N = Integer.valueOf ( ss[0] ) ;
		int M = Integer.valueOf ( ss[1] ) ;
		
		int[]  arr  = new int[N+1] ;
		int c = 1 ; 
		Map<Integer,Set<Integer>> map = new HashMap<>() ;
		
		for ( int x=0  ;x<M ; x++ ) {
			ss = sc.nextLine().trim().split(" ") ;
			int a = Integer.valueOf ( ss[0] ) ;
			int b = Integer.valueOf ( ss[1] ) ;

			if ( arr[a] ==0 && arr[b] ==0 ) {
				arr[a] = c  ;
				arr[b] = c  ;
				map.put( c , new HashSet<>() ) ; 
				map.get( c ).add ( a ) ;
				map.get( c ).add ( b ) ;
				c ++ ;
			} else if ( arr[a] != 0 && arr[b] == 0 ) {
				arr[b] = arr[a] ;
				map.get( arr[a] ).add( b ) ;
			} else if ( arr[a] == 0 && arr[b] != 0 ) {
				arr[a] = arr[b] ;
				map.get( arr[b] ).add( a ) ;
			} else if ( arr[a] ==  arr[b]  ) {
				continue ;
			} else {
				int rr = arr[b] ;
				for ( int y : map.get(rr) ) {
					map.get( arr[a] ).add ( y ) ;
					arr[y] = arr[a] ;
				}
				map.remove  ( rr ) ;
			}
		}

		c = 0 ;
		Set<Integer> rr = new HashSet<>() ;
		for  ( int x=1  ;x<arr.length ; x++ ) 
			c = Math.max ( c  , arr[x] ) ;
		for  ( int x=1  ;x<arr.length ; x++ )  {
			if ( arr[x] != 0 ) continue ;
			c += 1 ;
			arr[x] = c ; 
		}
		for  ( int x=1  ;x<arr.length ; x++ )  
			rr.add ( arr[x] ) ;
		
		System.out.println( rr.size() -1 ) ;
	}
}