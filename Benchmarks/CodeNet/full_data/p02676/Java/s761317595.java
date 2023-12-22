
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
		int K = Integer.parseInt(in.readLine());
		String S = in.readLine();
		if (K >= S.length()) {
			System.out.println(S);
		} else {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(S.substring(0, K));
			for (int i = 0; i < 3; ++i) {
				strBuilder.append(".");
			}
			System.out.println(strBuilder.toString());
		}

	}

	void calc() {
	}

	void showResult() {
	}

}
