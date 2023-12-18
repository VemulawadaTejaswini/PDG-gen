
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String S;
	int result;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		S = in.readLine();
	}

	void calc() {
		if (S.equals("SUN")) {
			result = 7;
		} else if (S.equals("MON")) {
			result = 6;
		} else if (S.equals("TUE")) {
			result = 5;
		} else if (S.equals("WED")) {
			result = 4;
		} else if (S.equals("THU")) {
			result = 3;
		} else if (S.equals("FRI")) {
			result = 2;
		} else if (S.equals("SAT")) {
			result = 1;
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
