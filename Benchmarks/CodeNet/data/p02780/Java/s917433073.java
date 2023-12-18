import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		// 期待値計算
		double[] p = new double[N];
		double[] expects = new double[N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextDouble();
			expects[i] = (1.0+p[i])/2;
		}

		// 累積和計算
		double[] S = new double[N];
		for (int i = 0; i < expects.length; i++) {
			if(i==0) {
				S[i] = expects[i];
			} else {
				S[i] = S[i-1] + expects[i];
			}
		}

		// 最大期待値の計算
		double max = 0;
		for (int i = 0; i < S.length - K; i++) {

			double j = S[i+K] - S[i];
			if(j > max) {
				max = j;
			}
		}
		System.out.println(max);
	}
}