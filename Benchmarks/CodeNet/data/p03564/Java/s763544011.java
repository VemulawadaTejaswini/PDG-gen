import java.util.*;
import java.util.stream.Collectors;
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
		int N = Integer.parseInt(in.readLine());
		int K = Integer.parseInt(in.readLine());
		int val = 1;
		for (int i = 0; i < N; ++i) {
			val = Math.min(val * 2, val + K);
		}
		System.out.println(val);
	}

	void calc() {
	}

	void showResult() {
	}
}