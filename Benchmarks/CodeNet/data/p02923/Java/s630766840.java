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
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int max = 0;
		int current = H[N-1];
		int cnt = 0;
		for (int i = N-2; i >= 0; i--) {
			if (H[i] >= current) {
				current = H[i];
				cnt += 1;
				max = Math.max(max, cnt);
				// System.out.println("Y" + cnt);
			} else {
				current = H[i];
				cnt = 0;
				// System.out.println("X");
			}
		}
		System.out.println(max);
	}
}
