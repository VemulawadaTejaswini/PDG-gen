import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	long H, W;
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
		H = Long.parseLong(tokens[0]);
		W = Long.parseLong(tokens[1]);
	}

	void calc() {
		long odd = W / 2 + 1;
		long even = W - odd;
		if (H % 2 == 0) {
			result = H / 2 * W;
		} else {
			result = H / 2 * W + odd;
		}
		System.out.println(result);

	}

	void showResult() {
	}

}
