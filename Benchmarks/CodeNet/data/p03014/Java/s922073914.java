import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int h = in.nextInt();
		int w = in.nextInt();
		String[] s = new String[h];
		for (int i = 0; i < h; i++)
			s[i] = in.next();
		System.out.println(solve(h, w, s));
		in.close();
	}

	private static int solve(int h, int w, String[] s) {
		int[][] hl = new int[h][w];
		int[][] wl = new int[h][w];
		for (int i = 0; i < h; i++) {
			if (s[i].charAt(0) == '.')
				wl[i][0] = 1;
			for (int j = 1; j < w; j++)
				if (s[i].charAt(j) == '.')
					wl[i][j] = wl[i][j - 1] + 1;
			for (int j = w - 2; j >= 0; j--)
				if (wl[i][j] > 0 && wl[i][j + 1] > 0)
					wl[i][j] = wl[i][j + 1];
		}
		for (int j = 0; j < w; j++) {
			if (s[0].charAt(j) == '.')
				hl[0][j] = 1;
			for (int i = 1; i < h; i++)
				if (s[i].charAt(j) == '.')
					hl[i][j] = hl[i - 1][j] + 1;
			for (int i = h - 2; i >= 0; i--)
				if (hl[i][j] > 0 && hl[i + 1][j] > 0)
					hl[i][j] = hl[i + 1][j];
		}
		int r = 0;
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				if (wl[i][j] + hl[i][j] - 1 > r)
					r = wl[i][j] + hl[i][j] - 1;
		return r;
	}
}