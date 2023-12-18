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
		int H = Integer.parseInt(tokens[0]);
		int A = Integer.parseInt(tokens[1]);
		int result = H / A;
		if (H % A != 0) {
			result++;
		}
		System.out.println(result);
	}

	void calc() {
	}

	void showResult() {
	}
}
