import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	char[] T, result;
	int N;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		T = in.readLine().toCharArray();
		N = T.length;
		result = new char[N];
	}

	void init() {
		// 最初を埋める
		if (T[0] == '?') {
			if (T[1] == '?') {
				result[0] = 'P';
			} else if (T[1] == 'P') {
				result[0] = 'D';
			} else {
				result[0] = 'P';
			}
		} else {
			result[0] = T[0];
		}
	}

	void calc() {
		if (N == 1) {
			if (T[0] == '?') {
				System.out.println('D');
			} else {
				System.out.println(T[0]);
			}
		} else {
			init();
			for (int i = 1; i + 1 < N; ++i) {
				if (result[i - 1] == 'P') {
					if (T[i] == '?') {
						result[i] = 'D';
					} else {
						result[i] = T[i];
					}
				} else {
					if (T[i] == '?') {
						if (T[i + 1] == '?' || T[i + 1] == 'D') {
							result[i] = 'P';
						} else {
							result[i] = 'D';
						}
					} else {
						result[i] = T[i];
					}
				}
			}
			if (T[N - 1] == '?') {
				result[N - 1] = 'D';
			} else {
				result[N - 1] = T[N - 1];
			}
			for (int i = 0; i < N; ++i) {
				System.out.print(result[i]);
			}
			System.out.println("");
		}
	}

	void showResult() {
	}
}