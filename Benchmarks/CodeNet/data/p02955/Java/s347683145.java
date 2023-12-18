import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long K = Long.parseLong(tokens[1]);
		tokens = in.readLine().split(" ");
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			sum += A[i];
		}
		List<Long> yakusuu = getYakusuu(sum);
		long result = 1;
		for (int i = 0; i < yakusuu.size(); ++i) {
			if (isEnable(A, K, yakusuu.get(i))) {
				result = yakusuu.get(i);
				break;
			}
		}
		System.out.println(result);
	}

	static boolean isEnable(long[] A, long K, long target) {
		long[] a = new long[A.length];
		for (int i = 0; i < A.length; ++i) {
			a[i] = A[i] % target;
		}
		Arrays.sort(a);

		long count = 0;
		long diff = 0;
		for (int i = 0; i < a.length; ++i) {
			if (a[i] + diff >= target) {
				diff -= target - a[i];
			} else {
				count += a[i];
				diff += a[i];
			}
			if (count > K) {
				return false;
			}
		}
		return true;
	}

	static List<Long> getYakusuu(long value) {
		Deque<Long> small = new ArrayDeque<>();
		Deque<Long> large = new ArrayDeque<>();
		for (long v = 1; v <= 1 + (long) Math.floor(Math.sqrt((double) value)); ++v) {
			if (value % v == 0) {
				small.addFirst(v);
				large.addLast(value / v);
			}
		}
		List<Long> result = new ArrayList<>(small.size() + large.size());
		result.addAll(large);
		result.addAll(small);
		return result;
	}
}