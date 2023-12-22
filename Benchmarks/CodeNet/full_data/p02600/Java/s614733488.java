import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
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
		int X = Integer.parseInt(in.readLine());
		int result = -1;
		if (X < 600) {
			result = 8;
		} else if (X < 800) {
			result = 7;
		} else if (X < 1000) {
			result = 6;
		} else if (X < 1200) {
			result = 5;
		} else if (X < 1400) {
			result = 4;
		} else if (X < 1600) {
			result = 3;
		} else if (X < 1800) {
			result = 2;
		} else {
			result = 1;
		}
		System.out.println(result);
	}

	void calc() {
	}

	void showResult() {
	}
}
