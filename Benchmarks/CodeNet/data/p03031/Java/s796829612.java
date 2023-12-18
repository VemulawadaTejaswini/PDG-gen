import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ks = new int[m][n];
		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				ks[i][sc.nextInt() - 1] = 1;
			}
		}
		int[] p = new int[m];
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < (1 << n); i++) {
			boolean exist = true;
			for (int j2 = 0; j2 < ks.length; j2++) {
				int count = 0;
				for (int k = 0; k < ks[j2].length; k++) {
					if (ks[j2][k] == 1) {
						if ((1 & i >> k) == 1) {
							count++;
						}
					}
				}
				if (count % 2 != p[j2]) {
					exist = false;
					break;
				}
			}
			if (exist) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
