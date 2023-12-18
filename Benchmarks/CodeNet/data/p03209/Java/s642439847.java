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

	static long solve(int N, long X) {
		long count = 0;
		while (N >= 0) {
			if (N == 0) {
				count += X > 0 ? 1 : 0;
				break;
			}
			if (X == 0) break;
			X--; // ban
			if (X <= H[N-1]) {
				N--;
				continue;
				// return solve(N-1, X);
			}
			X -= H[N-1];
			if (X == 0) break;

			count += 1 + P[N-1];
			X--;
			if (X == 0) break;
			N--;
		}
		return count;
	}

	static long[] P;
	static long[] H;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();

		H = new long[N+1];
		P = new long[N+1];
		H[0] = 1;
		P[0] = 1;
		for (int i = 0; i < N; i++) {
			H[i+1] = H[i] * 2 + 3;
			P[i+1] = P[i] * 2 + 1;
		}
		long ans = solve(N, X);
		System.out.println(ans);

		// System.out.println("BBPPPBPBPPPBB");
		// for (int i = 1; i <= 13; i++) {
		// 	System.out.println(solve(2, i));
		// }
	}
}
