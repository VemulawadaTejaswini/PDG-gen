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
		int D = Integer.parseInt(tokens[0]);
		int T = Integer.parseInt(tokens[1]);
		int S = Integer.parseInt(tokens[2]);
		if (T * S >= D) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
