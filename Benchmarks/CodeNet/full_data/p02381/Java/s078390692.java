import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] scores = new int[n];
			int i;
			for (i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			double average = 0, variance = 0;
			int sum = 0;
			for (i = 0; i < n; i++) {
				sum += scores[i];
			}
			average = sum / n;
			int wa = 0;
			for (i = 0; i < n; i++) {
				wa += (scores[i] - average) * (scores[i] - average);
			}
			variance = wa / n;
			System.out.println(Math.sqrt(variance));
		}
	}
}