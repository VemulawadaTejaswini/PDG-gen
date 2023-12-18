import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }
	public static void printArrayB(byte[] a) {
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

	static final byte LEFT = 1;
	static final byte TOP = 2;
	static final byte TOP_LEFT = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();

		byte[][] dirs = new byte[S.length + 1][T.length + 1];
		int[][] value = new int[S.length + 1][T.length + 1];
		for (int y = 1; y <= S.length; y++) {
			dirs[y][0] = TOP;
		}
		for (int x = 1; x <= T.length; x++) {
			dirs[0][x] = LEFT;
		}
		for (int y = 1; y <= S.length; y++) {
			for (int x = 1; x <= T.length; x++) {
				int nextValue;
				byte dir;
				if (value[y-1][x] >= value[y][x-1]) {
					nextValue = value[y-1][x];
					dir = TOP;
				} else {
					nextValue = value[y][x-1];
					dir = LEFT;
				}
				if (S[y - 1] == T[x - 1]) {
					if (value[y-1][x-1] + 1 > nextValue) {
						nextValue = value[y-1][x-1] + 1;
						dir = TOP_LEFT;
					}
				}
				value[y][x] = nextValue;
				dirs[y][x] = dir;
			}
		}
		// for (int y = 0; y <= S.length; y++) {
		// 	printArrayB(dirs[y]);
		// }
		{
			ArrayList<Character> chars = new ArrayList<>();
			int y = S.length;
			int x = T.length;
			while (y > 0 || x > 0) {
				byte d = dirs[y][x];
				if (d == TOP) {
					y--;
					continue;
				}
				if (d == LEFT) {
					x--;
					continue;
				}
				if (d == TOP_LEFT) {
					y--;
					x--;
					chars.add(S[y]);
					continue;
				}
				throw new RuntimeException("unreachable: (x=" + x + ", y=" + y + ")");
			}
			StringBuilder sb = new StringBuilder();
			for (int i = chars.size() - 1; i >= 0; i--) {
				sb.append(chars.get(i));
			}
			System.out.println(sb.toString());
		}
	}
}
