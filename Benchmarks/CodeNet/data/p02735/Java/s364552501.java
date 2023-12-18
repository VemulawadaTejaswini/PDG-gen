import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, W;
	int[][] distances;
	boolean[][] field;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		this.distances = new int[H][W];
		this.field = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			Arrays.fill(this.distances[i], 0);
			Arrays.fill(this.field[i], true);
		}
		for (int i = 0; i < H; ++i) {
			String line = in.readLine();
			for (int j = 0; j < W; ++j) {
				char c = line.charAt(j);
				if (c == '.') {
					this.field[i][j] = true;
				} else {
					this.field[i][j] = false;
				}
			}
		}
		if (!this.field[0][0]) {
			this.distances[0][0] = 1;
		}
		// 横
		for (int i = 1; i < W; ++i) {
			if (this.field[0][i]) {
				// 白
				this.distances[0][i] = this.distances[0][i - 1];
			} else {
				// 黒
				// もし前のものが黒なら，そのまま行ける
				if (!this.field[0][i - 1]) {
					this.distances[0][i] = this.distances[0][i - 1];
				} else {
					this.distances[0][i] = this.distances[0][i - 1] + 1;
				}
			}
		}
		// 縦
		for (int i = 1; i < H; ++i) {
			if (this.field[i][0]) {
				// 白
				this.distances[i][0] = this.distances[i - 1][0];
			} else {
				// 黒
				// もし前のものが黒なら，そのまま行ける
				if (!this.field[i - 1][0]) {
					this.distances[i][0] = this.distances[i - 1][0];
				} else {
					this.distances[i][0] = this.distances[i - 1][0] + 1;
				}
			}
		}
	}

	void calc() {
		for (int i = 1; i < H; ++i) {
			for (int j = 1; j < W; ++j) {
				boolean cond = this.field[i][j];
				if (cond) {
					// 現在位置は白
					this.distances[i][j] = Math.min(this.distances[i - 1][j], this.distances[i][j - 1]);
				} else {
					// 現在位置は黒
					if (this.field[i - 1][j] && this.field[i][j - 1]) {
						// 両方白
						this.distances[i][j] = Math.min(this.distances[i - 1][j] + 1, this.distances[i][j - 1] + 1);
					} else if (this.field[i - 1][j] && !this.field[i][j - 1]) {
						// 左が黒
						this.distances[i][j] = Math.min(this.distances[i - 1][j] + 1, this.distances[i][j - 1]);
					} else if (!this.field[i - 1][j] && this.field[i][j - 1]) {
						// 上が黒
						this.distances[i][j] = Math.min(this.distances[i - 1][j], this.distances[i][j - 1] + 1);
					} else {
						// 左，うえが黒
						this.distances[i][j] = Math.min(this.distances[i - 1][j], this.distances[i][j - 1]);
					}
				}
			}
		}
	}

	void showResult() {
		// 開始位置が黒の場合は++1しないといけない
		int result = this.distances[H - 1][W - 1];
		System.out.println(result);
	}

}