import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 
		sc.nextLine();
		int[] nums = new int[n];
		int money = 1000;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			if (j+1 == n) {
				money = money + cnt * nums[j];
				continue;
			}
			if (nums[j] < nums[j+1]) {
				// 明日高ければ売って買う
				if (cnt != 0) {
					money = money + cnt * nums[j];
					cnt = 0;
					money = money - cnt * nums[j];
					cnt = money / nums[j];
				} else {
					cnt = money / nums[j];
					money = money - cnt * nums[j];
				}
			} else if (j != 0 && nums[j] > nums[j-1]) {
				// 昨日より高いので売る
				money = money + cnt * nums[j];
				cnt = 0;
			}
		}
		
		System.out.println(money);
	}
}
