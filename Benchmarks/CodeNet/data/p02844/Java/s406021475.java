import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String S;
	Set<Character>[] befores, afters;
	Map<Integer, Set<Character>> before, after;
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
		this.befores = new Set[S.length()];
		this.afters = new Set[S.length()];
	}

	void calc() {
		// 前集合を求める
		this.befores[0] = new HashSet<Character>();
		for (int i = 1; i < S.length(); ++i) {
			Set<Character> set = new HashSet<>();
			set.addAll(this.befores[i - 1]);
			set.add(S.charAt(i - 1));
			this.befores[i] = set;
		}
		// 後集合を求める
		this.afters[N - 1] = new HashSet<>();
		for (int i = N - 2; i >= 0; --i) {
			Set<Character> set = new HashSet<>();
			set.addAll(this.afters[i + 1]);
			set.add(S.charAt(i + 1));
			this.afters[i] = set;
		}
		Set<String> s = new HashSet<>();

		for (int i = 1; i < N - 1; ++i) {
			for (Character b : this.befores[i]) {
				for (Character a : this.afters[i]) {
					StringBuilder strBuilder = new StringBuilder();
					strBuilder.append(b);
					strBuilder.append(S.charAt(i));
					strBuilder.append(a);
					s.add(strBuilder.toString());
				}
			}
		}
		num = s.size();
	}

	void showResult() {
		System.out.println(num);
	}
}
