import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String S;
	int num;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = in.readLine();
	}

	void calc() {
		Set<String> passwords = search(S, 3);
		num = passwords.size();
	}

	Set<String> search(String s, int n) {
		if (s.length() == 0) {
			return new HashSet<>();
		} else if (n == 1) {
			// sの全要素を選ぶしかない
			Set<String> r = new HashSet<>();
			for (int i = 0; i < s.length(); ++i) {
				r.add(s.substring(i, i + 1));
			}
			return r;
		} else {
			Set<String> r = new HashSet<>();
			Set<String> children = search(s.substring(1, s.length()), n - 1);
			for (String child : children) {
				r.add(s.substring(0, 1) + child);
			}
			r.addAll(search(s.substring(1, s.length()), n));
			return r;
		}
	}

	void showResult() {
		System.out.println(num);
	}
}