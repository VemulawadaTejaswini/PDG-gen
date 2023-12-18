import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String S;
	int N;
	int count = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = in.readLine();
	}

	void calc() {
		for (int i = 0; i + 2 < N; ++i) {
			if (S.substring(i).startsWith("ABC")) {
				++count;
			}
		}
	}

	void showResult() {
		System.out.println(count);
	}
}
