
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		while (true) {
			String line = reader.readLine();
			if (line.equals("0 0 0 0")) {
				break;
			}
			int[] num = new int[4];
			StringTokenizer tokenizer = new StringTokenizer(line);
			for (int i = 0; i < 4; i++) {
				num[i] = Integer.parseInt(tokenizer.nextToken());
			}
			boolean flag = false;
			loop: for (int i = 0; i < 4; i++) {
				for (int j = i + 1; j < i + 4; j++) {
					for (int k = 0; k < 4; k++) {
						if (i == k || j % 4 == k) {
							continue;
						}
						for (int l = 0; l < 1; l++) {
							if (check(num[i], num[j % 4], num[k], num[6 - (i
									+ j % 4 + k)])) {
								flag = true;
								break loop;
							}
						}
					}

				}
			}
			if (!flag) {
				System.out.println(0);
			}
		}

	}

	private static boolean check(int a, int b, int c, int d) {
		char[] chs = { '+', '-', '*' };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cal(cal(cal(a, chs[i], b), chs[j], c), chs[k], d) == 10) {
						System.out.println(String.format(
								"(((%d %s %d) %s %d) %s %d)", a, chs[i], b,
								chs[j], c, chs[k], d));
						return true;
					} else if (cal(cal(a, chs[i], b), chs[j], cal(c, chs[k], d)) == 10) {
						System.out.println(String.format(
								"((%d %s %d) %s (%d %s %d))", a, chs[i], b,
								chs[j], c, chs[k], d));
						return true;
					}
				}
			}
		}
		return false;
	}

	private static int cal(int a, char c, int b) {
		switch (c) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		default:
			return a * b;
		}
	}
}