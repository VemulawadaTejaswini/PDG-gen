import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		double sum = 0;
		for (int i = 1; i <= N; i++) {
			double x = 1;
			while (i * x < K) {
				x *= 2;
			}
			sum += (1 / x);
		}
		System.out.println(sum / N);
	}
}
