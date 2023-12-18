import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long gcd = gcd(a, b);

			//ふるい
			Map<Long, Integer> factors = new HashMap<>();

			// iterate 2 to GCD
			long p = 2;
//			long currentUpperBound = gcd;
			List<Long> numberList = new ArrayList<>();
			for(long i = 2 ; i <= gcd/2; i++ ) {
				numberList.add(i);
			}
			
			while(numberList.size() > 0 ) {
				p = numberList.remove(0);
				
				if ( gcd % p == 0 ) {
					factors.put(p, 1);
					//remove from numberList
					for(int j = 0 ; j < numberList.size(); j++ ) {
						long val = numberList.get(j);
						if ( val % p == 0 ) {
							numberList.remove(val);
						}
					}
				}
			}
//			if ( numberList.size() > 0 ){
//				p = numberList.remove(0);
//				while ( p <= currentUpperBound ) {
//					if (currentUpperBound % p == 0 ) {
//						factors.put(p, 1);
//						currentUpperBound = currentUpperBound / p;
//
//						long q = p;
//						while(q < gcd) {
//							numberList.remove(q);
//							q+= p;
//						}
//					}
//					else {
//						//p++
//						p = numberList.remove(0);
//					}
//				}
//			}

			System.out.println(factors.size() + 1);
		}
	}

	public static long gcd(long a, long b) {
		if ( a == b ) return a;
		if ( a > b) {
			return gcd(a-b, b);
		}
		else {
			return gcd(a, b-a);
		}
	}

}