
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, K, R, S, P;
	char[] T, buf;
	long result = 0;

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
		K = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		R = Integer.parseInt(tokens[0]);
		S = Integer.parseInt(tokens[1]);
		P = Integer.parseInt(tokens[2]);
		T = in.readLine().toCharArray();
		buf = new char[T.length];
	}

	void calc() {
		for (int i = 0; i < K; ++i) {
			// 好きなように出して，勝てる
			result += getScore(T[i]);
			buf[i] = getResult(T[i]);
		}
		for (int i = K; i < N; ++i) {
			// K回前と同じだと勝てない
			char currentResult = getResult(T[i]);
			if (currentResult != buf[i - K]) {
				// 勝てる
				buf[i] = currentResult;
				result += getScore(T[i]);
			} else {
				// 勝てない．bufには適当な値を入れる
				buf[i] = 'n';
			}
		}
	}

	int getScore(char c) {
		switch (c) {
		case 'r':
			return P;
		case 's':
			return R;
		case 'p':
		default:
			return S;
		}
	}

	char getResult(char c) {
		switch (c) {
		case 'r':
			return 'p';
		case 's':
			return 'r';
		case 'p':
		default:
			return 's';
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
