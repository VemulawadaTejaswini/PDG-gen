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

	static long MOD = 1000000007L;

	public static void main(String[] args) {
		final char WALL = '#';
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] MAP = new char[H][];
		for (int i = 0; i < H; i++) {
			MAP[i] = sc.next().toCharArray();
		}
		int[][] pat = new int[H][W];
		pat[0][0] = 1;
		for (int h = 1; h < H; h++) {
			pat[h][0] = (MAP[h][0] == WALL) ? 0 : pat[h-1][0];
		}
		for (int w = 1; w < W; w++) {
			pat[0][w] = (MAP[0][w] == WALL) ? 0 : pat[0][w-1];
		}
		for (int h = 1; h < H; h++) {
			for (int w = 1; w < W; w++) {
				if (MAP[h][w] == WALL) {
					pat[h][w] = 0;
				} else {
					long val = ((long)pat[h-1][w] + (long)pat[h][w-1]) % MOD;
					pat[h][w] = (int)val;
				}
			}
		}
		System.out.println(pat[H-1][W-1]);
	}
}
