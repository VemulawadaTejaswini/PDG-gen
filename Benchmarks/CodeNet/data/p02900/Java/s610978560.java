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
		if(value == 1L) {
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
}
