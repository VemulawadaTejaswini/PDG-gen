import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long A, B, N;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		A = Long.parseLong(tokens[0]);
		B = Long.parseLong(tokens[1]);
		N = Long.parseLong(tokens[2]);
	}

	void calc() {
		result = Math.min(N, B - 1) * A / B;
		System.out.println(result);
	}

	void showResult() {
	}

}
