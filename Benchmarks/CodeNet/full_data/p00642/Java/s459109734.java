import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static double[] exp = new double[100001];

	public static void main(String[] args) {
		precalc();
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			System.out.println(solve());
		}
	}

	static double solve() {
		return exp[N];
	}

	static void precalc() {
		int pos = 0;
		double[][] prob = new double[2][101];
		double[][] v = new double[2][101];
		prob[pos][0] = 1;
		double[] success = new double[101];
		success[0] = 1;
		for (int i = 1; i < success.length; ++i) {
			success[i] = success[i - 1] / 2;
		}
		for (int i = 0; i <= 100000; ++i) {
			double sum = 0;
			Arrays.fill(prob[1 - pos], 0);
			Arrays.fill(v[1 - pos], 0);
			for (int j = 0; j < 100; ++j) {
				sum += v[pos][j];
				prob[1 - pos][j + 1] += prob[pos][j] * success[j];
				prob[1 - pos][0] += prob[pos][j] * (1 - success[j]);
				v[1 - pos][j + 1] += (v[pos][j] + prob[pos][j]) * success[j];
				v[1 - pos][0] += v[pos][j] * (1 - success[j]);
			}
			exp[i] = sum;
			pos = 1 - pos;
		}
	}

}