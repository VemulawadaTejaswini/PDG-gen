import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i < 100000; i += 2) {
			for (int j = 0; j < primes.size(); ++j) {
				long p = primes.get(j);
				if (p * p > i) {
					primes.add(i);
					break;
				}
				if (i % p == 0) break;
			}
		}
		while (true) {
			int M = sc.nextInt();
			if (M == 0) break;
			int A = sc.nextInt();
			int B = sc.nextInt();
			long mp = 0;
			long mq = 0;
			for (int i = 0; i < primes.size(); ++i) {
				long q = primes.get(i);
				if (q * 2 > M) break;
				int pos = Collections.binarySearch(primes, (int) Math.min((M / q), q));
				if (pos < 0) pos = -pos - 2;
				if (pos >= 0) {
					long p = primes.get(pos);
					if (p * q <= mp * mq) continue;
					if (p * B < q * A) continue;
					mp = p;
					mq = q;
				}
			}
			System.out.println(mp + " " + mq);
		}
	}
}