import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		int[] D = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			D[i] = Integer.parseInt(tokens[i]);
		}
		long MOD = 998244353L;
		Map<Integer, Integer> counts = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!counts.containsKey(D[i])) {
				counts.put(D[i], 1);
			} else {
				counts.put(D[i], counts.get(D[i]) + 1);
			}
		}
		long result = 0L;
		if (!enableA(counts)) {
			System.out.println(result);
		} else if (!enableB(D, counts)) {
			System.out.println(result);
		} else {
			result = 1L;
			int n = counts.keySet().size();
			for (int i = 2; i < n; ++i) {
				long base = (long) counts.get(i - 1);
				long mul = 1L;
				for (int j = 0; j < counts.get(i); ++j) {
					mul *= base;
					mul %= MOD;
				}
				result *= mul;
				result %= MOD;
			}
			System.out.println(result);
		}
	}

	static boolean enableB(int[] D, Map<Integer, Integer> counts) {
		if (D[0] != 0) {
			return false;
		} else if (counts.get(0) > 1) {
			return false;
		} else {
			return true;
		}
	}

	static boolean enableA(Map<Integer, Integer> counts) {
		boolean result = true;
		int n = counts.keySet().size();
		for (int i = 0; i < n; ++i) {
			if (!counts.containsKey(i)) {
				result = false;
				break;
			}
		}
		return result;
	}
}