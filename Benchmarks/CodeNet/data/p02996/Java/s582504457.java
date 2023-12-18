import java.util.*;

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

	public static class Triple implements Comparable<Triple> {
		public int A, B, C;
		Triple(int A, int B, int C) {
			this.A = A;
			this.B = B;
			this.C = C;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d, %d)", A, B, C);
		}

		@Override
		public int compareTo(Triple o) {
			int a = this.A - o.A;
			if (a != 0) return a;
			int b = this.B - o.B;
			if (b != 0) return b;
			return this.C - o.C;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Triple[] AB = new Triple[N];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			AB[i] = new Triple(b, a, 0);
		}
		Arrays.sort(AB);
		long sum = 0;
		boolean ok = true;
		for (Triple ab : AB) {
			sum += ab.B;
			if (sum > ab.A) {
				ok = false;
				break;
			}
		}

		System.out.println(ok ? "Yes" : "No");
	}
}
