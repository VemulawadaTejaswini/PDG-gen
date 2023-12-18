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
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < b; ++i) {
			strBuilder.append(a);
		}
		String strA = strBuilder.toString();
		strBuilder = new StringBuilder();
		for (int i = 0; i < a; ++i) {
			strBuilder.append(b);
		}
		String strB = strBuilder.toString();
		if (strA.compareTo(strB) <= 0) {
			System.out.println(strA);
		} else {
			System.out.println(strB);
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
