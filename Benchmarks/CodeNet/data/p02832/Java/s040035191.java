import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] A;
	int breakNum = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
	}

	void calc() {
		int target = 1;
		for (int i = 0; i < N; ++i) {
			if (target != A[i]) {
				// 壊す
				++breakNum;
			} else {
				// 壊さない
				++target;
			}
		}
		if (breakNum == N) {
			// だめだった
			breakNum = -1;
		}
	}

	void showResult() {
		System.out.println(breakNum);
	}
}
