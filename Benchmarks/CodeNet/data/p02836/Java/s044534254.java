import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String S;
	int count = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		S = in.readLine();
	}

	void calc() {
		for (int i = 0; i < S.length() / 2; ++i) {
			if (S.charAt(i) != S.charAt(S.length() - 1 - i)) {
				++count;
			}
		}
	}

	void showResult() {
		System.out.println(count);
	}
}
