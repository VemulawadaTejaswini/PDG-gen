import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Map<Integer, Long> aMap = new HashMap<Integer, Long>();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
			if (aMap.containsKey(data[i])) {
				aMap.put(data[i], aMap.get(data[i]) + 1);
			} else {
				aMap.put(data[i], 1L);
			}
		}
		Map<Long, Long> map = new HashMap<Long, Long>();
		long total = 0;
		for (long z : data) {
			long m = aMap.get((int) z);
			map.put(z, m * (m - 1) / 2);
		}

		for (Long key : map.keySet())
			total += map.get(key);

		for (int i = 0; i < data.length; i++) {
			long r = total;
			long k = data[i];
			if (aMap.get((int) k) == 1) {
				System.out.println(r);
			} else {
				long value = map.get(k);
				long N = getN(value);
				r -= value;
				r += (N - 1) * (N - 2) / 2;
				System.out.println(r);
			}
		}

	}

	static long getN(long v) {
		long x = (long) Math.sqrt(v) - 1;
		while (x * (x - 1) != 2 * v) {
			x++;
		}
		return x;
	}

}
