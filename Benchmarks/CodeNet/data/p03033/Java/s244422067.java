import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static<T> void printArrayT(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static class Triple implements Comparable<Triple> {
		public int S, T, X;
		Triple(int S, int T, int X) {
			this.S = S;
			this.T = T;
			this.X = X;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d, %d)", S, T, X);
		}

		@Override
		public int compareTo(Triple o) {
			return this.X - o.X;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 2 * 10^5
		int Q = sc.nextInt(); // 2 * 10^5
		Triple[] STX = new Triple[N];
		int[] D = new int[Q];
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt(); // 10^9
			int t = sc.nextInt(); // 10^9
			int x = sc.nextInt(); // 10^9
			STX[i] = new Triple(s, t, x);
		}
		for (int i = 0; i < Q; i++) {
			D[i] = sc.nextInt(); // 10^9
		}

		Arrays.sort(STX, 0, N);
		// printArrayT(STX);
		for (int time : D) {
			int len = -1;
			for (Triple stx : STX) {
				int sPos = stx.S - time;
				int tPos = stx.T - time;
				// System.out.printf("* %d %d %d %n", sPos, tPos, stx.X);
				if (sPos <= stx.X && stx.X < tPos) {
					len = stx.X;
					break;
				}
			}
			System.out.println(len);
		}
	}
}
