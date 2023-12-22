import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, S;
	static int[] c = new int[101];

	static int solve() {
		int ret = 0;
		for (int i = 1; i <= 100; ++i) {
			for (int j = i; j <= 100; ++j) {
				if (i + j <= S) continue;
				if (i == j) {
					ret += c[i] * (c[i] - 1);
				} else {
					ret += c[i] * c[j];
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			S = sc.nextInt();
			Arrays.fill(c, 0);
			for (int i = 0; i < N; ++i) {
				c[sc.nextInt()]++;
			}
			System.out.println(solve());
		}
	}

}