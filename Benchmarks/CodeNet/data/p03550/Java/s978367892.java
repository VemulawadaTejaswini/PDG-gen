import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no3();
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			Integer N = sc.nextInt();
			Long X = sc.nextLong();
			Long Y = sc.nextLong();

			long[] a = new long[N];

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(max_calc(X, Y, a));
		}
	}

	static long max_calc(long X, long Y, long[] a) {
		long max_score = Math.abs(X - Y);
		if (a.length == 0)
			return max_score;
		long score;
		long b[];
		for (int i = 0; i < a.length; i++) {
			X = a[i];
			b = new long[a.length - i - 1];
			for (int j = 0; j < b.length; j++) {
				b[j] = a[i + j + 1];
			}
			score = min_calc(X, Y, b);
			if (max_score < score)
				max_score = score;
		}
		return max_score;
	}

	static long min_calc(long X, long Y, long[] a) {
		long min_score = Math.abs(X - Y);
		if (a.length == 0)
			return min_score;
		long score;
		long b[];
		for (int i = 0; i < a.length; i++) {
			Y = a[i];
			b = new long[a.length - i - 1];
			for (int j = 0; j < b.length; j++) {
				b[j] = a[i + j + 1];
			}
			score = max_calc(X, Y, b);
			if (min_score > score)
				min_score = score;
		}
		return min_score;
	}
}
