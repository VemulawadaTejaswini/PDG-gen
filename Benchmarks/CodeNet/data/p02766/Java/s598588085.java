import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long N;
	int K;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Long.parseLong(tokens[0]);
		K = Integer.parseInt(tokens[1]);
	}

	void calc() {
		StringBuilder strBuilder = new StringBuilder();
		long val = N;
		int count = 0;
		while (val > 0) {
			val /= K;
			++count;
		}
		System.out.println(count);
	}

	void showResult() {

	}
}
