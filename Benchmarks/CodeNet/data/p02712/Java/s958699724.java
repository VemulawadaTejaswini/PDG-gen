
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
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long sum = 0L;
		for (int i = 1; i <= N; ++i) {
			if ((i % 3 != 0) && (i % 5 != 0)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	void calc() {
	}

	void showResult() {
	}
}
