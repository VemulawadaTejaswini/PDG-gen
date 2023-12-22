import java.util.* ;
public class Main {
	static int findSum( HashMap<Integer,Integer> map ) {
		int result = 0 ;
		for( int key : map.keySet() ) {

			result += (map.get(key))*key ;
		}
		return result ;
	}
	public static void main(String[] args) {
		Scanner S = new Scanner( System.in ) ;
		int n = S.nextInt() ;
		int[] arr = new int[n] ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		for( int i=0;i<n;i++ ){
			arr[i] = S.nextInt();
			map.put( arr[i] , map.getOrDefault( arr[i] , 0 )+1 ) ;
		} 
		int op = S.nextInt() ;
		for( int i=0;i<op;i++ ) {
			int a = S.nextInt() ;
			int b = S.nextInt() ;
			int value = map.get( a ) ;
			map.remove( a ) ;
			map.put( b , map.getOrDefault( b ,0 )+value ) ;
			System.out.println( findSum(map) );
		}
	}
}