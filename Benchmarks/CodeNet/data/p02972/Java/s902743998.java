import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static class Triple implements Comparable<Triple> {
	// 	public int A, B, C;
	// 	Triple(int A, int B, int C) {
	// 		this.A = A;
	// 		this.B = B;
	// 		this.C = C;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return String.format("(%d, %d, %d)", A, B, C);
	// 	}

	// 	@Override
	// 	public int compareTo(Triple o) {
	// 		int a = this.A - o.A;
	// 		if (a != 0) return a;
	// 		int b = this.B - o.B;
	// 		if (b != 0) return b;
	// 		return this.C - o.C;
	// 	}
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		// printArray(A);
		int[] sum = new int[N+1];
		for (int i = N; i > 0; i--) {
			// if (i * 2 > N) {
			// 	sum[i] = A[i];
			// 	continue;
			// }
			int sum2 = A[i];
			for (int j = i * 2; j <= N; j += i) {
				sum2 += sum[j];
			}
			sum[i] = sum2 % 2;
		}
		// printArray(sum);

		int cnt = 0;
		boolean isFirst = true;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (sum[i] != 0) {
				cnt++;
				if (isFirst) {
					isFirst = false;
				} else {
					sb.append(" ");
				}
				sb.append(i);
			}
		}

		System.out.println(cnt);
		System.out.println(sb.toString());
	}
}
