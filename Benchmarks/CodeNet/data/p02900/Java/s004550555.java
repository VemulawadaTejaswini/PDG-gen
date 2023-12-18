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
			
			long gcd = gcd2(a, b);

			Map<Long, Integer> factors = new HashMap<>();

			// iterate 2 to GCD
			List<Long> numberList = new ArrayList<>();
			for(long i = 2 ; i <= gcd / 2 + 1 ; i++ ) {
				numberList.add(i);
			}
			
			long upper = gcd;
			while(numberList.size() > 0 ) {
				long p = numberList.remove(0);
				if ( p > upper ) {
					break;
				}
				
				if ( gcd % p == 0 ) {
//					System.out.println("## p = " + p);
					factors.put(p, 1);
					//remove from numberList
					
					long val = p;
					while ( val <= gcd /2 * 1) {
//						System.out.println(val);
						numberList.remove(val);
						val += p;
					}
					upper = (gcd / p) + 1;
				}
			}

			System.out.println(factors.size() + 1);
		}
	}
	
	public static long gcd2(long a, long b) {
		long vala = a, valb = b;
		if ( valb > vala ) {
			long temp = vala;
			vala = valb;
			valb = temp;
		}
		while ( vala % valb != 0 ) {

			long temp = vala % valb;
			if ( temp > valb ) {
				vala = temp;
			}
			else {
				vala = valb;
				valb = temp;
			}
		}
		return valb;
	}

}