
import java.util.Arrays;
import java.util.Scanner;

class Main {
	double[][] p = new double[2][6];

	void run() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 6; ++j) {
				p[i][j] = sc.nextDouble() / 100;
			}
		}
		double[] prob = new double[2];
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 6; ++j) {
				prob[i] += p[i][j] * Math.max(p[i][j], p[i ^ 1][j]) / (p[i][j] + p[i ^ 1][j]);
			}
		}
		System.out.println(Math.max(prob[0], prob[1]));
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}