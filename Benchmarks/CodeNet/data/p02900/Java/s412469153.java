import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long gcd = gcd(scanner.nextLong(), scanner.nextLong());
		scanner.close();
		int count = 1;
		int index = 0;
		while ((long) primeList.get(index) * primeList.get(index) <= gcd) {
			if (gcd % primeList.get(index) == 0) {
				count++;
				while (gcd % primeList.get(index) == 0)
					gcd /= primeList.get(index);
			}
			index++;
		}
		if (gcd > 1)
			count++;

		System.out.println(count);
	}

	static List<Integer> primeList = new ArrayList<Integer>();
	static {
		primeList.add(2);
		boolean[] sieve = new boolean[500000];
		for (int i = 1; 2 * i * (i + 1) < 500000; i++) {
			for (int j = i; 2 * i * j + i + j < 500000; j++) {
				sieve[2 * i * j + i + j] = true;
			}
		}
		for (int i = 1; i < 500000; i++) {
			if (sieve[i])
				continue;
			primeList.add(i * 2 + 1);
		}
	}

	static long gcd(long a, long b) {
		if (a % b == 0)
			return b;
		return gcd(b, a % b);
	}
}
