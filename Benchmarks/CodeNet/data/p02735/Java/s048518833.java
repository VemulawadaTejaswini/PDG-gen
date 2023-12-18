import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RangeFlip {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		solve(reader, writer);
		reader.close();
		writer.close();
	}

	static int[][] graph = new int[100][100];
	static int h = 0;
	static int w = 0;

	private static void solve(BufferedReader reader, PrintWriter writer) throws IOException {
		String[] temp = reader.readLine().split(" ");
		h = Integer.parseInt(temp[0]);
		w = Integer.parseInt(temp[1]);
		for (int i = 0; i < h; i++) {
			String nextLine = reader.readLine();
			for (int j = 0; j < w; j++) {
				graph[i][j] = nextLine.charAt(j) == '.' ? 0 : 1;
			}
		}
		int cnt = count(0, 0);
		writer.println(cnt);

	}

	static List<Integer> blackCounts = new ArrayList<>();

	private static int count(int i, int j) {
		countPaths(i, j, 0);
		Collections.sort(blackCounts);
		return blackCounts.get(0);
	}

	private static void countPaths(int i, int j, int blackCount) {
		if (i == h - 1 && j == w - 1) {
			blackCounts.add(blackCount);
		} else {
			if (graph[i][j] == 1)
				blackCount++;
			if (i + 1 < h) {
				countPaths(i + 1, j, blackCount);
			}
			if (j + 1 < w) {
				countPaths(i, j + 1, blackCount);
			}
		}
	}

	static class Node {
		int x;
		int y;

		public Node(int a, int b) {
			x = a;
			y = b;
		}
	}
}
