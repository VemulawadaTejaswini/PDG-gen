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
		double[] P = new double[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextDouble();
		}
		double[] dist = { 1.0 };
		for (int i = 0; i < N; i++) {
			double p = P[i];
			double[] next = new double[i + 2];
			for (int j = 0; j <= i; j++) {
				next[j] = dist[j] * p;
			}
			double p1 = 1 - p;
			for (int j = 0; j <= i; j++) {
				next[j + 1] += dist[j] * p1;
			}
			dist = next;
		}
		// 1 -> 1
		// 2 -> 2
		// 3 -> 3, 2
		// 4 -> 4, 3
		// 5 -> 5, 4, 3
		int lim = (N + 1) / 2;
		double sum = 0;
		for (int i = 0; i < lim; i++) {
			sum += dist[i];
		}
		System.out.println(sum);
	}
}
