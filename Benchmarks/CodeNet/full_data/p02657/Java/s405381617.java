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
		String[] tok = in.readLine().split(" ");
		int A = Integer.parseInt(tok[0]);
		int B = Integer.parseInt(tok[1]);
		System.out.println(A * B);
	}

	void calc() {
	}

	void showResult() {
	}
}