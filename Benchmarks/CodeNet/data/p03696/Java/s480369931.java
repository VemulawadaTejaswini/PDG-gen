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

	int N;
	String S;
	Deque<Character> deque;
	Deque<Character> result;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = in.readLine();
		this.deque = new ArrayDeque<>(S.length());
		for (int i = 0; i < S.length(); ++i) {
			deque.addLast(S.charAt(i));
		}
		result = new ArrayDeque<>();
	}

	void calc() {
		int score = 0;
		while (!deque.isEmpty()) {
			char c = deque.pollFirst();
			if (c == '(') {
				result.addLast(c);
				++score;
			} else {
				if (score > 0) {
					--score;
					result.addLast(c);
				} else {
					result.addFirst('(');
					result.addLast(c);
				}
			}
		}
		for (int i = 0; i < score; ++i) {
			result.addLast(')');
		}
	}

	void showResult() {
		while (!result.isEmpty()) {
			System.out.print(result.poll());
		}
		System.out.println("");
	}
}