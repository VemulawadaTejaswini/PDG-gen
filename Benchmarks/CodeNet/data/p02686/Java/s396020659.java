import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	List<String> S;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	static int[] count(String s) {
		int[] result = new int[2];
		int count = 0;
		result[0] = 0;
		result[1] = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '(') {
				++count;
			} else {
				--count;
			}
			result[0] = Math.max(count, result[0]);
			result[1] = Math.min(count, result[1]);
		}
		return result;
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			S.add(in.readLine());
		}
		Collections.sort(S, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int[] ro1 = count(o1);
				int[] ro2 = count(o2);
				return -1 * Integer.compare(ro1[1], ro2[1]);
			}
		});
	}

	static boolean isPositive(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '(') {
				++count;
			} else {
				--count;
			}
			if (count < 0) {
				return false;
			}
		}
		return true;
	}

	int eval(String s, int score) {
		int val = score;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '(') {
				++val;
			} else {
				--val;
			}
			if (val < 0) {
				return -1;
			}
		}
		return val;
	}

	void calc() {
		int score = 0;
		for (int i = 0; i < S.size(); ++i) {
			score = eval(S.get(i), score);
			if (score < 0) {
				break;
			}
		}
		if (score == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	void showResult() {
	}

}