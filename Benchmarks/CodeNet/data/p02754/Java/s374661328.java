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
		long N = Long.parseLong(tokens[0]);
		long A = Long.parseLong(tokens[1]);
		long B = Long.parseLong(tokens[2]);

		long div = N / (A + B);
		long mod = N % (A + B);
		mod = Math.min(mod, A);
		long result = div * A + mod;
		System.out.println(result);
	}

	void calc() {
	}

	void showResult() {
	}

}
