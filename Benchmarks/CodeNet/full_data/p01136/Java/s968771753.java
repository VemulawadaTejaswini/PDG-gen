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
					if (sche[child][day]) {
						if (day == 1) {
							// 1日目ならとりあえず新しく作る
							dp[child][day] = new ArrayList<Integer>();
							dp[child][day].add(child);
						} else {
							for (int past = day - 1; past >= 1; past--) {
								// 前に地図をゲットしてたら引き継ぐ
								if (sche[child][past]) {
									dp[child][day] = new ArrayList<Integer>(
											dp[child][past]);
									break;
								}

								// 前にゲットしてなかったら新しく作る
								if (past == 1) {
									dp[child][day] = new ArrayList<Integer>();
									dp[child][day].add(child);
								}
							}
						}
					}
				}

				for (int child = 0; child < dp.length; child++) {
					if (sche[child][day]) {
						for (int person = 0; person < sche.length; person++) {
							// 集まれる人から地図をもらう
							if (sche[person][day]) {
								for (int map : dp[person][day]) {
									if (!dp[child][day].contains(map)) {
										dp[child][day].add(map);
									}
								}
							}
						}
						if (dp[child][day].size() == n) {
							System.out.println(day);
							break adjust;
						}
					}
				}
				if (day == dp[0].length - 1) {
					System.out.println(-1);
				}
			}

		}
	}
}