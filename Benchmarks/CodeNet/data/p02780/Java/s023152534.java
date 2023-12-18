import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		double answer = 0;
		List<Double> expected = new ArrayList<>();
		List<Double> results = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			double num = scan.nextDouble();
			expected.add((1 + num) / 2);
		}

		double result = 0;
		for (int i = 0; i < K; i++) {
			result += expected.get(i);
		}
		results.add(result);

		for (int i = 1; i <= N - K; i++) {
			result = results.get(i - 1) - expected.get(i - 1) + expected.get(i + K - 1);
			results.add(result);
			if (answer < result) answer = result;
		}

		System.out.println(String.format("%.8f", answer));
	}
}