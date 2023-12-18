import java.util.Scanner;

public class Main {
	public static int Factrial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * Factrial(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] x = new double[N];
		double[] y = new double[N];
		double sum = 0;
		int n = Factrial(N);
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}

		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				sum += Math.sqrt(Math.pow((x[i] - x[j]), 2) + Math.pow((y[i] - y[j]), 2));
			}
		}

		System.out.println(sum * (n / (N * (N - 1)) * (n / N) * 2) / n);
		System.out.println(sum);
		sc.close();
	}
}