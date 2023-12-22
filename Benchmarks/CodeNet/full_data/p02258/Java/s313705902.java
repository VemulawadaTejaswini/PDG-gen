import java.util.Scanner;

public class Main {
	public static int maximumProfit(int price[], int n) {
		int min = price[0];
		int max = price[1] - price[0];
		for (int i = 1; i < n; i++) {
			if (max < price[i] - min) {
				max = price[i] - min;
			}
			if (min > price[i]) {
				min = price[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] price = new int[n];

		for (int i = 0; i < n; i++) {
			price[i] = scanner.nextInt();
		}
		int max = maximumProfit(price, n);
		System.out.println(max);
		scanner.close();

	}

}
