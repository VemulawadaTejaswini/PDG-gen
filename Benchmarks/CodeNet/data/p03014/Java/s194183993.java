
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	static class Range {
		int start, end;
		boolean type;

		Range(int start, int end, boolean type) {
			this.start = start;
			this.end = end;
			this.type = type;
		}
	}

	int H, W;
	boolean[][] cells;

	int[][] horizons, verticals;

	Main(int H, int W, boolean[][] cells) {
		this.H = H;
		this.W = W;
		this.cells = cells;
		this.horizons = new int[H][W];
		this.verticals = new int[H][W];

		this.setHorizons();
		this.setVerticals();
	}

	void setHorizons() {
		for (int h = 0; h < H; ++h) {
			Deque<Range> queue = new ArrayDeque<>();
			for (int w = 0; w < W; ++w) {
				if (queue.isEmpty()) {
					queue.addLast(new Range(w, w + 1, cells[h][w]));
				} else {
					Range r = queue.getLast();
					if (r.type == cells[h][w]) {
						queue.getLast().end = w + 1;
					} else {
						queue.addLast(new Range(w, w + 1, cells[h][w]));
					}
				}
			}
			Range range = queue.pollFirst();
			for (int w = 0; w < W; ++w) {
				if (range.end == w) {
					range = queue.pollFirst();
				}
				if (range.type) {
					horizons[h][w] = range.end - range.start;
				} else {
					horizons[h][w] = 0;
				}
			}
		}
	}

	void setVerticals() {
		for (int w = 0; w < W; ++w) {
			Deque<Range> queue = new ArrayDeque<>();
			for (int h = 0; h < H; ++h) {
				if (queue.isEmpty()) {
					queue.addLast(new Range(h, h + 1, cells[h][w]));
				} else {
					Range r = queue.getLast();
					if (r.type == cells[h][w]) {
						queue.getLast().end = h + 1;
					} else {
						queue.addLast(new Range(h, h + 1, cells[h][w]));
					}
				}
			}
			Range range = queue.pollFirst();
			for (int h = 0; h < H; ++h) {
				if (range.end == h) {
					range = queue.pollFirst();
				}
				if (range.type) {
					verticals[h][w] = range.end - range.start;
				} else {
					verticals[h][w] = 0;
				}
			}
		}
	}

	int calc() {
		int result = Integer.MIN_VALUE;
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				result = Math.max(result, horizons[h][w] + verticals[h][w] - 1);
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int H = Integer.parseInt(tokens[0]);
		int W = Integer.parseInt(tokens[1]);
		boolean[][] cells = new boolean[H][W];
		for (int h = 0; h < H; ++h) {
			String line = in.readLine();
			for (int w = 0; w < W; ++w) {
				if (line.charAt(w) == '.') {
					cells[h][w] = true;
				} else {
					cells[h][w] = false;
				}
			}
		}

		Main ins = new Main(H, W, cells);
		System.out.println(ins.calc());

	}
}