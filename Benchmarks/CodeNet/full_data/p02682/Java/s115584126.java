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
		long A = Long.parseLong(tokens[0]);
		long B = Long.parseLong(tokens[1]);
		long C = Long.parseLong(tokens[2]);
		long K = Long.parseLong(tokens[3]);
		if (K <= A) {
			System.out.println(K);
		} else if (K <= (A + B)) {
			System.out.println(A);
		} else {
			long result = A - ((K - (A + B)));
			System.out.println(result);
		}
	}

	void calc() {
	}

	void showResult() {
	}

}