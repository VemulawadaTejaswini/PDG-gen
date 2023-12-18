import java.util.*;
 
 public class Main {
     public static void main(String args[] ) throws Exception {
		 Scanner sc = new Scanner(System.in);

		 String[] arr = sc.nextLine().split(" ") ;

		 int N = Integer.valueOf ( arr[0]  ) ;
		 int K = Integer.valueOf ( arr[1]  ) ;
			
		 List<Double> list = new ArrayList<>() ;
		 arr = sc.nextLine().split(" ") ;
		 for ( int j=0 ; j<arr.length ; j++ ) {
			 int v = Integer.valueOf ( arr[j]  ) ;
			 list.add ( (double)v * ( (double) v +1 ) / 2 / v ) ;
		 }

		 List<Double> list2 = new ArrayList<>() ; 

		 double v0 = 0 ;
		 double v1 = 0 ;
		 for ( double v : list ) {
			 if ( list2.size() == K ) {
				 v1 -= list2.get(0).doubleValue() ;
				 list2.remove(0) ;
				 v1 += v ;
				 list2.add ( v ) ; 
				 v0 = Math.max ( v0  , v1 ) ;

			 } else {
				list2.add ( v ) ;
				v1 += v ;
			 }
		 }

		 System.out.print( String.format( "%.8f" , v0 ) ) ;

	 }
}