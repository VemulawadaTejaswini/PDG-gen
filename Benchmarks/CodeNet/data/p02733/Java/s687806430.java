import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, W, K;
	boolean[][] cells;

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
		K = Integer.parseInt(tokens[2]);
		this.cells = new boolean[H][W];
		for (int h = 0; h < H; ++h) {
			String line = in.readLine();
			for (int w = 0; w < W; ++w) {
				char c = line.charAt(w);
				cells[h][w] = c == '0' ? false : true;
			}
		}

	}

	void addRow(int[] prevs, boolean[] row) {
		for (int i = 0; i < prevs.length; ++i) {
			if (row[i]) {
				prevs[i]++;
			}
		}
	}

	List<int[]> splitRow(int index) {
		Deque<int[]> deque = new ArrayDeque<>();
		deque.addLast(new int[W]);
		Arrays.fill(deque.getLast(), 0);
		addRow(deque.getLast(), cells[0]);
		for (int i = 1; i < H; ++i) {
			if ((index & 1) > 0) {
				// 新しいrowをたす
				deque.addLast(new int[W]);
				Arrays.fill(deque.getLast(), 0);
			}
			addRow(deque.getLast(), cells[i]);
			index >>= 1;
		}
		List<int[]> list = new ArrayList<>(deque.size());
		while (!deque.isEmpty()) {
			list.add(deque.pollFirst());
		}

		return list;
	}

	int splitCol(List<int[]> rows) {
		int[] whites = new int[rows.size()];
		Arrays.fill(whites, 0);
		int count = 0;
		for (int w = 0; w < W; ++w) {
			boolean cond = false;
			for (int h = 0; h < rows.size(); ++h) {
				int addVal = rows.get(h)[w];
				if (addVal > K) {
					// 不可能
					return -1;
				}
				whites[h] += rows.get(h)[w];
				if (whites[h] > K) {
					cond = true;
				}
			}
			if (cond) {
				++count;
				for (int h = 0; h < rows.size(); ++h) {
					whites[h] = rows.get(h)[w];
				}
			}
		}
		return count;
	}

	int calc(int index) {
		List<int[]> rows = splitRow(index);
		int splitCount = rows.size() - 1;
		int v = splitCol(rows);
		if (v < 0) {
			return Integer.MAX_VALUE / 2;
		} else {
			return splitCount + v;
		}
	}

	void calc() {
		int count = Integer.MAX_VALUE / 2;
		int maxIndex = (int) Math.pow(2, H - 1);
		for (int index = 0; index < maxIndex; ++index) {
			count = Math.min(count, calc(index));
		}
		System.out.println(count);

	}

	void showResult() {
	}

}