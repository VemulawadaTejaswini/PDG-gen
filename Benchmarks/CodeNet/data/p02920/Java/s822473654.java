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

	static void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] S = nextIntArray(sc, 1 << N);
		Arrays.sort(S);
		reverseArray(S);
		boolean ok = true;
		outer: for (int i = 0; i < N; i++) {
			int lim = 1 << i;
			for (int j = 0; j < lim; j++) {
				if (S[j] <= S[j + lim]) {
					ok = false;
					break outer;
				}
			}
		}

		System.out.println(ok ? "Yes" : "No");
	}
}
