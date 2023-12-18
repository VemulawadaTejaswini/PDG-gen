import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;
	char[] S;
	Deque<Integer> result;
	boolean enable = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		S = in.readLine().toCharArray();
		result = new ArrayDeque<>();
	}

	void calc() {
		search(N);
	}

	void search(int current) {
		// System.out.println(current);
		if (current == 0) {
			// 先頭についた
			return;
		}
		// Mが大きい順にsearchする
		for (int i = M; i >= 1; --i) {
			int index = current - i;
			if (index < 0) {
				continue;
			}
			if (S[index] == '0') {
				// 行ける
				result.addFirst(i);
				search(index);
				return;
			}
		}
		// 行けなかった
		enable = false;
	}

	void showResult() {
		if (!enable) {
			System.out.println("-1");
		} else {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(Integer.toString(result.pollFirst()));
			while (!result.isEmpty()) {
				strBuilder.append(" " + Integer.toString(result.pollFirst()));
			}
			System.out.println(strBuilder.toString());
		}
	}
}
