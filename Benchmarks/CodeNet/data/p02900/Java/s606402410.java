
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.LongStream;

public class Main {

	private static Set<Long> primeSet = new HashSet<Long>();
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();

			long tmp = getGcd(a, b);
			sieveOfEratosthenes(tmp);

			Set<Long> resultSet = new HashSet<Long>();
			resultSet.add(1l);
			for(long prime : primeSet) {
				if (tmp % prime == 0) {
					resultSet.add(prime);
				}
			}
			System.out.println(resultSet.size());
		}
	}

	static long getGcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

	// ルートxまで
	public static boolean isPrime(int x) {
	    for (long i = 2; i*i <= x; i++) {
	        if (x % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	// 指定したx以下の素数をリストアップする
	public static void sieveOfEratosthenes(long x) {
	    LongStream.rangeClosed(2l, x)
	            .filter(i -> LongStream.rangeClosed(2, (long)Math.sqrt(i))
	                    .allMatch(j -> i%j !=0))
	            .forEach(n -> {
	            	primeSet.add(n);
	            });
	}
}
