import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(calcMaximumProfit());
	}

	static int calcMaximumProfit() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			int a = scanner.nextInt();
			max = Integer.max(max, a - min);
			min = Integer.min(min, a);
		}
		scanner.close();
		return max;
	}

}

