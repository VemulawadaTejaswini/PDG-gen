import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //個数
		int total = in.nextInt(); //許容量
		int[] v = new int[n];//価値
		int[] w = new int[n];//重さ
		for (int i = 0; i < n; i++) {
			v[i] = in.nextInt();
			w[i] = in.nextInt();
		}
		int[][] t = new int[n + 1][n * 100 + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n * 100 ; j++) {
				t[i][j]=total+1;
			}
		}
		t[0][0] = 0;
		t[0][v[0]] = w[0];
		int sum=v[0];
		for (int i = 1; i < n; i++) {//品物１こずつループ
			sum+=v[i];
			for (int j = 0; j <= sum; j++) {
				if (v[i] > j) {
					t[i][j] = Math.min(t[i - 1][j], w[i]);
				} else {
					if (t[i - 1][j - v[i]] + w[i] > total) {
						//許容量こえたとき
						t[i][j] = t[i - 1][j];
					} else {
						t[i][j] = Math.min(t[i - 1][j], t[i - 1][j - v[i]] + w[i]);
					}
				}
				//System.out.printf("t[%d][%d]=%d\n", i, j, t[i][j]);
			}
		}
		int rtn=0;
		for (int i = n * 100; i >= 0; i--) {
			if (t[n - 1][i] > 0 && t[n - 1][i] <= total) {
				rtn=i;
				break;
			}
		}
		System.out.println(rtn);
		in.close();
	}
}

