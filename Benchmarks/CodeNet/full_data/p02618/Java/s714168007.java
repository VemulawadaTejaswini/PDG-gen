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

	int D;
	int[] c;
	int[][] s;
	int[] last;

	Main(BufferedReader in) throws IOException {
		D = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		c = new int[tokens.length];
		for (int i = 0; i < tokens.length; ++i) {
			c[i] = Integer.parseInt(tokens[i]);
		}
		s = new int[D][c.length];
		for (int i = 0; i < D; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < tokens.length; ++j) {
				s[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		last = new int[c.length];
		Arrays.fill(last, 0);
	}

	int sub(int day, int contest, int prevDayContest) {
		int result = s[day][contest];
		int minus = 0;
		for (int i = 0; i < c.length; ++i) {
			if (i != contest) {
				if (i != prevDayContest) {
					minus += (day - last[i]) * c[i];
				} else {
					minus += c[i];
				}
			}
		}
		return result - minus;
	}

	int sub(int day, int contest) {
		int result = s[day][contest];
		int minus = 0;
		for (int i = 0; i < c.length; ++i) {
			if (i != contest) {
				minus += (day - last[i]) * c[i];
			}
		}
		return result - minus;
	}

	int sub(int day) {
		int result = -1;
		int max = Integer.MIN_VALUE;
		if (day == D - 1) {
			// 最も得られる満足度が高いものを選ぶ
			for (int contest = 0; contest < c.length; ++contest) {
				int effort = sub(day, contest);
				if (max < effort) {
					result = contest;
					max = effort;
				}
			}
		} else {
			// 2日読む
			for (int contest = 0; contest < c.length; ++contest) {
				int effort1 = sub(day, contest);
				for (int j = 0; j < c.length; ++j) {
					int effort2 = sub(day, j, contest);
					if (max < effort1 + effort2) {
						result = contest;
						max = effort1 + effort2;
					}
				}
			}
		}

		return result;
	}

	void calc() {
		// まずは最大のSを選ぶことにする
		for (int i = 0; i < D; ++i) {
			int r = sub(i);
			if (r >= 0) {
				System.out.println((r + 1));
				last[r] = i;
			} else {
				System.out.println("1");
				last[0] = i;
			}

		}
	}

	void showResult() {
	}
}