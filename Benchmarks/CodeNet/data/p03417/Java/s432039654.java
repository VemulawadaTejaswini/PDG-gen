
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] card = new long[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				card[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; i++) {
				if(i > 0) {
					if(j > 0) {
						card[i - 1][j - 1]++;
					}
					card[i - 1][j]++;
					if(j < n) {
						card[i - 1][j + 1]++;
					}
				}
				if(j > 0) {
					card[i][j - 1]++;
				}
				card[i][j]++;
				if(j < n) {
					card[i][j + 1]++;
				}
				if(i < n) {
					if(j > 0) {
						card[i + 1][j - 1]++;
					}
					card[i + 1][j]++;
					if(j < n) {
						card[i + 1][j + 1]++;
					}
				}
			}
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(card[i][j] % 2 == 1)
					ans++;
			}
		}
		System.out.println(ans);
	}

}
