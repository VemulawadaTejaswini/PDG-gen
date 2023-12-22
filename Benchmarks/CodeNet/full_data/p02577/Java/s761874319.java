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

	Main(BufferedReader in) throws IOException {
		String S = in.readLine();
		int mod = 0;
		for (int i = 0; i < S.length(); ++i) {
			mod += Integer.parseInt(S.substring(i, i + 1));
			mod %= 9;
		}
		if (mod == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
