import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);

		String matrix[][] = new String[H][W];

		for (int i = 0; i < H; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < W; j++) {
				matrix[i][j] = str[j];
			}
		}

		int left[][] = new int[H][W];
		int right[][] = new int[H][W];
		int top[][] = new int[H][W];
		int bottom[][] = new int[H][W];

		for (int i = 0; i < H; ++i) {
			int cur = 0;
			for (int j = 0; j < W; ++j) {
				if (matrix[i][j].equals("#"))
					cur = 0;
				else
					++cur;
				left[i][j] = cur;
			}
		}

		for (int i = 0; i < H; ++i) {
			int cur = 0;
			for (int j = W - 1; j >= 0; --j) {
				if (matrix[i][j].equals("#"))
					cur = 0;
				else
					++cur;
				right[i][j] = cur;
			}
		}
		for (int i = 0; i < W; ++i) {
			int cur = 0;
			for (int j = 0; j < H; ++j) {
				if (matrix[j][i].equals("#"))
					cur = 0;
				else
					++cur;
				top[j][i] = cur;
			}
		}
		for (int i = 0; i < W; ++i) {
			int cur = 0;
			for (int j = H - 1; j >= 0; --j) {
				if (matrix[j][i].equals("#"))
					cur = 0;
				else
					++cur;
				bottom[j][i] = cur;
			}
		}
		int res = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (matrix[i][j].equals("#"))
					continue;
				res = Math.max(res, left[i][j] + right[i][j] + top[i][j] + bottom[i][j] - 3);
			}
		}

		System.out.println(res);
	}
}
