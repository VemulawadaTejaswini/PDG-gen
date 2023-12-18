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
		int[][] A = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int[] index = new int[N];
		int[] nowA = new int[N];
		for (int i = 0; i < N; i++) {
			nowA[i] = A[i][0];
		}
		int[] lastMoved = new int[N];
		for (int i = 0; i < N; i++) {
			lastMoved[i] = i;
		}
		int lastMovedSize = N;
		int[] nextLastMoved = new int[N];

		boolean[] moved = new boolean[N];
		int day = 0;
		while (true) {
			int nextLastMovedSize = 0;
			boolean anyMove = false;
			Arrays.fill(moved, false);
			for (int x = 0; x < lastMovedSize; x++) {
				int i = lastMoved[x];
				int j = nowA[i] - 1;
				if (j < 0) continue;
				if (moved[i]) continue;
				if (moved[j]) continue;
				if (nowA[j] - 1 != i) continue;
				anyMove = true;
				moved[i] = true;
				moved[j] = true;
				nowA[i] = A[i][++index[i]];
				nowA[j] = A[j][++index[j]];
				nextLastMoved[nextLastMovedSize++] = i;
				nextLastMoved[nextLastMovedSize++] = j;
			}
			if (anyMove == false) break;
			day++;

			int[] tmp = lastMoved;
			lastMoved = nextLastMoved;
			nextLastMoved = tmp;
			lastMovedSize = nextLastMovedSize;
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
