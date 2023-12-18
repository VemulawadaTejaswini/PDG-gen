import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int[][] A;
	int[] b;
	int N;
	boolean result = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		this.A = new int[3][3];
		for (int i = 0; i < 3; ++i) {
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < 3; ++j) {
				A[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		N = Integer.parseInt(in.readLine());
		b = new int[N];
		for (int i = 0; i < N; ++i) {
			b[i] = Integer.parseInt(in.readLine());
		}

	}

	void replace(int val) {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (A[i][j] == val) {
					A[i][j] = 0;
				}
			}
		}
	}

	boolean check() {
		boolean result = false;
		// 横
		for (int i = 0; i < 3; ++i) {
			boolean cond = true;
			for (int j = 0; j < 3; ++j) {
				if (A[i][j] != 0) {
					cond = false;
					break;
				}
			}
			if (cond) {
				result = true;
			}
		}
		// たて
		for (int j = 0; j < 3; ++j) {
			boolean cond = true;
			for (int i = 0; i < 3; ++i) {
				if (A[i][j] != 0) {
					cond = false;
					break;
				}
			}
			if (cond) {
				result = true;
			}
		}
		// 斜め
		boolean condA = true;
		for (int i = 0; i < 3; ++i) {
			if (A[i][i] != 0) {
				condA = false;
				break;
			}
		}
		if (condA) {
			result = true;
		}
		condA = true;
		for (int i = 0; i < 3; ++i) {
			if (A[i][2 - i] != 0) {
				condA = false;
				break;
			}
		}
		if (condA) {
			result = true;
		}
		return result;
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			replace(b[i]);
		}
		this.result = check();
	}

	void showResult() {
		System.out.println((result ? "Yes" : "No"));
	}

}
