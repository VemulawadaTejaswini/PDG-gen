import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 String S = sc.nextLine() ;

		 int N = Integer.valueOf( S ) ;
		 S = sc.nextLine() ;
		 char[] arr = new char[N] ;
		 for ( int j=0 ; j<S.length() ; j++ ) 
			 arr[j] = S.charAt(j)  ;
//		System.out.println( S ) ;
//		System.out.println( Arrays.toString( arr ) ) ;

		 S = sc.nextLine() ;
		 int Q = Integer.valueOf( S ) ;
		 for ( int j=0 ; j<Q ; j++ ) {
			 String[] query = sc.nextLine().split(" ") ;
			 int cmd = Integer.valueOf( query[0] ) ;
			 if ( cmd == 1 ) {
				 int  p1  = Integer.valueOf( query[1] ) ;
				 char c1  = query[2].charAt(0) ;
				 arr[p1-1] = c1 ;

			 } else {
				 int p1 = Integer.valueOf( query[1] ) ;
				 int p2 = Integer.valueOf( query[2] ) ;
				 Set<Character> set = new HashSet<>() ; 
				 for ( int x=p1-1 ;x<=p2-1 ; x++ )
					 set.add ( arr[x] ) ;
				 System.out.println( set.size() ) ;
			 }


		 }


	 }
}
