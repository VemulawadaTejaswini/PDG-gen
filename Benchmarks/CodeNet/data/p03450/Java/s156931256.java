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

	int N;
	int M;
	Tuple[] nodes;
	boolean enable = true;

	static class Pair {
		int id, D;

		Pair(int id, int D) {
			this.id = id;
			this.D = D;
		}
	}

	static class Tuple {
		int id;
		Long pos;
		Set<Pair> prevs, nexts;

		Tuple(int id) {
			this.id = id;
			this.pos = null;
			this.prevs = new HashSet<>();
			this.nexts = new HashSet<>();
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		nodes = new Tuple[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Tuple(i);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int L = Integer.parseInt(tokens[0]) - 1;
			int R = Integer.parseInt(tokens[1]) - 1;
			int D = Integer.parseInt(tokens[2]);
			nodes[L].nexts.add(new Pair(R, D));
			nodes[R].prevs.add(new Pair(L, D));
		}
	}

	boolean check(int current, long pos) {
		if (nodes[current].pos != null) {
			if (nodes[current].pos != pos) {
				// 矛盾
				return false;
			}else {
				// すでにチェック済みで問題なし
				return true;
			}
		} else {
			// 初期設定
			nodes[current].pos = pos;
		}
		// 次を探索
		for (Pair pair : nodes[current].nexts) {
			boolean cond = check(pair.id, pos + pair.D);
			if (!cond) {
				// 矛盾
				return false;
			}
		}
		// 前を探索
		for (Pair pair : nodes[current].prevs) {
			boolean cond = check(pair.id, pos - pair.D);
			if (!cond) {
				return false;
			}
		}
		return true;
	}

	void calc() {
		if (M != 0) {
			for (int i = 0; i < N; ++i) {
				if (nodes[i].pos == null) {
					boolean cond = check(i, 0L);
					if (!cond) {
						enable = false;
						return;
					}
				}
			}
		}
	}

	void showResult() {
		System.out.println((enable ? "Yes" : "No"));
	}
}