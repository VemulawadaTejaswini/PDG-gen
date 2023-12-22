import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
	}

	void calc() {
		if (N % 2 == 1) {
			for (int i = 1; i <= M; ++i) {
				System.out.println(i + " " + (N - i + 1));
			}
		} else {
			System.out.println(1 + " " + (N));
			for (int i = 2; i <= M; ++i) {
				System.out.println(i + " " + (N - i));
			}
		}
	}

	void showResult() {
	}

}
