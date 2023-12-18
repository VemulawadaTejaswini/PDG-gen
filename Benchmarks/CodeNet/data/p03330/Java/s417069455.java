import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] d = new int[c][c];
		for (int i = 0 ; i < c ; i++) {
			for (int j = 0 ; j < c ; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		int[][] cs = new int[n][n];
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n ; j++) {
				cs[i][j] = sc.nextInt();
			}
		}
		int[][] patterns = new int[3][c*(c-1)*(c-2)];
		int cnt = 0;
		for (int i = 1 ; i <= c ; i++) {
			for (int j = 1 ; j <= c ; j++) {
				for (int k = 1 ; k <= c ; k++) {
					if(i != j && j != k && i != k) {
						patterns[0][cnt] = i;
						patterns[1][cnt] = j;
						patterns[2][cnt] = k;
						cnt++;
					}
				}
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0 ; i < c*(c-1)*(c-2) ; i++) {
			int tmp = 0;
			for (int j = 0 ; j < n ; j++) {
				for (int k = 0 ; k < n ; k++) {
					if (cs[k][j] != patterns[(j+k)%3][i]) {
						tmp += d[cs[k][j]-1][patterns[(j+k)%3][i]-1];
						if (tmp > min) break;
					}
				}
			}
			if (tmp < min) min = tmp;
		}
		System.out.println(min);
	}
}
