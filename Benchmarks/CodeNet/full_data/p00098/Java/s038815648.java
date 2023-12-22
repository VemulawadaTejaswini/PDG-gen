import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int subsum[][] = new int[n][n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int k = sc.nextInt();
				max = Math.min(max, k);
				if (i == 0 && j == 0) {
					subsum[i][j] = k;
				} else if (i == 0) {
					subsum[i][j] = subsum[i][j - 1] + k;
				} else if (j == 0) {
					subsum[i][j] = subsum[i - 1][j] + k;
				} else {
					subsum[i][j] = subsum[i - 1][j] + subsum[i][j - 1] - subsum[i - 1][j - 1] + k;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = i; k < n; k++) {
					for (int l = j; l < n; l++) {
						int tmp1, tmp2, tmp3;
						tmp1 = tmp2 = tmp3 = 0;
						if (0 < i && 0 < j) {
							tmp1 = subsum[i - 1][j - 1];
						}
						if (0 < i) {
							tmp2 = subsum[i - 1][l];
						}
						if (0 < j) {
							tmp3 = subsum[k][j - 1];
						}
						max = Math.max(max, subsum[k][l] - tmp2 - tmp3 + tmp1);
					}
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args){
		new Main().run();
	}
}