import java.util.*;
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

	char[] S, T;

	Main(BufferedReader in) throws IOException {
		S = in.readLine().toCharArray();
		T = in.readLine().toCharArray();
	}

	int diff(int sStart) {
		int len = T.length;
		int result = 0;
		for (int i = sStart; i < sStart + len; ++i) {
			if (S[i] != T[i - sStart]) {
				++result;
			}
		}
		return result;
	}

	void calc() {
		int min = Integer.MAX_VALUE / 2;
		for (int i = 0; i + T.length <= S.length; ++i) {
			min = Math.min(min, diff(i));
		}
		System.out.println(min);
	}

	void showResult() {
	}
}