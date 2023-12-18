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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		long count = 0;
		for (int b = K + 1; b <= N; b++) {
			
			if (N%b == 0) {
				count += (N/b) * (b - K);
			} else {
				int step = (N-1)/b;
				count += step * (b - K);
				int lim = N - step * b;
				if (K == 0) {
					count += lim;
				} else {
					count += Math.max(0, lim - K + 1);
				}
			}
			// System.out.println("b = " + b + ", count = " + count);
		}
		System.out.println(count);
	}
}
