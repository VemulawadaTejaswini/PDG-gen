import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H][];
		for (int i = 0; i < H; ++i) {
			A[i] = sc.next().toCharArray();
		}
		char[][] blue = new char[H][W];
		char[][] red = new char[H][W];
		for (char[] a : blue) {
			Arrays.fill(a, '#');
		}
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				red[i][j] = A[i][j];
			}
		}
		for (int r = 1; r < H; r += 2) {
			for (int c = 1; c < W - 1; ++c) {
				red[r][c] = '#';
				if (A[r][c] != '#') blue[r][c] = '.';
			}
		}
		for (int r = 2; r < H - 1; r += 2) {
			int c = r % 4 == 0 ? 1 : W - 2;
			red[r][c] = '#';
			if (A[r][c] != '#') blue[r][c] = '.';
		}
		for (int i = 0; i < H; ++i) {
			System.out.println(String.valueOf(red[i]));
		}
		System.out.println();
		for (int i = 0; i < H; ++i) {
			System.out.println(String.valueOf(blue[i]));
		}
	}

}
