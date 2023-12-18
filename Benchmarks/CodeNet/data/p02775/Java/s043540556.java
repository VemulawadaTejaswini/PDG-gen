
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String N;
	long result = 0;
	boolean prevPat = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int sub(int val) {
		prevPat = true;
		if (val % 10 == 0) {
			prevPat = false;
			return 0;
		}
		// 単位紙幣をそのまま払う場合
		int result = val;
		// おつりをもらうパターン
		if (1 + (10 - val) < val) {
			result = 1 + (10 - val);
			prevPat = false;
		}
		return result;
	}

	Main(BufferedReader in) throws IOException {
		N = in.readLine();
	}

	void calc() {
		for (int i = N.length() - 1; i >= 0; --i) {
			int val = Integer.parseInt(N.substring(i, i + 1));
			if (val == 9 && !prevPat) {
				++val;
			}
			result += sub(val);
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
