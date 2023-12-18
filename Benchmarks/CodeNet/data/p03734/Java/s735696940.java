import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		long a[][][] = new long[N][N*3+1][N];
		long w[] = new long[N];
		long v[] = new long[N];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}
		if (w[0] >= W) {
			System.out.println(0);
			return;
		}
		a[0][0][0] = v[0];
		for (int i = 1; i < N; i++) {
			if (w[i] <= W) {
				a[0][(int) (w[i] - w[0])][i] = Math.max(v[i], a[0][(int) (w[i] - w[0])][i-1]);
			}
//			if (w[0]==2) {
//				if (w[i]>=4) {
//					a[1][(int) (w[i] - w[0])-2][i] = Math.max(a[0][(int) (w[i] - w[0])][i], a[1][(int) (w[i] - w[0])-2][i-1]);
//					a[0][(int) (w[i] - w[0])][i] = Math.max(a[0][(int) (w[i] - w[0])][i], a[1][(int) (w[i] - w[0])-2][i-1]);
//				}
//			} else if (w[0]==1) {
//
//			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N*3+1; k++) {
					if (a[j][k][i - 1] > 0) {
						long nowW = (j + 1) * w[0] + k;
						if (nowW + w[i] <= W) {
							a[j + 1][k + (int) (w[i] - w[0])][i] = Math.max(a[j][k][i - 1] + v[i],
									a[j + 1][k + (int) (w[i] - w[0])][i]);
						}
						a[j][k][i] = Math.max(a[j][k][i - 1], a[j][k][i]);
					}
				}
			}
		}
		long max = 0;
		for (int i=0;i<N;i++) {
			for (int k = 0; k < N*3+1; k++) {
				if (a[i][k][N-1]>max) {
					max = a[i][k][N-1];
				}
			}
		}
		System.out.println(max);

	}
}