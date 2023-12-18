import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long A, B, C;
	String[] s;
	List<String> result;
	boolean enable = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		A = Long.parseLong(tokens[1]);
		B = Long.parseLong(tokens[2]);
		C = Long.parseLong(tokens[3]);
		s = new String[N];
		for (int i = 0; i < N; ++i) {
			s[i] = in.readLine();
		}
	}

	String eval(String str) {
		if (str.equals("AB")) {
			if (A > B) {
				--A;
				++B;
				return "B";
			} else {
				++A;
				--B;
				return "A";
			}
		} else if (str.equals("AC")) {
			if (A > C) {
				--A;
				++C;
				return "C";
			} else {
				++A;
				--C;
				return "A";
			}
		} else {
			if (B > C) {
				--B;
				++C;
				return "C";
			} else {
				++B;
				--C;
				return "B";
			}
		}
	}

	void calc() {
		result = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			result.add(eval(s[i]));
			if (A < 0 || B < 0 || C < 0) {
				enable = false;
				return;
			}
		}
	}

	void showResult() {
		if (enable) {
			System.out.println("Yes");
			for (int i = 0; i < result.size(); ++i) {
				System.out.println(result.get(i));
			}
		} else {
			System.out.println("No");
		}
	}
}
