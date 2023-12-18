import java.util.*;

public class Main {
	int N;
	Set<Integer> primeSet = new HashSet<>();
	Map<Integer, Integer> count = new HashMap<>();
	int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
	int result = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		in.close();
		for (Integer prime : primes) {
			primeSet.add(prime);
		}
	}

	List<Integer> getYakusuu(int val) {
		List<Integer> result = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(val) + 0.1; ++i) {
			if (val % i == 0) {
				result.add(i);
				if (primeSet.contains(val / i)) {
					result.add(val / i);
				} else {
					result.addAll(getYakusuu(val / i));
				}
			}
		}

		return result;
	}

	void calc() {
		List<Integer> yakusuu = new ArrayList<>();
		for (int i = 2; i <= N; ++i) {
			if (primeSet.contains(i)) {
				yakusuu.add(i);
			}
			yakusuu.addAll(getYakusuu(i));
		}
		Collections.sort(yakusuu);
		for (Integer y : yakusuu) {
			if (!count.containsKey(y)) {
				count.put(y, 1);
			} else {
				count.put(y, count.get(y) + 1);
			}
		}

		int ones = 0;
		int twos = 0;
		for (Integer key : count.keySet()) {
			if (count.get(key) == 2 || count.get(key) == 3) {
				ones++;
			} else if (count.get(key) >= 4) {
				twos++;
			}
		}
		// System.out.println(ones + ", " + twos);
		result += (twos - 1) * twos / 2 * ones;
		// System.out.println(result);
		if (twos >= 3) {
			result += (twos - 2) * (twos - 1) * twos / 6;
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}
