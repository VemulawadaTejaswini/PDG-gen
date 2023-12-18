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
			String line = in.readLine();
			s[i] = line;
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

	String eval(String current, String next) {
		if (current.equals("AB")) {
			if (A > B) {
				--A;
				++B;
				return "B";
			} else if (A < B) {
				++A;
				--B;
				return "A";
			} else {
				if (next.equals("AC")) {
					++A;
					--B;
					return "A";
				} else if (next.equals("BC")) {
					--A;
					++B;
					return "B";
				} else {
					++A;
					--B;
					return "A";
				}
			}
		} else if (current.equals("AC")) {
			if (A > C) {
				--A;
				++C;
				return "C";
			} else if (A < C) {
				++A;
				--C;
				return "A";
			} else {
				if (next.equals("AB")) {
					++A;
					--C;
					return "A";
				} else if (next.equals("BC")) {
					--A;
					++C;
					return "C";
				} else {
					++A;
					--C;
					return "A";
				}
			}
		} else {
			if (B > C) {
				--B;
				++C;
				return "C";
			} else if (B < C) {
				++B;
				--C;
				return "B";
			} else {
				if (next.equals("AB")) {
					++B;
					--C;
					return "B";
				} else if (next.equals("AC")) {
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
	}

	void calc() {
		result = new ArrayList<>(N);
		for (int i = 0; i < N - 1; ++i) {
			result.add(eval(s[i], s[i + 1]));
			if (A < 0 || B < 0 || C < 0) {
				enable = false;
				return;
			}
		}
		result.add(eval(s[N - 1]));
		if (A < 0 || B < 0 || C < 0) {
			enable = false;
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