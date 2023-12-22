import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
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
		int count = 0;
		if (S.charAt(0) == 'R' && S.charAt(1) == 'R' && S.charAt(2) == 'R') {
			count = 3;
		} else if (S.charAt(0) == 'R' && S.charAt(1) == 'R') {
			count = 2;
		} else if (S.charAt(1) == 'R' && S.charAt(2) == 'R') {
			count = 2;
		} else {
			for (int i = 0; i < S.length(); ++i) {
				if (S.charAt(i) == 'R') {
					count = 1;
				}
			}
		}
		System.out.println(count);
	}

	void calc() {
	}

	void showResult() {
	}
}