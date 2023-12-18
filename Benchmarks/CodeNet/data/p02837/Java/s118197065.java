import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	Boolean[][] answers;
	int result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		this.N = Integer.parseInt(in.readLine());
		this.answers = new Boolean[N][N];
		for (int i = 0; i < N; ++i) {
			int A = Integer.parseInt(in.readLine());
			for (int j = 0; j < A; ++j) {
				String[] tokens = in.readLine().split(" ");
				int x = Integer.parseInt(tokens[0]) - 1;
				int y = Integer.parseInt(tokens[1]);
				if (y == 1) {
					answers[i][x] = true;
				} else {
					answers[i][x] = false;
				}
			}
		}
	}

	void calc() {
		int max = (int) Math.pow(2, N);
		for (int i = 0; i < max; ++i) {
			int sub = sub(i);
			result = Math.max(result, sub);
		}
	}

	int sub(int pattern) {
		Boolean[][] anses = new Boolean[N][N];
		boolean[] pat = new boolean[N];
		int honestCount = 0;
		for (int i = 0; i < N; ++i) {
			boolean isHonest = (1 == (pattern & 1));
			pat[i] = isHonest;
			if (isHonest) {
				++honestCount;
			}
			for (int j = 0; j < N; ++j) {
				if (answers[i][j] != null) {
					if (isHonest) {
						anses[i][j] = answers[i][j];
					} else {
						anses[i][j] = !answers[i][j];
					}
				}
			}
			pattern = pattern >> 1;
		}
		// 矛盾がないか調べる
		boolean isOK = true;
		for (int j = 0; j < N; ++j) {
			boolean ok = true;
			for (int i = 0; i < N; ++i) {
				if (anses[i][j] != null) {
					if (anses[i][j] != pat[j]) {
						// 誤り
						ok = false;
						break;
					}
				}
			}
			if (!ok) {
				isOK = false;
				break;
			}
		}
		if (isOK) {
			return honestCount;
		} else {
			return 0;
		}
	}

	void showResult() {
		System.out.println(result);
	}
}