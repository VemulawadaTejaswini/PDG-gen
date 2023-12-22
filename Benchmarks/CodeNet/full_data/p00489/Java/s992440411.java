import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int team[];
		int ranking[];
		int rankNumber;
		int maxIndex;

		n = sc.nextInt();
		team = new int[n];
		ranking = new int[n];
		rankNumber = 1;
		maxIndex = 0;
		for (int i = 0; i < n * (n - 1) / 2; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			int m = sc.nextInt();
			if (m < l) {
				team[j - 1] += 3;
			} else if (l == m) {
				team[j - 1] += 1;
				team[k - 1] += 1;
			} else {
				team[k - 1] += 3;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (team[maxIndex] < team[j]) {
					maxIndex = j;
				}
			}
			ranking[maxIndex] = rankNumber++;
			team[maxIndex] = -1;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(ranking[i]);
		}
	}
}