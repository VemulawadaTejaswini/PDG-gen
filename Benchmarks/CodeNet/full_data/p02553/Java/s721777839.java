
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
		String[] tokens = in.readLine().split(" ");
		long a = Long.parseLong(tokens[0]);
		long b = Long.parseLong(tokens[1]);
		long c = Long.parseLong(tokens[2]);
		long d = Long.parseLong(tokens[3]);
		long max = Long.MIN_VALUE / 2;
		max = Math.max(max, a * c);
		max = Math.max(max, a * d);
		max = Math.max(max, b * c);
		max = Math.max(max, b * d);
		System.out.println(max);
	}

	void calc() {
	}

	void showResult() {
	}
}
