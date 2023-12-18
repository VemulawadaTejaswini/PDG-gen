import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, W, K;
	boolean[][] map;
	int[] refs;
	int[] colCount;
	int[][] resultMap;

	static class Area {
		int id;
		int xMin, xMax, yMin, yMax;

		Area(int xMin, int xMax, int yMin, int yMax) {
			this.id = -1;
			this.xMin = xMin;
			this.xMax = xMax;
			this.yMin = yMin;
			this.yMax = yMax;
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		this.H = Integer.parseInt(tokens[0]);
		this.W = Integer.parseInt(tokens[1]);
		this.K = Integer.parseInt(tokens[2]);
		this.map = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			char[] chars = in.readLine().toCharArray();
			for (int j = 0; j < W; ++j) {
				if (chars[j] == '#') {
					map[i][j] = true;
				} else {
					map[i][j] = false;
				}
			}
		}
		this.refs = new int[W];
		Arrays.fill(this.refs, -1);
		this.colCount = new int[W];
		Arrays.fill(this.colCount, -1);
		this.resultMap = new int[H][W];
		calc();
	}

	void calc() {
		for (int w = 0; w < W; ++w) {
			int count = 0;
			for (int h = 0; h < H; ++h) {
				if (this.map[h][w]) {
					++count;
				}
			}
			this.colCount[w] = count;
		}

		int firstCol = -1;
		for (int i = 0; i < W; ++i) {
			if (colCount[i] > 0) {
				firstCol = i;
				break;
			}
		}
		// firstColまでの列はfirstColを参照する
		for (int i = 0; i <= firstCol; ++i) {
			this.refs[i] = firstCol;
		}
		// firstColより右: いちごがない場合は最も近い左側の列を参照する
		for (int i = firstCol + 1; i < W; ++i) {
			if (colCount[i] == 0) {
				this.refs[i] = firstCol;
			} else {
				this.refs[i] = i;
				firstCol = i;
			}
		}

		// colに関してref-> minCol, maxColを取得する
		Map<Integer, Integer> minCols = new HashMap<>();
		for (int w = 0; w < W; ++w) {
			if (!minCols.containsKey(this.refs[w])) {
				minCols.put(this.refs[w], w);
			}
		}
		Map<Integer, Integer> maxCols = new HashMap<>();
		for (int w = W - 1; w >= 0; --w) {
			if (!maxCols.containsKey(this.refs[w])) {
				maxCols.put(this.refs[w], w);
			}
		}
		List<Area> areas = new ArrayList<>();
		for (Integer ref : minCols.keySet()) {
			int xMin = minCols.get(ref);
			int xMax = maxCols.get(ref);
			List<int[]> ranges = getRowIndexes(ref);
			for (int[] range : ranges) {
				areas.add(new Area(xMin, xMax, range[0], range[1]));
			}
		}
		for (int i = 0; i < areas.size(); ++i) {
			areas.get(i).id = i + 1;
		}
		for (Area area : areas) {
			for (int h = area.yMin; h <= area.yMax; ++h) {
				for (int w = area.xMin; w <= area.xMax; ++w) {
					this.resultMap[h][w] = area.id;
				}
			}
		}
	}

	void showResult() {
		for (int h = 0; h < H; ++h) {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(this.resultMap[h][0]);
			for (int w = 1; w < W; ++w) {
				strBuilder.append(" " + this.resultMap[h][w]);
			}
			System.out.println(strBuilder.toString());
		}
	}

	List<int[]> getRowIndexes(int refCol) {
		Deque<int[]> deque = new ArrayDeque<>();
		for (int h = 0; h < H; ++h) {
			if (this.map[h][refCol]) {
				if (deque.isEmpty()) {
					int[] range = new int[2];
					range[0] = 0;
					range[1] = h;
					deque.add(range);
				} else {
					int[] range = new int[2];
					range[0] = deque.getLast()[1] + 1;
					range[1] = h;
					deque.add(range);
				}
			}
		}
		if (deque.getLast()[1] != H - 1) {
			deque.getLast()[1] = H - 1;
		}
		List<int[]> result = new ArrayList<>();
		result.addAll(deque);
		return result;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.showResult();
	}

}
