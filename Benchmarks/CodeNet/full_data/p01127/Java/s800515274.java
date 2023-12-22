import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] f;
	static int H, W;
	static char FILL = '!';

	public static void main(String[] args) {
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			H = sc.nextInt();
			W = sc.nextInt();
			f = new char[H][W];
			for (int j = 0; j < H; ++j) {
				f[j] = sc.next().toCharArray();
			}
			System.out.println(solve() ? "SUSPICIOUS" : "SAFE");
		}
	}

	static boolean solve() {
		int[] t = new int[26];
		int[] b = new int[26];
		int[] l = new int[26];
		int[] r = new int[26];
		boolean[] exist = new boolean[26];
		Arrays.fill(t, 99);
		Arrays.fill(b, -1);
		Arrays.fill(l, 99);
		Arrays.fill(r, -1);
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (Character.isUpperCase(f[i][j])) {
					int pos = f[i][j] - 'A';
					t[pos] = Math.min(t[pos], i);
					b[pos] = Math.max(b[pos], i);
					l[pos] = Math.min(l[pos], j);
					r[pos] = Math.max(r[pos], j);
					exist[pos] = true;
				}
			}
		}
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 26; ++j) {
				if (!exist[j]) continue;
				boolean ok = true;
				for (int row = t[j]; row <= b[j]; ++row) {
					for (int col = l[j]; col <= r[j]; ++col) {
						if (f[row][col] != (char) (j + 'A') && f[row][col] != FILL) ok = false;
					}
				}
				if (ok) {
					for (int row = t[j]; row <= b[j]; ++row) {
						for (int col = l[j]; col <= r[j]; ++col) {
							f[row][col] = FILL;
						}
					}
					exist[j] = false;
				}
			}
		}
		for (int i = 0; i < 26; ++i) {
			if (exist[i]) return true;
		}
		return false;
	}
}