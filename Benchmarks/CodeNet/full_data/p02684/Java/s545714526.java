import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {
		
		Scanner sc = new Scanner(System.in);

		String[] arr = sc.nextLine().trim().split(" ") ;
		int N = Integer.valueOf ( arr[0] ) ; 
		long K = Long.valueOf( arr[1] ) ;
		String[] arr0 = sc.nextLine().trim().split(" ") ;
		int[] arr1 = new int[arr0.length];
		for ( int j=0 ; j<arr0.length  ; j++ )
			arr1[j] = Integer.valueOf( arr0[j]  ) -1 ;
		
		Set<Integer> set01 = new HashSet<>() ;
		List<Integer> list00 = new ArrayList<>() ; 

		set01.add  ( 0 ) ;
		list00.add ( 0 ) ;
		
		int p = -1; 
		while ( true ) {
			p = arr1[list00.get(list00.size()-1)];
			if ( set01.contains(p) ) break ;
			set01.add ( p ) ;
			list00.add ( p ) ;
		}

		if ( K <= list00.size() -1 ) {
			System.out.println( list00.get((int)K ).intValue() +1 ) ;
		} else {
			int rr = list00.indexOf( p ) ;
			K -= list00.indexOf( rr ) ;
			int c = (int) ( K% ( list00.size() - list00.indexOf( rr ) ) ) ;
			System.out.println( list00.get( rr + c ).intValue()  + 1 ) ;
		}
	 }
}