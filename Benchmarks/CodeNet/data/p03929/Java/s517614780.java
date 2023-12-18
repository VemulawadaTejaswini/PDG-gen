import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int[][] field = new int[11][5];
		int base = (7 * 9 + 6 * 3) % 11;
		int[] sums = new int[11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					if (j == 0) {
						field[i][j] = base;
					} else {
						field[i][j] = (field[i][j - 1] + 9) % 11;
					}
				} else {
					field[i][j] = (field[i - 1][j] + 63) % 11;
				}
				sums[field[i][j]]++;
			}
		}
		int n = sc.nextInt() - 2;
		int k = sc.nextInt();
		long total = sums[k] * (n / 11);
		n %= 11;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				if (field[i][j] == k) {
					total++;
				}
			}
		}
		System.out.println(total);
	}
}
