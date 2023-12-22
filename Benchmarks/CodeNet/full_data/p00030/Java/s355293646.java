import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {
			count = 0;
			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int s = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			solve(0, n, s);
			System.out.println(count);
		}
	}

	// p: 算入する数字
	// n: 算入する数字の数
	// s: 目標の合計値
	static void solve(int p, int n, int s) {
		if (p > 9 || n == 0) {
			return;
		}
		if (n == 1 && p == s) {
			count++;
		}
		solve(p + 1, n - 1, s - p);
		solve(p + 1, n, s);
	}
}