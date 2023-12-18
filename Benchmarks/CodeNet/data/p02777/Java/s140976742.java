
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
		String S = tokens[0];
		String T = tokens[1];
		tokens = in.readLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		String U = in.readLine();
		if (S.equals(U)) {
			--A;
		} else {
			--B;
		}
		System.out.println(A + " " + B);
	}

	void calc() {
	}

	void showResult() {
	}
}
