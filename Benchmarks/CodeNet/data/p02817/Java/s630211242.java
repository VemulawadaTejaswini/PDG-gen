import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String S, T;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		S = tokens[0];
		T = tokens[1];
	}

	void calc() {
	}

	void showResult() {
		System.out.println(T + S);
	}
}
