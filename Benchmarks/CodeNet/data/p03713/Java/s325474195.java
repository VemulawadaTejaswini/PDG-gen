import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static long diff(long a, long b, long c) {
		long max = Math.max(Math.max(a, b), c);
		long min = Math.min(Math.min(a, b), c);
		return max - min;
	}

	static long solve2(long W, long H, long one) {
		// System.out.printf("%d %d %d %n", W, H, one);
		if (W < 0) return Integer.MAX_VALUE;
		if (H < 0) return Integer.MAX_VALUE;
		if (one < 0) return Integer.MAX_VALUE;

		// 横
		long h = H / 2;
		long min = diff(W * h, W * (H-h), one);
		long w = W / 2;
		long min2 = diff(w * H, (W - w) * H, one);
		return Math.min(min, min2);
	}

	static long solve(long W, long H) {
		long min = Integer.MAX_VALUE;
		// 横分割
		long h = H / 3;
		min = Math.min(min, solve2(W, H - h, W * h));
		h += 1;
		min = Math.min(min, solve2(W, H - h, W * h));
		// 縦
		long w = W / 3;
		min = Math.min(min, solve2(W - w, H, w * H));
		w += 1;
		min = Math.min(min, solve2(W - w, H, w * H));

		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		long min = solve(W, H);
		System.out.println(min);
	}
}
