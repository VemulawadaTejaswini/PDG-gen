import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int p[] = new int[N];
		double expectedValue[] = new double[N];

		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			expectedValue[i] = (double)(0.5*p[i]*(p[i]+1))/p[i];
		}

		double maxValue = Double.MIN_VALUE;
		for (int i = 0; i <N; i++) {
			double tmp = 0;
			if (K + i <= N) {
				for (int j = i; j < K + i; j++) {
					tmp += expectedValue[j];
				}
			}
			if (maxValue < tmp) maxValue = tmp;
		}

		System.out.println(maxValue);
	}
}