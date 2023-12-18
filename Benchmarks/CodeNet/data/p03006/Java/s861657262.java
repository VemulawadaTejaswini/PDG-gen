import java.util.*;

public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static<T> void printArrayT(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static class Tuple implements Comparable<Tuple> {
		public int X, Y;
		Tuple(int X, int Y) {
			this.X = X;
			this.Y = Y;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d)", X, Y);
		}

		@Override
		public int compareTo(Tuple o) {
			int a = this.X - o.X;
			if (a != 0) return a;
			int b = this.Y - o.Y;
			return b;
		}
	}

	static int solve2(int N, Tuple[] xy, long p, long q) {
		long flag = 0;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			long flagI = 1 << i;
			if ((flag & flagI) != 0) continue;
			flag |= flagI;
			cnt++;

			long nextX = ((long)xy[i].X) + p;
			long nextY = ((long)xy[i].Y) + q;
			for (int j = i + 1; j < N; j++) {
				long flagJ = 1 << j;
				if (xy[j].X == nextX && xy[j].Y == nextY && (flag & flagJ) == 0) {
					flag |= flagJ;
					nextX += p;
					nextY += q;
				}
			}
		}
		return cnt;
	}

	static int solve(int N, Tuple[] xy) {
		if (N == 1) return 1;
		int min = N - 1;
		for (int i = 0; i < N; i++) {
			long flagI = 1 << i;
			for (int j = i + 1; j < N; j++) {
				long flagJ = 1 << j;
				long p = ((long)xy[j].X) - ((long)xy[i].X);
				long q = ((long)xy[j].Y) - ((long)xy[i].Y);
				if (p == 0 && q == 0) continue;

				int val = solve2(N, xy, p, q);
				min = Math.min(min, val);
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Tuple[] xy = new Tuple[N];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			xy[i] = new Tuple(x, y);
		}
		Arrays.sort(xy);
		// printArrayT(xy);
		int result = solve(N, xy);
		System.out.println(result);
	}
}
