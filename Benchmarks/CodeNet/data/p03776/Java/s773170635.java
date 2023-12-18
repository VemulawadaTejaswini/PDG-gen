import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int A = sc.nextInt();
		final int B = sc.nextInt();

		long[] items = new long[N];
		HashMap<Long, Integer> itemCount = new HashMap<>();

		for (int i = 0; i < N; i++) {
			long v = sc.nextLong();
			items[i] = v;
			itemCount.put(v, itemCount.getOrDefault(v, 0) + 1);
		}

		Long[] uniqNums = itemCount.keySet().toArray(new Long[itemCount.size()]);
		Arrays.sort(uniqNums);

		int ai, ar, bi, br;
		ai = uniqNums.length - 1;
		ar = A;
		bi = uniqNums.length - 1;
		br = B;
		while (ar >= itemCount.get(uniqNums[ai])) {
			ar -= itemCount.get(uniqNums[ai]);
			ai--;
		}
		while (br >= itemCount.get(uniqNums[bi])) {
			br -= itemCount.get(uniqNums[bi]);
			bi--;
		}

		double maxAvg = 0;
		long patterns = 0;
		if (ai == (uniqNums.length - 1) && bi == (uniqNums.length - 1)) {
			maxAvg = (double) uniqNums[uniqNums.length - 1];
			for (int i = ar; i <= br; i++) {
				patterns += combination(itemCount.get(uniqNums[uniqNums.length - 1]), i);
			}
		} else {
			long sum = 0;
			for (int i = uniqNums.length - 1; i > ai; i--) {
				sum += uniqNums[i] * itemCount.get(uniqNums[i]);
			}
			sum += uniqNums[ai] * ar;
			maxAvg = (double) sum / A;
			patterns = combination(itemCount.get(uniqNums[ai]), ar);
		}
		System.out.println(maxAvg);
		System.out.println(patterns);
		sc.close();
	}

	private long combination(long n, long r) {
		if (n <= r) {
			return 1L;
		}
		long c = 1L;
		for (long i = 1L; i <= r; i++) {
			c *= ((n - i) + 1);
			c /= i;
		}
		return c;
	}
}