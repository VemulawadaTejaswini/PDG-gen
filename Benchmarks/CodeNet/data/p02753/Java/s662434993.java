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
		Set<Character> set = new HashSet<>();
		String line = in.readLine();
		for (Character c : line.toCharArray()) {
			set.add(c);
		}
		System.out.println((set.size() == 2 ? "Yes" : "No"));
	}

	void calc() {
	}

	void showResult() {
	}

}
