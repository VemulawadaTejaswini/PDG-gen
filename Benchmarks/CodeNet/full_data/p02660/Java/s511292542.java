import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		long N = Long.valueOf ( sc.nextLine().trim() ) ;

		BitSet bs = createPrimes ( 1000000 ) ; 
		List<Integer> primes = new ArrayList<>();
		for ( int p=bs.nextSetBit(0) ;p>=0 ; p=bs.nextSetBit(p+1) )
			primes.add ( p ) ;

		Map<Long,Integer> map = createFactors ( N , primes ) ;
		int cnt = 0 ;
		for ( long p : map.keySet() ) {
			long v = p ;
			while ( N % v ==0 ) {
				cnt += 1; 
				N /= v ;
				v *= p ;
			}
		}
		System.out.println( cnt ) ;
		
	 }
	public static BitSet createPrimes( int n ){
		BitSet bs = new BitSet();
		bs.set( 2, n ) ;
		for ( int i=bs.nextSetBit(0) ; i>=0 ; i=bs.nextSetBit(i+1) ){
			if ( (long) i * i > bs.length() ) break;
			for ( int k=2 ; (long)k*i < bs.length() ; k++ )
				bs.clear(k*i);
		}

