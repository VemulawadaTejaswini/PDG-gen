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
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int C = Integer.parseInt(tokens[2]);
		int D = Integer.parseInt(tokens[3]);

		int turnTakahashi = C / B;
		if (C % B > 0) {
			turnTakahashi++;
		}
		int turnAoki = A / D;
		if (A % D > 0) {
			turnAoki++;
		}
		if (turnTakahashi <= turnAoki) {
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
