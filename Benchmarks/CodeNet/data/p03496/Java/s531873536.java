import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple {
		int a, b;

		Tuple(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public String toString() {
			return (a + 1) + " " + (b + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long[] a = new long[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			a[i] = Long.parseLong(tokens[i]);
		}
		long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
		int minIndex = -1, maxIndex = -1;
		for (int i = 0; i < N; ++i) {
			if (min > a[i]) {
				min = a[i];
				minIndex = i;
			}
			if (max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}
		List<Tuple> result = new ArrayList<>();
		if (Math.abs(min) > Math.abs(max)) {
			// 全体にminを足す
			for (int i = 0; i < N; ++i) {
				if (i == minIndex) {
					continue;
				}
				a[i] += min;
				result.add(new Tuple(minIndex, i));
			}
			// 後ろから順に足していく
			for (int i = N - 1; i > 0; --i) {
				result.add(new Tuple(i, i - 1));
				a[i - 1] += a[i];
			}
		} else {
			// 全体にmaxを足す
			for (int i = 0; i < N; ++i) {
				if (i == maxIndex) {
					continue;
				}
				a[i] += max;
				result.add(new Tuple(maxIndex, i));
			}
			// 前から順に足していく
			for (int i = 0; i + 1 < N; ++i) {
				result.add(new Tuple(i, i + 1));
				a[i + 1] += a[i];
			}
		}
		// 回答出力
		System.out.println(result.size());
		for (int i = 0; i < result.size(); ++i) {
			System.out.println(result.get(i).toString());
		}
	}
}