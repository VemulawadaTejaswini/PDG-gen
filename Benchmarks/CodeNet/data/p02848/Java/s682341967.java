import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	char[] S;
	char[] result;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = in.readLine().toCharArray();
		result = new char[S.length];
	}

	void calc() {
		for (int i = 0; i < result.length; ++i) {
			result[i] = conv(S[i]);
		}
	}

	char conv(char c) {
		char result = c;
		result += (char) N;
		if ((int) result > 90) {
			result = (char) ((int) result % -90 + 64);
		}
		return result;
	}

	void showResult() {
		for (int i = 0; i < result.length; ++i) {
			System.out.print(result[i]);
		}
		System.out.println("");
	}
}