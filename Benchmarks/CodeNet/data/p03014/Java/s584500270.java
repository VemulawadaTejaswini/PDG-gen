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
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] map = new char[H][];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			map[i] = s.toCharArray();
		}
		int[][] LEFT = new int[H][W];
		for (int y = 0; y < H; y++) {
			if (map[y][0] == '.') LEFT[y][0] = 1;
			for (int x = 1; x < W; x++) {
				if (map[y][x] == '.') LEFT[y][x] = LEFT[y][x - 1] + 1;
			}
		}
		int[][] RIGHT = new int[H][W];
		for (int y = 0; y < H; y++) {
			if (map[y][W-1] == '.') RIGHT[y][W-1] = 1;
			for (int x = W-2; x >= 0; x--) {
				if (map[y][x] == '.') RIGHT[y][x] = RIGHT[y][x + 1] + 1;
			}
		}
		int[][] TOP = new int[H][W];
		for (int x = 0; x < W; x++) {
			if (map[0][x] == '.') TOP[0][x] = 1;
			for (int y = 1; y < H; y++) {
				if (map[y][x] == '.') TOP[y][x] = TOP[y - 1][x] + 1;
			}
		}
		int[][] BOTTOM = new int[H][W];
		for (int x = 0; x < W; x++) {
			if (map[H-1][x] == '.') BOTTOM[H-1][x] = 1;
			for (int y = H-2; y >= 0; y--) {
				if (map[y][x] == '.') BOTTOM[y][x] = BOTTOM[y + 1][x] + 1;
			}
		}


		int max = 0;
		for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				if (map[y][x] != '.') continue;
				// int cnt = 1;
				// for (int x2 = x - 1; x2 >= 0; x2--) {
				// 	if (map[y][x2] != '.') break;
				// 	cnt++;
				// }
				// for (int x2 = x + 1; x2 < W; x2++) {
				// 	if (map[y][x2] != '.') break;
				// 	cnt++;
				// }
				// for (int y2 = y - 1; y2 >= 0; y2--) {
				// 	if (map[y2][x] != '.') break;
				// 	cnt++;
				// }
				// for (int y2 = y + 1; y2 < H; y2++) {
				// 	if (map[y2][x] != '.') break;
				// 	cnt++;
				// }
				int sum = LEFT[y][x] + RIGHT[y][x] + TOP[y][x] + BOTTOM[y][x] - 3;
				// assert cnt == sum : "assert";

				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}
}
