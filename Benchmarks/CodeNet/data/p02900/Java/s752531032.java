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

			//calc 
			// aとbのGCDの素因数p^i * q^j * r^k
			// (p^0, p^1, ... , p^i), (q^0,..., p^j), rの組み合わせで同じ系列を選択しない。--> 問題がおかしいと思われる

			long gcd = gcd(a, b);

			//ふるい
			Map<Long, Integer> factors = new HashMap<>();

			// iterate 2 to GCD
			long p = 2;
			long currentUpperBound = gcd;
			int[] numbers = new int[(int)gcd];
			List<Long> numberList = new ArrayList<>();
			for(long i = 2 ; i <= gcd/2; i++ ) {
				numberList.add(i);
			}

			if ( numberList.size() > 0 ){
				p = numberList.remove(0);
				while ( p <= currentUpperBound ) {
					if (currentUpperBound % p == 0 ) {
						factors.put(p, 1);
						currentUpperBound = currentUpperBound / p;

						long q = p;
						while(q < gcd) {
							numberList.remove(q);
							q+= p;
						}
					}
					else {
						//p++
						p = numberList.remove(0);
					}
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