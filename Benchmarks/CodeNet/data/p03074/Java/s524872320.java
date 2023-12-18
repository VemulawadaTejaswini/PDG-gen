import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, K;
	String S;
	boolean[] origin;
	List<Range> ranges;
	int result = 0;

	static class Range {
		int from, to;

		Range(int from, int to) {
			this.from = from;
			this.to = to;
		}
	}

	Main() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		S = in.readLine();
		in.close();
		this.origin = new boolean[N];
		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) == '0') {
				origin[i] = false;
			} else {
				origin[i] = true;
			}
		}
		Deque<Range> queue = new ArrayDeque<>();
		for (int i = 0; i < this.origin.length; ++i) {
			if (!this.origin[i]) {
				if (queue.isEmpty()) {
					queue.addLast(new Range(i, i + 1));
				} else {
					Range last = queue.getLast();
					if (last.to == i) {
						last.to = i + 1;
					} else {
						queue.addLast(new Range(i, i + 1));
					}
				}
			}
		}
		this.ranges = new ArrayList<>(queue.size());
		this.ranges.addAll(queue);

		calc();
	}

	void calc() {
		if (this.ranges.size() <= K) {
			// 全体にできる
			this.result = N;
		} else {
			for (int i = 0; i + K - 1 < this.ranges.size(); ++i) {
				this.result = Math.max(this.result, sub(i));
			}
		}
	}

	int sub(int rangeStart) {
		int from = this.ranges.get(rangeStart).from;
		int to = this.ranges.get(Math.min(rangeStart + K - 1, this.ranges.size() - 1)).to;

		int result = to - from;
		for (int i = from - 1; i >= 0; --i) {
			if (!this.origin[i]) {
				break;
			}
			++result;
		}
		for (int i = to; i < this.origin.length; ++i) {
			if (!this.origin[i]) {
				break;
			}
			++result;
		}
		// System.out.println(from + ", " + to + ", " + result);
		return result;
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		System.out.println(ins.result);
	}

}