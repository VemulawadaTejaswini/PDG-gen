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
		String S = in.readLine();
		if (S.equals("ABC")) {
			System.out.println("ARC");
		} else {
			System.out.println("ABC");
		}
	}

	void calc() {
	}

	void showResult() {
	}

}
