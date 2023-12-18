import java.util.*;

public class Main {
	static final int[][] PAIR = new int[][]{{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}};
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		int[] arrA = new int[3];
		int[] arrB = new int[3];
		for (int i = 0; i < 3; i++) {
			arrA[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			arrB[i] = sc.nextInt();
		}
		n = exchange(n, arrA, arrB);
		n = exchange(n, arrB, arrA);
		System.out.println(n);
	}
	
	static long exchange(long count, int[] from, int[] to) {
		long max = 0;
		for (int i = 0; i < PAIR.length; i++) {
			long x = count;
			long next = 0;
			for (int j = 0; j < PAIR[i].length; j++) {
				int f = from[PAIR[i][j]];
				int t = to[PAIR[i][j]];
				if (t / f <= 0) {
					break;
				}
				long y = x / f;
				x %= f;
				next += y * t;
			}
			max = Math.max(max, next + x);
		}
		return max;
	}
}
