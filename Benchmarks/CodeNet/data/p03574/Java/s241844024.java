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

	int H, W;
	char[][] map;
	int[][] counts;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		map = new char[H][];
		counts = new int[H][W];
		for (int i = 0; i < H; ++i) {
			map[i] = in.readLine().toCharArray();
			Arrays.fill(counts[i], 0);
		}
	}

	void add(int h, int w) {
		// 左上
		if (h > 0 && w > 0) {
			counts[h - 1][w - 1]++;
		}
		if (h > 0) {
			counts[h - 1][w]++;
		}
		if (h > 0 && w + 1 < W) {
			counts[h - 1][w + 1]++;
		}
		if (w > 0) {
			counts[h][w - 1]++;
		}
		if (w + 1 < W) {
			counts[h][w + 1]++;
		}
		if (h + 1 < H && w > 0) {
			counts[h + 1][w - 1]++;
		}
		if (h + 1 < H) {
			counts[h + 1][w]++;
		}
		if (h + 1 < H && w + 1 < W) {
			counts[h + 1][w + 1]++;
		}
	}

	void calc() {
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				if (map[h][w] == '#') {
					add(h, w);
				}
			}
		}
	}

	void showResult() {
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				if (map[h][w] == '#') {
					System.out.print('#');
				} else {
					System.out.print(counts[h][w]);
				}
			}
			System.out.println("");
		}
	}
}