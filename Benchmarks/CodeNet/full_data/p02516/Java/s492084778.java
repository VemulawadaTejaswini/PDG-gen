import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static long[] count = new long[1000001];

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> primes = primes(count.length + 1);
		count[1] = 2;
		for (int i = 2; i < count.length; ++i) {
			int v = i;
			long divisor = 1;
			for (int j = 0; j < primes.size() && v > 1; ++j) {
				long p = primes.get(j);
				if (p * p > i) {
					divisor *= 2;
					break;
				}
				int count = 0;
				while (v % p == 0) {
					v /= p;
					++count;
				}
				divisor *= count + 1;
			}
			count[i] = count[i - 1] + i - divisor + 1;
		}
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			System.out.println(count[sc.nextInt()]);
		}
	}

	public static ArrayList<Integer> primes(int max) {
		if (max < 2) {
			return new ArrayList<Integer>();
		}
		BitSet primeSet = new BitSet(max / 2);
		primeSet.set(1, max / 2);
		int limit = (int) Math.sqrt(max);
		for (int i = 3; i <= limit; i += 2) {
			if (!primeSet.get(i / 2)) {
				continue;
			}
			for (int j = i * i; j < max; j += i * 2) {
				primeSet.clear(j / 2);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		for (int i = primeSet.nextSetBit(0); i >= 0; i = primeSet.nextSetBit(i + 1)) {
			list.add(i * 2 + 1);
		}
		return list;
	}

}