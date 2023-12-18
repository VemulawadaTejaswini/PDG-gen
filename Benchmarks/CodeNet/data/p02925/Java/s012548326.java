import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[][] a = new int[n + 1][n];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - 1; j++) {
				a[i][j] = Integer.parseInt(sc.next());
			}
		}

		int day = 0;
		int[] game = new int[n + 2];
		Arrays.fill(game, 1);
		boolean end = false;
		while (!end) {
			boolean[] played = new boolean[n + 2];
			end = true;
			for (int i = 1; i <= n; i++) {
				if (played[i]) {
					continue;
				} else {
					if (game[i] == n) {
						played[i] = true;
						continue;
					}
					int teki_i = a[i][game[i]];
					int teki_g = game[teki_i];
					if (a[teki_i][teki_g] == i && played[teki_i] == false) {
						played[i] = true;
						played[teki_i] = true;
						game[i]++;
						game[teki_i]++;
						end = false;
					}
				}
			}
			day++;
		}

		boolean comp = true;
		for (int i = 1; i <= n; i++) {
			//			System.out.print(game[i] + " ");
			if (game[i] != n + 1) {
				comp = false;
				break;
			}
		}
		if (comp) {
			System.out.println(day - 1);
		} else {
			System.out.println(-1);
		}
		sc.close();
	}
}