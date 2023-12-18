import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int players = sc.nextInt();
			int[][] match = new int[players][players - 1];
			for (int i = 0; i < players; i++) {
				for (int j = 0; j < players - 1; j++) {
					match[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			int[] ex = new int[players];
			boolean possible = true;
			int goal = 0;
			boolean[] today = new boolean[players];
			while (possible) {
				today = new boolean[players];
				possible = false;
				for (int i = 0; i < players - 1; i++) {
					if (today[i] == true || ex[i] == players - 1) {
						continue;
					}
					int pair = match[i][ex[i]];
					if (today[pair - 1] == true) {
						continue;
					}
					if (match[pair - 1][ex[pair - 1]] == i + 1) {
						ex[i]++;
						ex[pair - 1]++;
						today[i] = true;
						today[pair - 1] = true;
						possible = true;
						if (ex[i] == players - 1) {
							goal++;
						}
						if (ex[pair - 1] == players - 1) {
							goal++;
						}
					}
				}
				if (possible) {
					count++;
				}
				if (goal == players) {
					break;
				}
			}
			if (goal == players) {
				System.out.println(count);
			} else {
				System.out.println(-1);
			}
		}
	}
}
