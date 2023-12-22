import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value_num = sc.nextInt();
		int[] values = new int[value_num];
		for (int i = 0; i < value_num; i++) {
			values[i] = sc.nextInt();
		}

		int max_profit = Integer.MIN_VALUE;
		int lowest_value = values[0];
		for (int i = 1; i < values.length; i++) {
			max_profit = Math.max(max_profit, values[i] - lowest_value);
			lowest_value = Math.min(lowest_value, values[i]);
		}
		System.out.println(max_profit);
	}
}

