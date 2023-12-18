import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long X;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		X = Long.parseLong(tokens[0]);
	}

	void calc() {
		long val = 100L;
		long count = 0;
		while (val < X) {
			double v = (double) val * 1.01;
			val = (long) Math.floor(v);
			++count;
		}
		System.out.println(count);
	}

	void showResult() {
	}

}
