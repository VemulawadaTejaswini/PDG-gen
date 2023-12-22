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
		int[] x = new int[5];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < 5; ++i) {
			x[i] = Integer.parseInt(tokens[i]);
		}
		for (int i = 0; i < 5; ++i) {
			if (x[i] == 0) {
				System.out.println((i + 1));
				break;
			}
		}

	}

	void calc() {
	}

	void showResult() {
	}
}