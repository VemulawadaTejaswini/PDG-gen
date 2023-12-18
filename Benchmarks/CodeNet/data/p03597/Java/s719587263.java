
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
		int N = Integer.parseInt(in.readLine());
		int A = Integer.parseInt(in.readLine());
		System.out.println((N * N - A));
	}

	void calc() {
	}

	void showResult() {
	}
}