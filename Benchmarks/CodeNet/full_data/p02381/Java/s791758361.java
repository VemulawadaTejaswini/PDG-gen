import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int sum = 0;
			int squareSum = 0;
			for (int i = 0; i < n; ++i) {
				int s = sc.nextInt();
				sum += s;
				squareSum += s * s;
			}
			double avg = (double)sum / n;
			double squareAvg = (double)squareSum / n;
			// v(x) = avg(x ^ 2) - avg(x) ^ 2;
			double variance = squareAvg - avg * avg;
			double stdev = Math.sqrt(variance);
			System.out.println(stdev);
		}
	}
}
