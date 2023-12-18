
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][][] ans = new double[n+1][n+1][n+1];

		for (int k=0;k<=n;k++) {
			for (int j=0;j<=n-k;j++) {
				for (int i=0;i<=n-k-j;i++) {
					if (i>0) {
						ans[i][j][k]+=((double)i/(i+j+k)*(ans[i-1][j][k]));
					}
					if (j>0) {
						ans[i][j][k]+=((double)j/(i+j+k)*(ans[i+1][j-1][k]));
					}
					if (k>0) {
						ans[i][j][k]+=((double)k/(i+j+k)*(ans[i][j+1][k-1]));
					}
					if (i+j+k>0) {
						ans[i][j][k]+=(double)n/(i+j+k);
					}
				}
			}
		}
		
		int[] init = new int[4];
		for (int i=0;i<n;i++) {
			init[sc.nextInt()]++;
		}
		
		System.out.println(ans[init[1]][init[2]][init[3]]);
	}

}
