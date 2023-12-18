import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int [] value = new int[n];
		int [] cost = new int[n];
		int [] profit = new int[n];
		int total_profit = 0;

		for(int i = 0; i < n; i++) {
			value[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			profit[i] = value[i] - cost[i];
			if(profit[i] >= 0) {
				total_profit += profit[i];
			}
		}

		System.out.println(total_profit);
	}
}