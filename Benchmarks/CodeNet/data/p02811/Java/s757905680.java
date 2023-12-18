import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	boolean result = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int K = Integer.parseInt(tokens[0]);
		int X = Integer.parseInt(tokens[1]);
		if (K * 500 >= X) {
			result = true;
		} else {
			result = false;
		}
	}

	void calc() {
	}

	void showResult() {
		System.out.println((result ? "Yes" : "No"));
	}
}
