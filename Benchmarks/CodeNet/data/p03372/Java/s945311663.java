import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static long C;
	public static long[] positions, values, prefixes, suffixes, maxs1, maxs2;

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		N = Integer.parseInt(st.nextToken());
		C = Long.parseLong(st.nextToken());
		positions = new long[N + 1];
		values = new long[N + 1];
		prefixes = new long[N + 1];
		suffixes = new long[N + 1];
		maxs1 = new long[N + 1];
		maxs2 = new long[N + 1];
		positions[0] = 0;
		values[0] = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(f.readLine());
			long x = Long.parseLong(st.nextToken());
			long v = Long.parseLong(st.nextToken());
			positions[i + 1] = x;
			values[i + 1] = v;
		}
		for (int i = 1; i <= N; i++) {
			prefixes[i] = prefixes[i - 1] + values[i];
		}
		suffixes[N] = values[N];
		for (int i = N - 1; i >= 0; i--) {
			suffixes[i] = suffixes[i + 1] + values[i];
		}
		long max = 0;
		for (int i = N; i > 0; i--) {
			max = Math.max(max, suffixes[i] - (C - positions[i]));
			maxs1[i] = max;
		}
		max = 0;
		for (int i = 0; i <= N; i++) {
			max = Math.max(max, prefixes[i] - positions[i]);
			maxs2[i] = max;
		}
		long res = 0;
		for (int i = 0; i <= N; i++) {
			res = Math.max(res, prefixes[i] - positions[i]);
			res = Math.max(res, suffixes[i] - (C - positions[i]));
			if (i != N)
				res = Math.max(res, prefixes[i] + maxs1[i + 1] - 2 * positions[i]);
			if (i != 0)
				res = Math.max(res, suffixes[i] + maxs2[i - 1] - 2 * (C - positions[i]));
		}
		System.out.println(res);
	}
}