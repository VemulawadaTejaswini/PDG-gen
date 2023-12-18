
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	private static Set<Integer> primeSet = new HashSet<Integer>();
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();

			long tmp = getGcd(a, b);
			sieveOfEratosthenes((int)Math.sqrt(tmp) + 1);

			Set<Integer> resultSet = new HashSet<Integer>();
			resultSet.add(1);
			for(int prime : primeSet) {
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
	    for (int i = 2; i*i <= x; i++) {
	        if (x % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	// 指定したx以下の素数をリストアップする
	public static void sieveOfEratosthenes(int x) {
	    IntStream.rangeClosed(2, x)
	            .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
	                    .allMatch(j -> i%j !=0))
	            .forEach(n -> {
	            	primeSet.add(n);
	            });
	}
}
