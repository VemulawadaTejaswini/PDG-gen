import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf ( sc.nextLine().trim() ) ;


		InputStreamReader s = new InputStreamReader(System.in) ; 
		int tt = 0 ;
		int idx0=0  ;
		int[] arr = new int[N] ; 
		while ( true ) {
			int v = s.read();
			if ( v >= 48 && v <=57 ) {
				tt = tt * 10 + ( v - 48 ) ;
			} else if ( v == 32 ) {
				if ( tt ==0 ) continue  ;
				arr[idx0++] = tt ; 
				tt = 0 ;
			}  else {
				arr[idx0++] = tt ; 
				break ;
			}

		}
		Arrays.sort  ( arr ) ;
		int mm = arr[arr.length-1] ;

		BitSet bs_prime = createPrimes( mm + 1 ) ; 
		int[] primes = new int[bs_prime.cardinality()] ; 
		for ( int idx=0,p=bs_prime.nextSetBit(0) ; p>=0 ; p=bs_prime.nextSetBit(p+1) )
			primes[idx++] = p ; 

		Map<Integer,Set<Integer>> map = new HashMap<>() ;	
		func ( 1  ,new HashSet<>() , 0 , primes , mm , map ) ;	


		Set<Integer> set00 = new HashSet<>() ; 
		int judge = -1 ;
		for ( int j=0 ; j<arr.length ; j++ ) {
			if ( ! Collections.disjoint ( set00 , map.get( arr[j] ) ) ) {
				judge = 1 ;
				break ; 
			}
			set00.addAll ( map.get( arr[j] ) ) ;	
		}

		if ( judge == 1 ) {
			set00 = new HashSet<>(map.get(arr[0]) ) ; 
			for ( int j=0 ; j<arr.length ; j++ ) {
				set00.retainAll( map.get( arr[j] ) ) ;
				if ( set00.isEmpty() ) {
					judge = 2 ; 
					break ;
				}
			}
		}
		if ( judge == -1 ) {
			System.out.println( "pairwise coprime" ) ;
		} else if ( judge == 2 ) {
			System.out.println( "setwise coprime" ) ;
		} else {
			System.out.println( "not coprime" ) ;
		}
	}

	public static void func ( int v0 , Set<Integer> set00 , int k0 , int[] primes  , long mm , Map<Integer,Set<Integer>> map ) {
		map.put( v0 , set00 ) ; 
		for ( int j=k0  ;j<primes.length ; j++ ) {
			int prime = primes[j] ; 
			if ( (long)v0 * prime > mm ) break ; 
			Set<Integer> set01 = new HashSet<>(set00) ;
			set01.add ( prime ) ; 
			func ( v0 * prime , set01 , j , primes , mm  , map ) ;
		}
	}

	public static BitSet createPrimes( int n ){
		BitSet bs = new BitSet();
		bs.set( 2, n ) ;
		for ( int i=bs.nextSetBit(0) ; i>=0 ; i=bs.nextSetBit(i+1) ){
			if ( (long) i * i > bs.length() ) break;
			for ( int k=2 ; (long)k*i < bs.length() ; k++ )
				bs.clear(k*i);
		}
		return bs ;
	}
}