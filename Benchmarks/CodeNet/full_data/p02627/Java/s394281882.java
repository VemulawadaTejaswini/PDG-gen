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
		char a = in.readLine().charAt(0);
		int i = (int) a;
		if (i >= 65 && i <= 90) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}

	}

	void calc() {
	}

	void showResult() {
	}
}
