import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//8パターン考える
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long[][] cakes = new long[n][3];
		long[][] sums = new long[4][n];
		long ans = 0;
		for(int i=0; i < n; i++) {
			cakes[i][0] = scanner.nextLong();
			cakes[i][1] = scanner.nextLong();
			cakes[i][2] = scanner.nextLong();
		}
		for(int r = 0; r < n; r++) {
			sums[0][r] = cakes[r][0] + cakes[r][1] + cakes[r][2];
			sums[1][r] = cakes[r][0] + cakes[r][1] - cakes[r][2];
			sums[2][r] = cakes[r][0] - cakes[r][1] + cakes[r][2];
			sums[3][r] = cakes[r][0] - cakes[r][1] - cakes[r][2];
//			sums[4][r] = -cakes[r][0] + cakes[r][1] + cakes[r][2];
//			sums[5][r] = -cakes[r][0] + cakes[r][1] - cakes[r][2];
//			sums[6][r] = -cakes[r][0] - cakes[r][1] + cakes[r][2];
//			sums[7][r] = -cakes[r][0] - cakes[r][1] - cakes[r][2];
		}
		Arrays.sort(sums[0]);
		Arrays.sort(sums[1]);
		Arrays.sort(sums[2]);
		Arrays.sort(sums[3]);
//		Arrays.sort(sums[4]);
//		Arrays.sort(sums[5]);
//		Arrays.sort(sums[6]);
//		Arrays.sort(sums[7]);
		for(int k = 0; k < 4; k++) {
			long tmp = 0;
			for(int l = 0; l < m; l++) {
				tmp -= sums[k][l];
			}
			if(tmp > ans) ans = tmp;
		}
		
		for(int k = 0; k < 4; k++) {
			long tmp2 = 0;
			for(int l = n-1; l > n-m-1; l--) {
				tmp2 += sums[k][l];
			}
			if(tmp2 > ans) ans = tmp2;
		}
		System.out.println(ans);
	}
}