
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	double a, b, c;
	boolean cond = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		a = Double.parseDouble(tokens[0]);
		b = Double.parseDouble(tokens[1]);
		c = Double.parseDouble(tokens[2]);

	}

	void calc() {
		if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
			cond = true;
		} else {
			cond = false;
		}

	}

	void showResult() {
		System.out.println((cond ? "Yes" : "No"));
	}

}
