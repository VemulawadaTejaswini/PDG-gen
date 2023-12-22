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

	int X, N;
	Set<Integer> set;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		X = Integer.parseInt(tokens[0]);
		N = Integer.parseInt(tokens[1]);

		set = new HashSet<>();
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			set.add(Integer.parseInt(tokens[i]));
		}
	}

	void calc() {
		if (set.isEmpty()) {
			System.out.println(X);
			return;
		}
		int small = 101;
		int large = 0;
		for (int i = X; i >= 0; --i) {
			if (!set.contains(i)) {
				small = i;
				break;
			}
		}
		for (int i = X; i <= 101; ++i) {
			if (!set.contains(i)) {
				large = i;
				break;
			}
		}
		if (Math.abs(X - small) <= Math.abs(large - X)) {
			System.out.println(small);
		} else {
			System.out.println(large);
		}
	}

	void showResult() {
	}
}