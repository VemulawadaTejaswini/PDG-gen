import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num = stdin.nextInt();
		int[] x = new int[num + 2];
		int allCost = 0;
		int prev = 0;
		for (int i = 1; i <= num; i++) {
			x[i] = stdin.nextInt();
			allCost += Math.abs(x[i] - prev);
			prev = x[i];
		}
		allCost += Math.abs(prev);

		for (int i = 1; i <= num; i++) {
			int cost = allCost - Math.abs(x[i] - x[i - 1]) - Math.abs(x[i + 1] - x[i]) + Math.abs(x[i + 1] - x[i - 1]);
			System.out.println(cost);
		}
	}

}
