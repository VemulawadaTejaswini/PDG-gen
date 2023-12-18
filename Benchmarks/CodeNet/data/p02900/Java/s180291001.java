
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
		System.out.println(set.size());

	}

	static Set<Long> func(long value) {
		Set<Long> result = new HashSet<>();
		if (value == 1L) {
			result.add(1L);
			return result;
		}
		if (isPrime(value)) {
			result.add(value);
			result.add(1L);
			return result;
		}
		long v = 2;
		while (true) {
			if (value % v == 0) {
				break;
			}
			++v;
		}
		if (v == value) {
			result.add(1L);
			result.add(value);
			return result;
		} else {
			result.add(v);
			result.addAll(func(value / v));
			return result;
		}
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

	static boolean isPrime(long val) {
		if (val == 2) {
			return true;
		}
		if ((val > 2) && val % 2 == 0) {
			return false;
		}
		long s = 0;
		long t = val - 1;
		while (t % 2 == 0) {
			s += 1;
			t = t >> 1;
		}
		long a = (long) (Math.random() * (val - 1));
		if (a < 1) {
			a = 1L;
		}
		if ((long) Math.pow(a, t) % val == 1) {
			return true;
		}
		for (long i = 0; i < s; ++i) {
			if (Math.pow(a, i) * t % val == (val - 1)) {
				return true;
			}
		}
		return false;
	}

}