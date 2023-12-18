import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();

		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;//それぞれの距離の二乗
		int judgeSum = 0;//距離が整数なものの合計
		int[][] x = new int[n][d];
		for (i = 0; i < n; i++) {
			for (j = 0; j < d; j++) {//x
				x[i][j] = s.nextInt();
			}
			if (i != 0) {
				for (k = 0; k < i; k++) {//
					sum = 0;
					if (i != k) {
						//各要素を二乗して足す
						for (int m = 0; m < d; m++) {
							int sa = x[i][m] - x[k][m];
							int jijou = sa * sa;
							sum += jijou;
						}
					}
					double dSqrt= Math.sqrt(sum);
					if(dSqrt == (int)dSqrt) {
					judgeSum += 1;
					}
				}

			}
		}

		System.out.println(judgeSum);

	}

}
