import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] value = new int[n];
		for (int i = 0; i < value.length; i++) {
			value[i] = sc.nextInt();
		}

		new Main().execute(n, value);
	}

	private void execute(int n, int[] value) {
		long money = 1000;
		long kabu = 0;
		for (int i = 0; i < value.length - 1; i++) {
			int todayVal = value[i];
			int tommorowVal = value[i + 1];
			if (todayVal < tommorowVal) {
				// 買う
				kabu += money / todayVal;
				money = money % todayVal;
			} else if (todayVal > tommorowVal && kabu > 0) {
				// 売る
				money += todayVal * kabu;
				kabu = 0;
			}
		}
		// 最終日
		money += value[value.length - 1] * kabu;
		System.out.println(money);
	}
}