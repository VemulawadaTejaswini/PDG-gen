import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			boolean[][] sche = new boolean[n][31];
			for (int i = 0; i < n; i++) {
				int days = sc.nextInt();
				for (int j = 0; j < days; j++) {
					int d = sc.nextInt();
					sche[i][d] = true;
				}
			}

			ArrayList<Integer>[][] dp = new ArrayList[n][31];
			adjust: for (int day = 1; day < dp[0].length; day++) {
				for (int child = 0; child < dp.length; child++) {
					if (day == 1) {
						dp[child][day] = new ArrayList<Integer>();
					} else {
						dp[child][day] = new ArrayList<Integer>(
								dp[child][day - 1]);
					}

					for (int person = 0; person < sche.length; person++) {
						if (sche[person][day]
								&& !dp[child][day].contains(person)) {
							dp[child][day].add(person);
						}
					}

					if (dp[child][day].size() == n) {
						System.out.println(day);
						break adjust;
					}
				}
			}

		}
	}
}