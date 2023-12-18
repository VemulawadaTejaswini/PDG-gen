import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			
			//calc 
			// aとbのGCDの素因数p^i * q^j * r^k
			// (p^0, p^1, ... , p^i), (q^0,..., p^j), rの組み合わせで同じ系列を選択しない。--> 問題がおかしいと思われる
			
			long gcd = gcd(a, b);
			
			//ふるい
			Map<Long, Integer> factors = new HashMap<>();
			// iterate 2 to GCD
			for(long i = 1 ; i < gcd ; i++ ) {
				
				boolean isPrimitive = true;
				for(long factor : factors.keySet()) {
					if ( (i+1) % factor == 0 ) {
						isPrimitive = false;
						break;
					}
				}
				
				if ( !isPrimitive ) {
					continue;
				}
				
				long current = gcd;
				int factorNum = 0;
				while ( current % (i+1) == 0 ) {
					factorNum++;
					current = current / (i+1);
				}
				if ( factorNum > 0 ) {
					factors.put(i+1, factorNum);
				}
			}
			
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