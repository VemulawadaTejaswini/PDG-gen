import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		long A = Long.parseLong(tokens[0]);
		long B = Long.parseLong(tokens[1]);
		long gcd = gcd(A, B);
		Set<Long> set = func(gcd);
		Set<Long> count = count(set, gcd);
		System.out.println(count.size());

	}

	static Set<Long> count(Set<Long> set, long max) {
		Set<Long> result = new HashSet<>();
		List<Long> list = new ArrayList<>(set.size());
		list.addAll(set);
		Collections.sort(list);
		result.add(1L);
		for (int i = 1; i < list.size(); ++i) {
			long val = list.get(i);
			if (set.contains(val)) {
				result.add(val);
			}
			// 倍数をフィルタリング
			long v = val;
			while (v <= max) {
				if (set.contains(v)) {
					set.remove(v);
				}
				v += val;
			}
		}
		return result;
	}

	/**
	 * 約数を求める
	 * 
	 * @param value
	 * @return
	 */
	static Set<Long> func(long value) {
		Set<Long> result = new HashSet<>();
		result.add(1L);
		result.add(value);
		for (long i = 2; i < (long) (Math.sqrt((double) value)) + 1L; ++i) {
			if (value % i == 0) {
				result.add(i);
				result.add(value / i);
			}
		}
		return result;
	}

	static long gcd(long large, long small) {
		if (small > large) {
			return gcd(small, large);
		}
		if (large % small == 0) {
			return small;
		}
		return gcd(small, large % small);
	}
}
