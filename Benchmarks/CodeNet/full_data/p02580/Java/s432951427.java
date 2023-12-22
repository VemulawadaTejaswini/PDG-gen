import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] s00 = sc.nextLine().trim().split(" ") ; 
		int H = Integer.valueOf ( s00[0] ) ;
		int W = Integer.valueOf ( s00[1] ) ;
		int M = Integer.valueOf ( s00[2] ) ;
	

//		Set<List<Integer>> set = new HashSet<>() ;
		Set <Long> set1 = new HashSet<>() ;

		int[] arrx = new int[H+1] ;
		int[] arry = new int[W+1] ;
		for  ( int j=0 ; j<M ; j++ ) {
			s00 = sc.nextLine().trim().split(" ") ; 
			int x = Integer.valueOf ( s00[0] ) ;
			int y = Integer.valueOf ( s00[1] ) ;
			set1.add ( (long) y * ( H +1 ) + x ) ;
			arrx[x] += 1; 
			arry[y] += 1 ;
		}

		List<Integer> lx = new ArrayList<>() ;
		List<Integer> ly = new ArrayList<>() ;

		int maxx = -1 ;
		int maxy = -1 ;
		for ( int j=0 ; j<arrx.length ; j++ ) {
			if ( arrx[j] == maxx ) {
				lx.add ( j ) ;
			} else if ( arrx[j] > maxx ) {
				lx.clear() ; 
				lx.add ( j ) ;
				maxx = arrx[j] ;
			}
		}

		for ( int j=0 ; j<arry.length ; j++ ) {
			if ( arry[j] == maxy ) {
				ly.add ( j ) ;
			} else if ( arry[j] > maxy ) {
				ly.clear() ; 
				ly.add ( j ) ;
				maxy = arry[j] ;
			}
		}


		int t = 0 ;
		for ( int x : lx ) {
			for ( int y : ly ) {

				long v1 = (long) y * ( H + 1 ) + x ;
//				List<Integer> l0 = Arrays.asList ( x, y ) ; 
				int d =  set1.contains( v1 ) ? -1 : 0 ;
				t = Math.max ( t , maxx + maxy + d ) ;
				if ( t == maxx + maxy )
					break ;
			}
		}
		System.out.println( t ) ;
	}
}