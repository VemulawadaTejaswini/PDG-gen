import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double minSum = Double.MAX_VALUE;
		double nowSum = 0;
		boolean primeFlg = true;;

		for (int i = 1; i <= Math.sqrt(N); i++) {
			for (int j = i; j <= Math.sqrt(N); j++) {
				nowSum = i + j;
				if (i * j == N) {
					minSum = Math.min(minSum, nowSum);
					primeFlg = false;
				}
			}
		}

		if (primeFlg) {
			System.out.println(Math.round(N - 1));
		} else {
			System.out.println(Math.round(minSum - 2));
		}
	}
}
