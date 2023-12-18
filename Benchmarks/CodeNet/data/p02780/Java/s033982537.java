import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		double max = 0;
		double sum = 0;
		for (int j = 0; j < K; j++) {
			sum += input[j] * 0.5 + 0.5;
		}
		for (int i = 1; i < N - K + 1; i++) {
			sum -= input[i - 1]* 0.5 + 0.5;
			sum += input[i + K - 1]* 0.5 + 0.5;
			if (sum > max) {
				max = sum;
			}
		}
		System.out.print(max);
	}
}