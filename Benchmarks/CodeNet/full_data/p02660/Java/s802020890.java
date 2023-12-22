import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long clone = N;
		Set<Long> set = new HashSet<>();
		long count = 0;
		boolean isPrime = true;
		if (N == 1) {
			System.out.println(0);
			System.exit(0);
		}
		for (long j = 2; j <= Math.sqrt(clone); j++) {
			if (N%j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(count+1);
			System.exit(0);
		}
		al : while (true) {
			pr :
			for (long i = 2;;i++) {
				if (N == 1) {
					break al;
				}
				if (set.contains(i)) {
					continue;
				}
				boolean isPrime2 = true;
				for (long j = 2; j <= Math.sqrt(N); j++) {
					if (N%j == 0) {
						isPrime2 = false;
						break;
					}
				}
				if (isPrime2) {
					System.out.println(count);
					System.exit(0);
				}
				if (N%i == 0) {
					N /= i;
					set.add(i);
					count++;
					break;
				} else {
					continue;
				}
			}
		}
		System.out.println(count);
	}
}