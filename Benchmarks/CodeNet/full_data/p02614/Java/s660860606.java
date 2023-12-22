
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int H, W, K;
	int[][] c;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		K = Integer.parseInt(tokens[2]);
		c = new int[H][W];
		for (int i = 0; i < H; ++i) {
			String line = in.readLine();
			for (int j = 0; j < W; ++j) {
				if (line.charAt(j) == '.') {
					c[i][j] = 0;
				} else {
					c[i][j] = 1;
				}
			}
		}
	}

	void drawRow(int[][] cells, int row) {
		for (int i = 0; i < W; ++i) {
			cells[row][i] = 2;
		}
	}

	void drawCol(int[][] cells, int col) {
		for (int i = 0; i < H; ++i) {
			cells[i][col] = 2;
		}
	}

	int[][] getCells(int rowPattern, int colPattern) {
		int[][] target = new int[H][];
		for (int i = 0; i < H; ++i) {
			target[i] = Arrays.copyOf(c[i], W);
		}
		int row = rowPattern;
		for (int i = 0; i < H; ++i) {
			if ((row & 1) > 0) {
				// 塗りつぶし
				drawRow(target, i);
			}
			row >>= 1;
			int col = colPattern;
			for (int j = 0; j < W; ++j) {
				if ((col & 1) > 0) {
					drawCol(target, j);
				}
				col >>= 1;
			}
		}
		return target;
	}

	int count(int[][] cells) {
		int count = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (cells[i][j] == 1) {
					++count;
				}
			}
		}
		return count;
	}

	void calc() {
		int result = 0;
		for (int rowPattern = 0; rowPattern < Math.pow(2, H); ++rowPattern) {
			for (int colPattern = 0; colPattern < Math.pow(2, W); ++colPattern) {
				int[][] cells = getCells(rowPattern, colPattern);
				int count = count(cells);
				if (count == K) {
					++result;
				}
			}
		}
		System.out.println(result);
	}

	void showResult() {
	}
}