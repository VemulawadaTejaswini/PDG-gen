import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	// TLE
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int players = sc.nextInt();
			int[][] match = new int[players][players - 1];
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < players; i++) {
				set.add(i);
				for (int j = 0; j < players - 1; j++) {
					match[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			int[] ex = new int[players];
			while (true) {
				boolean[] today = new boolean[players];
				boolean possible = false;
				Set<Integer> endset = new HashSet<>();
				for (int i : set) {
					if (today[i] == true) {
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
							endset.add(i);
						}
						if (ex[pair - 1] == players - 1) {
							endset.add(pair - 1);
						}
					}
				}
				set.removeAll(endset);
				if (possible) {
					count++;
				} else {
					break;
				}
				if (set.isEmpty()) {
					break;
				}
			}
			if (set.isEmpty()) {
				System.out.println(count);
			} else {
				System.out.println(-1);
			}
		}
	}
}
