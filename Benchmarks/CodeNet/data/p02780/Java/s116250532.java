import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		double max = 0;
		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			nums.add(scan.nextInt());
		}

		double result = 0;
		for (int i = 0; i < K; i++) {
			result += nums.get(i);
		}

		for (int i = 1; i <= N - K; i++) {
			result = result - nums.get(i - 1) + nums.get(i + K - 1);
			if (max < result) max = result;
		}

		System.out.printf("%.6f", (max + K) / 2.0000);
	}
}