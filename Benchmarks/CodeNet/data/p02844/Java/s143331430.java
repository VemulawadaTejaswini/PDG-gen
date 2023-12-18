import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String S;
	int num;
	Set<String>[][] cache;

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
		cache = new Set[S.length()][3];
	}

	void calc() {
		Set<String> passwords = search(S, 3, 0);
		num = passwords.size();
	}

	Set<String> search(String s, int n, int startIndex) {
		if (startIndex >= S.length()) {
			return new HashSet<>();
		}
		if (cache[startIndex][n - 1] != null) {
			return cache[startIndex][n - 1];
		}
		if (n == 1) {
			// sの全要素を選ぶしかない
			Set<String> r = new HashSet<>();
			for (int i = 0; i < s.length(); ++i) {
				r.add(s.substring(i, i + 1));
			}
			cache[startIndex][n - 1] = r;
			return r;
		} else {
			Set<String> r = new HashSet<>();
			Set<String> children = search(s.substring(1, s.length()), n - 1, startIndex + 1);
			for (String child : children) {
				r.add(s.substring(0, 1) + child);
			}
			r.addAll(search(s.substring(1, s.length()), n, startIndex + 1));
			cache[startIndex][n - 1] = r;
			return r;
		}
	}

	void showResult() {
		System.out.println(num);
	}
}