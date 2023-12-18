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
		int[][] A = new int[N][N-1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int[] index = new int[N];
		int day = 0;
		while (true) {
			boolean anyMove = false;
			boolean[] moved = new boolean[N];
			for (int i = 0; i < N; i++) {
				if (moved[i]) continue;
				if (index[i] == N - 1) continue;
				int j = A[i][index[i]] - 1;
				if (moved[j]) continue;
				if (index[j] == N - 1) continue;
				int i2 = A[j][index[j]] - 1;
				if (i != i2) continue;
				anyMove = true;
				moved[i] = true;
				moved[j] = true;
				index[i]++;
				index[j]++;
			}
			if (anyMove == false) break;
			day++;
		}
		boolean isAllOk = true;
		for (int i = 0; i < N; i++) {
			if (index[i] != N - 1) {
				isAllOk = false;
				break;
			}
		}
		if (isAllOk) {
			System.out.println(day);
		} else {
			System.out.println("-1");
		}
	}
}
