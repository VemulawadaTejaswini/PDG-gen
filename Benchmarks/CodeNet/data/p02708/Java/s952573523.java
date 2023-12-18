import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long N, K;
	long result = 0L;
	long MOD = 1000000007L;

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
		K = Long.parseLong(tokens[1]);
		for (long i = K; i <= N + 1; ++i) {
			long min = (long) (0 + (i - 1) * i) / 2;
			long max = (long) ((N - (i - 1) + N) * i) / 2;
			// System.out.println(i + " " + min + " " + max);
			result += max - min + 1;
			result %= MOD;
		}
		System.out.println(result);
	}

	void calc() {
	}

	void showResult() {
	}
}
